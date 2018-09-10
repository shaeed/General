package Mis;

public class MysqlTest {
	public static void main(String[] args) {
		
		String st = "12345asdaa1234asds123";
		System.out.println(st);
		if(st.matches("(\\w+)")) {
			System.out.println("Matched");
		} else {
			System.out.println("Failed");
		}
	}
}
