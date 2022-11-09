package net.qaul.libqaul

/// hello message from lib qaul
// dummy function for testing
external fun hello(): String

/// send an SYS message from BLE library to libqaul
external fun syssend(message: ByteArray)

/// receive an SYS message from libqaul to BLE library
external fun sysreceive(): ByteArray

/// load rust libqaul shared library
fun loadLibqaul() {
    System.loadLibrary("libqaul")
}