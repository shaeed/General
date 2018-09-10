import java.util.Scanner;

public class MagicCard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int[] num = new int[5];
		while(in.hasNext()) {
			num[i] = in.nextInt();
			i++;
		}
		
		int[] card = {1, 2, 4, 8, 16};
		int ans = 0;
		for (int j = 0; j < i; j++) {
			ans += card[num[j]];
		}
		
		System.out.println(ans);
	}
}
