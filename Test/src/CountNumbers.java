import java.util.Scanner;


public class CountNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noOfPrimeNumbers = input.nextInt();
		int noOfCycle = input.nextInt();
		int[] primeNumbers = new int[noOfPrimeNumbers];

		for (int i = 0; i < noOfPrimeNumbers; i++) {
			primeNumbers[i] = input.nextInt();
		}

		int count = 0;
		for (int i = 0; i < noOfCycle; i++) {
			count = countAllNumbers(input.nextInt(), input.nextInt(), primeNumbers);
			System.out.println(count);
		}
	}

	private static int countAllNumbers(int a, int b, int[] primeNumbers) {
		int noOfPrime = primeNumbers.length;
		int temp = 0;
		int temp2 = 0;
		
		for (int i = 0; i < noOfPrime; i++) {
			temp2 = b / primeNumbers[i] - a / primeNumbers[i];
			if(a > primeNumbers[i] && a % primeNumbers[i] == 0)
				temp2++;

			for (int j = 0; j < i; j++) {
				temp2 = temp2 - b / (primeNumbers[i]*primeNumbers[j]) + a / (primeNumbers[i] * primeNumbers[j]);
				if(a > (primeNumbers[i] * primeNumbers[j]) && a % (primeNumbers[i] * primeNumbers[j]) == 0) {
					temp2--;
				}
			}
			temp += temp2;
		}
		
		return temp;
	}
}


/*
import java.util.Scanner;
import java.util.HashSet;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
		int noOfPrimeNumbers = input.nextInt();
		int noOfCycle = input.nextInt();
		int[] primeNumbers = new int[noOfPrimeNumbers];
		
		for (int i = 0; i < noOfPrimeNumbers; i++) {
			primeNumbers[i] = input.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < noOfCycle; i++) {
			count = countAllNumbers(input.nextInt(), input.nextInt(), primeNumbers);
			System.out.println(count);
		}
    }
    
    private static int countAllNumbers(int a, int b, int[] primeNumbers) {
		HashSet<Integer> numberList = new HashSet<Integer>();
		int noOfPrime = primeNumbers.length;
		int temp = 0;
		int temp2 = 0;

		for (int i = 0; i < noOfPrime; i++) {

			temp = a / primeNumbers[i] + 1;
			if(a % primeNumbers[i] == 0)
				temp--;
			while(true){
				temp2 = temp * primeNumbers[i];
				if(temp2 <= b)
					numberList.add(temp2);
				else
					break;
				temp++;
			}

		}
		
		return numberList.size();
	}
}

private static int countAllNumbers(int a, int b, int[] primeNumbers) {
		int noOfPrime = primeNumbers.length;
		int temp = 0;
		int temp2 = 0;
		boolean flag = false;
		boolean flag2 = false;
		
		for (int i = 0; i < noOfPrime; i++) {
			temp2 = b / primeNumbers[i] - a / primeNumbers[i];
			if(a > primeNumbers[i] && a % primeNumbers[i] == 0)
				temp2++;
			flag = false;
			flag2 = false;
			for (int j = 0; j < i; j++) {
				temp2 = temp2 - b / (primeNumbers[i]*primeNumbers[j]) + a / (primeNumbers[i] * primeNumbers[j]);
				if((!flag) && a > (primeNumbers[i] * primeNumbers[j]) && a % (primeNumbers[i] * primeNumbers[j]) == 0) {
					flag = true;
					temp2--;
				}
				else if(flag){
					flag2 = true;
				}
				if(flag && flag2 && b > (primeNumbers[i] * primeNumbers[j]) && b % (primeNumbers[i] * primeNumbers[j]) == 0)
					temp2++;
			}
			temp += temp2;
		}
		
		return temp;
	}


*/
