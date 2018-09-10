package Mis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		new DateTest().encodeDate(null);
	}
	
	protected String encodeDate(String dt) {
		SimpleDateFormat sd = new SimpleDateFormat("d MMM, yy");
		Date dtl = new Date();
		System.out.println(dtl);
		String date = "01 Nov, 2017";
		try {
			Date dt2 = sd.parse(date);
			System.out.println(dt2);
			
			String dt3 = sd.format(dt2);
			System.out.println(dt3);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
}
