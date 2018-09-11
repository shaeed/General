package hacker_earth.practice;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class DigitalNumbers {
	static boolean zeroFlag = false;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		
		int l = 0;
		int m = 0;
		while(testCases > 0){
			l = input.nextInt();
			m = input.nextInt() / 7;
			
			int count = countNumbers(l, m);
			System.out.println(count);
			
			testCases--;
		}
	}

	private static int countNumbers(int l, int m) {
		//Length is 0 or invalid
		if(l < 1)
			return 0;
		
		int digitCount = 0;
		int numbers = 0;
		/*This array contains numbers of led required for a digit.
		  And a certain no of led form how many digits.          */
		int[][] digits = {{2,1},{3,1},{4,1},{5,3},{6,3},{7,1}};
		
		for (int i = 1; i <= l; i++) {
			//digitCount = numberOfPossibleDigits(i+1,m);
			
			if(m >= 49){
				numbers = getCombinations(zeroFlag, i, 10);
			}
			else {
				
			}
		}
		
		return 0;
	}

	private static int getCombinations(boolean zeroFlag2, int place, int digits) {
		if(place == 0)
			return 0;
		if(place == 1)
			return digits;
				
		int temp = digits;
		if(zeroFlag2)
			temp--;
		for (int i = 1; i < place; i++) {
			digits--;
			temp *= digits;
		}
		
		return temp;
	}

	private static int numberOfPossibleDigits(int i, int m) {
		zeroFlag = false;
		//All digits are possible
		if(m >= 49){
			zeroFlag = true;
			return 10;
		}
		
		//
		int temp = m;
		int[][] digits = {{2,1},{3,1},{4,1},{5,3},{6,3},{7,1}};
		
		return 0;
	}
}
