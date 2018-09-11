package hacker_earth.live;

import java.util.Scanner;

public class PermutationAgain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		int n = 0;
		long sum = 0;
		long temp = 0;
		while (testCases > 0){
			sum = 0;
			n = input.nextInt();
			if(n%2 == 0){
				sum = n * n / 2;
				temp = n*(n+2)/8;
				sum = sum - temp;
			}
			else {
				sum = n * n / 2;
				temp = n*(n+2)/8;
				temp = temp*(temp-1)-temp*(n/2);
				sum = sum - temp;
				sum = sum - temp;
			}
				if (sum == 0) 
					System.out.println(1);
				else
					System.out.println(sum);
				
			testCases--;
		}
	}
}
