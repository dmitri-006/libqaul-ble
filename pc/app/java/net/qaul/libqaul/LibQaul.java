package net.qaul.libqaul;

public class LibQaul {
    
    static {
        System.loadLibrary("libqaul");

        System.out.println("Loaded libqaul library.");
    }

    public static native void hello();

    public static void receiveRequest() {
        System.out.println("Called From FFI");
    }

}
