import java.util.ArrayList;
import java.util.Scanner;


public class ArrayPrint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> parentArray = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> newArray = new ArrayList<ArrayList<Integer>>();
		int temp = 0;
		//Read the array
		System.out.println("Enter the array elements 0 or 1");
		System.out.println("Press any other key to terminate the reading.");
		try {
			while(true) {
				temp = input.nextInt();
				if(temp == 0 || temp == 1) 
					parentArray.add(temp);
				else
					throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Reading finished.");
		}

		newArray = convertArray(parentArray);
		System.out.println(parentArray);
		System.out.println(newArray);
	}

	private static ArrayList<ArrayList<Integer>> convertArray(
			ArrayList<Integer> parentArray) {
		int previousNumber = 0;
		int currentNumber = 0;
		ArrayList<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();

		previousNumber = parentArray.get(0);
		tempList.add(previousNumber);

		for (int i = 1; i< parentArray.size(); i++) {
			currentNumber = parentArray.get(i);
			if(previousNumber == currentNumber) {
				tempList.add(currentNumber);
				previousNumber = currentNumber;
			}
			else {
				finalList.add(tempList);
				tempList = new ArrayList<Integer>();
				tempList.add(currentNumber);
				previousNumber = currentNumber;
			}
		}

		finalList.add(tempList);
		return finalList;
	}

}
