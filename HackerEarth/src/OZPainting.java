import java.util.Scanner;

public class OZPainting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long x,y,z;
		long maxPainting;
		for(int i = 0; i < t; i++) {
			x = in.nextLong();
			y = in.nextLong();
			z = in.nextLong();
			maxPainting = maxPainting(x,y,z);
			System.out.println(maxPainting);
		}
	}

	private static long maxPainting(long x, long y, long z) {
		long temp;
		long maxPainting1 = 0, maxPainting2 = 0;
		temp = Math.max(x, y);
		temp = Math.max(temp, z);
		if(temp%3 == 0){
			maxPainting1 += ((x) / 3);
			maxPainting1 += ((y) / 3);
			maxPainting1 += ((z) / 3);
			
		}
		
		temp = 0;
		temp = Math.min(x, y);
		temp = Math.min(temp, z);
		maxPainting2 = temp;
		maxPainting2 += ((x - temp) / 3);
		maxPainting2 += ((y - temp) / 3);
		maxPainting2 += ((z - temp) / 3);
		
		return Math.max(maxPainting1, maxPainting2);
	}
}
