package hacker_earth.live;

import java.util.Scanner;

public class GeekyAliceNaughtyBob {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCases = input.nextInt();
		int a = 0;
		int b = 0;
		int factorial = 0;
		int prevFactorial = 0;
		int sum = 0;
		int[] fact = {1,1,2,6,6,3};
		
		while(testCases > 0){
			a = input.nextInt();
			b = input.nextInt();
			sum = 0;
			
			if(a>5 && b>5){
				sum = b - a + 1;
				sum *= 9;
			}
			else if(b > 5) {
				for (int i = a; i < 6; i++) {
					sum = sum + fact[i];
				}
				
				sum = b - a ;
				sum *= 9;
			}
			else {
				for (int i = a; i <= b; i++) {
					sum = sum + fact[i];
				}
			}
			
			System.out.println(sum);
			testCases--;
		}
	}
}
