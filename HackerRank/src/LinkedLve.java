import java.util.Scanner;

public class LinkedLve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(replacements(s));
	}
	
	static int replacements(String s) {
		char[] arr = s.toCharArray();
		int count = 0;
		int len = arr.length;
		for (int i = 0; i < len/2; i++) {
			if(arr[i] != 'l')
				count++;
			if(arr[len-i-1] != 'l')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'i')
				count++;
			if(arr[len-i-1] != 'i')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'n')
				count++;
			if(arr[len-i-1] != 'n')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'k')
				count++;
			if(arr[len-i-1] != 'k')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'e')
				count++;
			if(arr[len-i-1] != 'e')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'd')
				count++;
			if(arr[len-i-1] != 'd')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'i')
				count++;
			if(arr[len-i-1] != 'i')
				count++;
			i++;
			if(i > len/2) break;
			
			if(arr[i] != 'n')
				count++;
			if(arr[len-i-1] != 'n')
				count++;			
			
		}
		
		return count;
    }
}
