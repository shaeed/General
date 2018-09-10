import java.util.Scanner;

public class ShortId {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int part = in.nextInt();
		int[] id = new int[part];
		for (int i = 0; i < part; i++) {
			id[i] = in.nextInt();
		}
		
		//Find modulo
		boolean flag = true;
		int temp = 0;
		int mod = part;
		while(flag) {
			boolean[] fl = new boolean[mod];
			int i = 0;
			for (i = 0; i < id.length; i++) {
				temp = id[i] % mod;
				if(fl[temp] == true)
					break;
				fl[temp] = true;
			}
			if(i == part) {
				//Modulo founnd
				System.out.println(mod);
				flag = false;
			}
			else
				mod++;
		}
	}
}
