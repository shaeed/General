import java.util.Scanner;

public class BalancedArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum1 = 0;
			sum2 = 0;
			for (int k = 0; k <= i; k++) {
				sum1 += arr[k];
			}
			for (int j = i+2; j < arr.length; j++) {
				sum2 += arr[j];
			}
			if(sum1 == sum2) {
				System.out.println(i+1);
			}
		}
	}
}
