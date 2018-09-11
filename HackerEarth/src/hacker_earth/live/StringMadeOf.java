package hacker_earth.live;

import java.util.Scanner;

public class StringMadeOf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] number = input.next().toCharArray();
		
		int count = getDashesCount(number);
		System.out.println(count);
	}

	private static int getDashesCount(char[] number) {
		int length = number.length;
		int[] noOfDash = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			count += noOfDash[number[i]-48];
		}
		
		return count;
	}
}
