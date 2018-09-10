import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class BrowserChace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String inp = in.next();
		String print = null;
		String temp = "";
		
		Queue<Character> q = new LinkedBlockingQueue<Character>(size);
		char[] tokens = inp.toCharArray();
		for (int i = 0; i < tokens.length; i++) {
			if(tokens[i] == '!') {
				temp = printElements(q);
				if(print == null){
					print = temp;
				} else {
					print = print + " " + temp;
				}
			} else {
				if(q.contains(tokens[i])) {
					q.remove(tokens[i]);
				}
				boolean flag = q.offer(tokens[i]);
				if(!flag) {
					q.poll();
					q.offer(tokens[i]);
				}
			}
		} //End for loop
		
		//Print
		System.out.println(print);
	}

	private static String printElements(Queue<Character> q) {
		String ele = "";
		while(!q.isEmpty()) {
			ele += q.poll();
		}
		char[] t = ele.toCharArray();
		//ele = "";
		for (int i = 0; i < t.length; i++) {
			q.offer(t[i]);
			//ele = ele + t[t.length - i - 1];
		}
		return ele;		
	}
}
