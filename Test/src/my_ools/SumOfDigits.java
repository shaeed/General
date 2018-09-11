package my_ools;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] number = input.next().toCharArray();
		int sum = 0;
		
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i] - 48;
		}
		System.out.println(sum);
	}
}
