package net.qaul.qaul_app

// import the libqaul AAR android library
import net.qaul.libqaul.*

class MainActivity {
    public fun hello() : String {
        return hello();
    }

    public fun syssend(message: ByteArray) {
        return syssend(message);
    }
}

fun main() {
    println("Loading library ...");
    loadLibqaul();
    println("Loaded library successfully.");

    println("Calling hello()");
    var helloMsg = MainActivity().hello();
    println("Hello : " + helloMsg);

    println("Sending syssend()");
    val charset = Charsets.UTF_8
    val sysarr = "syssend Message".toByteArray(charset)
    MainActivity().syssend(sysarr);
    println("Sent syssend()");
}