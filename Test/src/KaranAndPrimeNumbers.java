import java.util.Scanner;


public class KaranAndPrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Reading the inputs
		int noOfTest = input.nextInt();
		int[][] numbers = new int[noOfTest][2];
		for (int i = 0; i < noOfTest; i++) {
			numbers[i][0] = input.nextInt();
			numbers[i][1] = input.nextInt();
		}
		
		//Find the sum of prime numbers
		for (int i = 0; i < noOfTest; i++) {
			System.out.println(sumOfPrime(numbers[i][0],numbers[i][1]));
		}
	}

	private static int sumOfPrime(int start, int end) {
		
		return 0;
	}
}
