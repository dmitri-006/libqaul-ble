use jni::objects::{JClass, JValue, JObject};
use jni::JNIEnv;

#[no_mangle]
#[allow(non_snake_case)]
pub extern "system" fn Java_net_qaul_libqaul_LibQaul_hello(
    env: JNIEnv,
    _calss: JClass,
) {
    let width = 100;
    let height = 100;
    let b_array = env.new_byte_array(width*height*3);
    // let array_obj:JObject = JObject::from(b_array);

    let class = env
        // .find_class("net/qaul/libqaul/LibQaul") // main->libqaul->main
        .find_class("net/qaul/ble/core/BleWrapperClass") // main->libqaul->blemodule
        .expect("Failed to load the target class");
    let result = env.call_static_method(class, "receiveRequest", "(II)V", &[
        JValue::from(width),
        JValue::from(height),
        // JValue::from(array_obj),
    ]);

    result.map_err(|e| e.to_string()).unwrap();
}