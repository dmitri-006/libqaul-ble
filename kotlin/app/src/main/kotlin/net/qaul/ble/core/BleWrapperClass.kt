package net.qaul.ble.core

open class BleWrapperClass() {

    /**
     * This Method get BLERequest from UI & Return BLEResponse by Callback Interface Method
     */
    open fun receiveRequest(data: ByteArray) {
        val charset = Charsets.UTF_8;
        println(data.toString(charset));
    }
}