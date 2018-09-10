
public class JavaMain {
	public static void main(String[] args) {
		NativeMethods nm = new NativeMethods();
		System.out.println("Calling native method");
		nm.helloNative();
		System.out.println("Native method call finished");
	}
	
	//Load the native library before the native method call
	static {
		System.setProperty("java.library.path", "D:\\Shaeed\\Sync\\MyProjects\\EclipseWorkspaceMars\\JNIIntro\\src");
		//System.loadLibrary("NnativeLib.so");
		System.loadLibrary("NnativeLib");
	}
}
