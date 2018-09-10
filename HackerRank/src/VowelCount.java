import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(minCost(s, in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
	}
	
	static int minCost(String s, int a, int e, int i, int o, int u) {
		char[] arr = s.toCharArray();
		int[] count = new int[26];
		
		for (int j = 0; j < arr.length; j++) {
			count[arr[j] - 'a']++;
		}
		
		//cost for a
		int cost = 0;
		if(count[0] < a){
			cost += getCost('a', count, a-count[0]);
		}
		
		//cost for e
		if(count['e' - 'a'] < e){
			cost += getCost('e', count, e-count['e' - 'a']);
		}
		
		//cost for i
		if(count['i' - 'a'] < i){
			cost += getCost('i', count, i-count['i' - 'a']);
		}
		
		//cost for o
		if(count['o' - 'a'] < o){
			cost += getCost('o', count, o-count['o' - 'a']);
		}
		
		//cost for u
		if(count['u' - 'a'] < u){
			cost += getCost('u', count, u-count['u' - 'a']);
		}
		
		return cost;
    }

	private static int getCost(char c, int[] count, int req) {
		int cost = 0;
		int i = 1;
		while(req > 0) {
			try {
				if(count[c - 'a' + i] > 0) {
					count[c - 'a' + i]--;
					cost += i;
					req--;
				} else if(count[c - 'a' - i] > 0) {
					count[c - 'a' - i]--;
					cost += i;
					req--;
				} else {
					i++;
				}
			} catch (Exception e) {
				i++;
			}
			
		}
		
		return cost;
	}

	
}
