package my_ools;

import java.util.Scanner;

public class HexConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] t = text.split("[x,q]");
		
		char[] hex = null;
		String hexS = null;
		for (int i = 0; i < t.length; i++) {
			try {
				//System.out.print(t[i] + " ");
				hex = t[i].toCharArray();
				hexS = "";
				hexS += hex[0]-48;
				hexS += hex[1];
				//System.out.print(hexS +" ");
				System.out.print((char)Integer.parseInt(hexS, 16));
			} catch (Exception e) {
				System.out.print(" + ");
			}
		}
		System.out.println();

		/*char[] me = "www.facebook.com/shaeed46".toCharArray();
		char[] me1 = "Shaeed Khan".toCharArray();
		for (int i = 0; i < me.length; i++) {
			System.out.printf("\\x%h", me[i]);
		}
		System.out.println();
		for (int i = 0; i < me1.length; i++) {
			System.out.printf("\\x%h", me1[i]);
		}*/
	}
}
