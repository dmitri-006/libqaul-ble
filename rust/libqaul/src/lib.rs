use jni::JNIEnv;
use jni::objects::{JClass, JValue, JObject, JString};
use jni::{JavaVM, InitArgsBuilder, JNIVersion, AttachGuard};
use jni::sys::{jstring, jarray, jbyteArray};

/// dummy function to test the functionality
#[no_mangle]
pub extern "system" fn Java_net_qaul_libqaul_LibqaulKt_hello(
  env: JNIEnv,
  _: JClass,
) -> jstring {
    // create a string
    let output = env
        .new_string(format!("Hello qaul!"))
        .expect("Couldn't create java string!");
    
    let BleWrapperClass = env
        .find_class("net/qaul/ble/core/BleWrapperClass")
        .expect("Failed to load the target class");
    let result = env.call_static_method(BleWrapperClass, "test_rust_call", "()V", &[]);
    result.map_err(|e| e.to_string()).unwrap();

    // return the raw pointer
    output.into_inner()
}

/// send a sys protobuf message from BLE module to libqaul
#[no_mangle]
pub extern "system" fn Java_net_qaul_libqaul_LibqaulKt_syssend(
    env: JNIEnv,
    _: JClass,
    message: jbyteArray,
) {
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
    
    let result = guard.call_static_method(BleWrapperClass, "static_receiveRequest", "([B)V", &[
        JValue::from(message)
    ]);
    
    result.map_err(|e| e.to_string()).unwrap();
    
// get the message out of java
    //let binary_message: Vec<u8> = env.convert_byte_array(message).unwrap();
    // send it to libqaul
    //super::send_sys(binary_message);
}

