import java.util.Scanner;

public class Roach {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int roC = in.nextInt();
		int[] ro = new int[roC];
		for (int i = 0; i < roC; i++) {
			ro[i] = in.nextInt();
		}
		
		//Find path
		int minL = len/2;
		int maxL = 0;
		int minR = len;
		int maxR = 0;
		
		for (int i = 0; i < roC; i++) {
			if(ro[i] <= len/2) {
				if(minL > ro[i])
					minL = ro[i];
				if(maxL < ro[i])
					maxL = ro[i];
			} else {
				if(minR > ro[i])
					minR = ro[i];
				if(maxR < ro[i])
					maxR = ro[i];
			}
		}
		
		int minTime = Math.max(maxL, len - minR);
		int maxTime = maxR - minL;
		if(minL > len - maxR) {
			maxTime += minL;
		} else {
			maxTime += (len - maxR);
		}
		System.out.println(minTime + " " + maxTime);
		
	}
}
