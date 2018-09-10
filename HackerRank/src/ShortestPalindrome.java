import java.util.Scanner;

public class ShortestPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(shortestPalindrome(in.next()));
	}
	
	static int shortestPalindrome(String s) {
		int len = s.length();
		int mid = len/2;
		if(len % 2 != 0)
			s = " " + s;
		int ins = 0;
		
		for (int i = mid; i > 0; i++) {
			if(s.charAt(i-1-ins) == s.charAt(i+1+ins))
				continue;
			
		}
		return 0;
    }
}
