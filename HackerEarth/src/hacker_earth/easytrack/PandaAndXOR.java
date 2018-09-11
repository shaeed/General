package hacker_earth.easytrack;

import java.util.Scanner;

public class PandaAndXOR {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arraySize = input.nextInt();
		int[] numbers = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			numbers[i] = input.nextInt();
		}
	}
}
