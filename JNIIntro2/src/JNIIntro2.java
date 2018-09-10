
public class JNIIntro2 {
	native void sayHello();
	
	//To load the native library
	static {
		System.loadLibrary("NativeLib"); //NativeLib.dll
	}
	
	public static void main(String[] args) {
		JNIIntro2 jni = new JNIIntro2();
		System.out.println("Calling native method-");
		jni.sayHello();
		System.out.println("Native method call finished");
	}
}
