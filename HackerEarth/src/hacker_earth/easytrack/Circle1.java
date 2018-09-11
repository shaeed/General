package hacker_earth.easytrack;

import java.util.Scanner;

public class Circle1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();

		int temp = 0;
		int[] circle1 = new int[2];
		int r1 = 0;
		int[] circle2 = new int[2];
		int r2 = 0;
		int n = 0;

		while(testCases > 0) {
			n = input.nextInt();
			circle1[0] = input.nextInt();
			circle1[1] = input.nextInt();
			circle2[0] = input.nextInt();
			circle2[1] = input.nextInt();
			r1 = 100000;
			for (int i = 0; i < n; i++) {
				temp = input.nextInt();
				if(temp < r1)
					r1 = temp;
			}
			r2 = 100000;
			for (int i = 0; i < n; i++) {
				temp = input.nextInt();
				if(temp < r2)
					r2 = temp;
			}

			double area = calculateArea(circle1, circle2, r1, r2);
			System.out.printf("%.2f\n",area);
			//System.out.println(area);
			testCases--;
		}
	}

	private static double calculateArea(int[] circle1, int[] circle2, int r1, int r2) {
		if(r1 <= 0 || r2 <= 0)
			return 0;

		//Distance between center of the circles
		double d = Math.sqrt((circle1[0]-circle2[0])*(circle1[0]-circle2[0]) + 
				(circle1[1]-circle2[1])*(circle1[1]-circle2[1]));

		//No intersection between circles
		if(d >= r1 + r2) {
			return 0;
		}

		//Circle2 is inside Circle1
		if(d <= r1 - r2) {
			return Math.PI * r2 * r2;
		}

		//Circle1 is inside Circle2
		if(d <= r2 - r1) {
			return Math.PI * r1 * r1;
		}
		
		//Some intersection exists
		double area1 = r2*r2 * Math.acos((d*d + r2*r2 - r1*r1) / (2 * d * r2));
		double area2 = r1*r1 * Math.acos((d*d + r1*r1 - r2*r2) / (2 * d * r1));
		double area3 = Math.sqrt((r1+r2-d)*(r1+r2+d)*(d+r2-r1)*(d-r2+r1));
		return area1 + area2 - (area3/2);
	}
}
