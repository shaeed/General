package hacker_earth.live;

import java.util.Scanner;

public class TheMagic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		long n = 0;
		int days = 0;
		while(testCases > 0){
			n = input.nextInt();
			days = 0;
			while (n > 0){
				n -= findDays(n);
				days++;
			}
			System.err.println(days);
			
			testCases--;
		}
	}

	private static long findDays(long n) {
		if(n==1)
			return 1;
		
		long temp = 1;
		while(temp < n){
			temp *= 2;
		}
		if(n == temp)
			return temp;
		return temp/2;
	}
}
