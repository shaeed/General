package Mis;

public class InnerClassTest {
	public static void main(String[] args) {
		A a = new A("khan");
		
		Object abc = a.testInner();
		
		class innerA{
			String b;
		}
		
		innerA test = (innerA) abc;
		System.out.println(test.b);
	}
}

class A {
	String a;
	
	A(String a){
		this.a = a;
	}
	
	Object testInner() {
		class innerA {
			String b;
		}
		
		innerA abc = new innerA();
		
		abc.b = a + " shaeed";
		
		return abc;
	}
}
