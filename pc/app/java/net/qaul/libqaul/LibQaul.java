package net.qaul.libqaul;

public class LibQaul {
    
    static {
        System.load("F:/Task/Rust/libqaul-ble/pc/app/jniLibs/libqaul.dll");
        // System.loadLibrary("libqaul");
    }

    public static native void hello();

    public static void receiveRequest() {
        System.out.println("Called From JNI");
    }

}
