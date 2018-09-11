package hacker_earth.live;

import java.util.Scanner;

public class FurnitureTransportation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n,i,m;
		n = input.nextInt();
		i = input.nextInt();
		m = input.nextInt();
		
		int[] fur = new int[n];
		for (int j = 0; j < n; j++) 
			fur[j] = input.nextInt();
		
		int count = 0;
		for (int j = 0; j < n; j++) {
			if(fur[j] <= i)
				count++;
		}
		
		int sum = count;
		count--;
		int temp = 1;
		while(temp < m){
			sum = sum * count;
			count--;
			temp++;
		}
		int sum2 = 1;
		while(m > 1){
			sum2 *= m;
			m--;
		}
		
		System.out.println(sum/sum2);
	}
}
