import java.util.Scanner;

public class StringWeight {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(score(s));
	}
	
	static int score(String s) {
		char[] arr = s.toCharArray();
		int[] we = new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			we[arr[i] - 'a'] = 1;
		}
		
		//Add the weights vowels
		int weV = we['a' - 'a'] + we['e' - 'a'] + we['i' - 'a'] + we['o' - 'a'] + we['u' - 'a'] ;
		we['a' - 'a'] = 0;
		we['e' - 'a'] = 0;
		we['i' - 'a'] = 0;
		we['o' - 'a'] = 0;
		we['u' - 'a'] = 0;
		
		//Add the consonants
		int weC = 0;
		for (int i = 0; i < we.length; i++) {
			weC += we[i];
		}
		
		
		return weV + 2 * weC;
    }
}
