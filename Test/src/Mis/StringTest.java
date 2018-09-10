package Mis;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String st = input.nextLine();
		System.out.println("Input: " + st);
		
		String[] stA = st.split("-p");
		System.out.println(Arrays.toString(stA));
	}
}
