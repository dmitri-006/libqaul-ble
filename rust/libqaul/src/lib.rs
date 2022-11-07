use jni::objects::JClass;
use jni::JNIEnv;

#[no_mangle]
#[allow(non_snake_case)]
pub extern "system" fn Java_net_qaul_libqaul_LibQaul_hello(
    env: JNIEnv,
    _calss: JClass,
) {
    let class = env
        // .find_class("net/qaul/libqaul/LibQaul") // main->libqaul->main
        .find_class("net/qaul/ble/core/BleWrapperClass") // main->libqaul->blemodule
        .expect("Failed to load the target class");
    let result = env.call_static_method(class, "receiveRequest", "()V", &[]);

    result.map_err(|e| e.to_string()).unwrap();
}