import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductOftwo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(maxElement(arr));
	}

	static int maxElement(int[] arr) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		Integer[] arr2 = new Integer[arr.length];
		lst.toArray(arr2);

		int max = -1;
		int temp = 0;

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = i-1; j >=0; j--) {
				if(arr2[i] % arr2[j] == 0) {
					temp = arr2[i] / arr2[j];
					temp = Collections.binarySearch(lst, temp);
					if(temp >= 0 && temp != j) {
						return arr2[i];
					}
				}
			}
		}


		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = i-1; j > 0; j--) {
				temp = arr2[i] * arr2[j];
				if(Collections.binarySearch(lst, temp) >= 0) {
					if(max < temp)
						max = temp;
				}
			}
		}

		return max;
	}

}
