package Mis;

public class EnumTest {
	public static void main(String[] args) {
		Color clr = Color.Blue;
		System.out.println(clr);
		
		System.out.println("All the colors: ");
		for(Color clr2 : Color.values()) {
			System.out.print(clr2 + ", ");
		}
		System.out.println();
		
		Country cntry;
		System.out.println("All the countrys: ");
		for(Country cntry2 : Country.values()) {
			System.out.println(cntry2 + " " + cntry2.field1);
		}
		
		cntry = Country.India;
		System.out.println(cntry + "::" + cntry.field1);
		
		System.out.println(Color.Blue);
	}
}

enum Color {
	Red,
	Blue,
	Green
}

enum Country{
	India(1),
	America(2),
	UK(3);
	
	int field1;
	private Country(int c) {
		field1 = c;
	}
}
