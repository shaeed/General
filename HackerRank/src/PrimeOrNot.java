
public class PrimeOrNot {
	public static void main(String[] args) {

	}

	static int isPrime(long n) {
		long temp = 2L;
		while(temp < n){
			if(n % temp == 0)
				return (int)temp;
			temp++;
		}
		
		return 1;
	}
}
