import java.util.Arrays;
import java.util.Scanner;

public class RepeatedWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(firstRepeatedWord(in.nextLine()));
	}
	
	static String firstRepeatedWord(String s) {
		//Break the string
		String[] words = s.split("[^a-zA-Z]");
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[j].equals("") || words[j] == null)
					continue;
				if(words[j].equals(words[i]))
					return words[j];
			}
		}
		
		System.out.println(Arrays.toString(words));
		return null;
    }
}
