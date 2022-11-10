#![cfg(target_os = "android")]
#![allow(non_snake_case)]

use jni::objects::{JClass, JString};
use jni::sys::{jstring, jbyteArray, jint};
use jni::JNIEnv;
use jni::{JavaVM, InitArgsBuilder, JNIVersion, AttachGuard};

#[no_mangle]
pub extern "system" fn Java_net_qaul_libqaul_LibqaulKt_hello(
    env: JNIEnv,
    _class: JClass,
) -> jstring {
    // create a string
    let output = env
        .new_string(format!("Hello qaul!"))
        .expect("Couldn't create java string!");
    
    // return the raw pointer
    output.into_inner()
}

/// # BLE Module Functions
/// 
/// Set's up the system protobuf communication pipelines
/// between libqaul and the BLE module library.

/// send a sys protobuf message from BLE module to libqaul
#[no_mangle]
pub extern "system" fn Java_net_qaul_libqaul_LibqaulKt_syssend(
    env: JNIEnv,
    _: JClass,
    message: jbyteArray,
) {
    // let command = 1;
    // // get the message out of java
    // let binary_message: Vec<u8> = env.convert_byte_array(message).unwrap();

    // let class = env
    //     .find_class("net/qaul/ble/core/BleWrapperClass") // main->libqaul->blemodule
    //     .expect("Failed to load the target class");
    // let result = env.call_static_method(class, "receiveRequest", "(I[B)V", &[
    //     JValue::from(command),
    //     JValue::from(binary_message),
    // ]);

    

    let jvm_args = InitArgsBuilder::new()
        .version(JNIVersion::V8)
        .option("-Xcheck:jni")
        .build()
        .unwrap();

    let jvm = JavaVM::new(jvm_args).unwrap();
    let guard:AttachGuard = jvm.attach_current_thread().unwrap();

    let BleWrapperClass = guard
        .find_class("net/qaul/ble/core/BleWrapperClass")
        .expect("Failed to load the target class");

    let binary_message: Vec<u8> = guard.convert_byte_array(message).unwrap();
    
    let result = guard.call_static_method(BleWrapperClass, "receiveRequest", "([B)V", &[
        JValue::from(message)
    ]);
    
    result.map_err(|e| e.to_string()).unwrap();

    // send it to libqaul
    // super::send_sys(binary_message);
}

/// receive a sys message on android from libqaul
#[no_mangle]
pub extern "system" fn Java_net_qaul_libqaul_LibqaulKt_sysreceive(
    env: JNIEnv,
    _: JClass,
) -> jbyteArray {
    // check if there is an RPC message
    if let Ok(message) = super::receive_sys() {
        // convert message to java byte array
        let byte_array = env.byte_array_from_slice(&message).unwrap();
        // return byte array
        return byte_array
    }
    
    // there is no message and we return an empty array
    let buf: [u8; 0] = [0; 0];
    let empty_array = env.byte_array_from_slice(&buf).unwrap();
    empty_array
}