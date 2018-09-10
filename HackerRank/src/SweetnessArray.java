import java.util.Scanner;

public class SweetnessArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		//System.out.println(score(s));
	}
	
	static int sweetness(int[] arr) {
		int[] first = new int[1001];
		int[] last = new int[1001];
		
		for (int i = 0; i < arr.length; i++) {
			if(first[arr[i]] != 0) {
				last[arr[i]] = i+1;
			} else {
				first[arr[i]] = i+1;
			}
		}
		
		//Calculate weight
		int weight = 0;
		for (int i = 0; i < 1000; i++) {
			if(last[i] == 0)
				continue;
			weight = weight + last[i] - first[i];
		}
		
		return weight;
    }
}
