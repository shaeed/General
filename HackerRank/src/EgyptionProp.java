import java.util.ArrayList;
import java.util.Scanner;

public class EgyptionProp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m;
		ArrayList<Long> ans = null;
		
		while(in.hasNext()) {
			m = in.nextInt();
			n = in.nextInt();
			
			if(m == 0 && n == 0)
				return;
			ans = calcFraction(m, n);
			//Print fractions
			System.out.print(ans.get(0));
			for (int i = 1; i < ans.size(); i++) {
				System.out.print(" " + ans.get(i));
			}
			System.out.println();
		}
	}

	private static ArrayList<Long> calcFraction(long m, long n) {

		ArrayList<Long> ans = new ArrayList<Long>();
		long t = 0L;
		long[] num = new long[2];
		num[0] = m;
		num[1] = n;
		while(true) {
			t = findMagicFrac(num);
			ans.add(t);
			num = subtractFract(num, t);
			if(num[0] < 2) {
				ans.add(num[1]);
				break;
			}
		}
		return ans;
	}

	private static long[] subtractFract(long[] num, long t) {
		long lcm = lcm(num[1], t);
		num[0] = ((lcm/num[1])*num[0]) - (lcm / t);
		num[1] = lcm;
		long hcf = hcf(num[0], num[1]);
		num[0] /= hcf;
		num[1] /= hcf;
		return num;
	}

	private static long findMagicFrac(long n[]) {
		return (n[1]/n[0]) + 1;
	}
	
	private static long lcm(long x, long y) {
        long a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }	
    }
	
	private static long hcf(long n1, long n2) {
        long r;
        while(n2 != 0) {
            r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        
        return n1;
    }
}
