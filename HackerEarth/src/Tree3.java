
import java.util.Scanner;

public class Tree3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int l = in.nextInt();
		int q = in.nextInt();
		int level = l-1;
		long[][] tree = new long[l][];
		
		tree = createTree(tree,level);
		int n,x,y;
		long sum;
		for (int i = 0; i < q; i++) {
			n = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();
			sum = magicFunction(tree, x, y, n);
			System.out.println(sum);
		}
		
	}

	private static long[][] createTree(long[][] tree, int level) {
		int maxNode = (int)Math.pow(2, level);
		tree[level] = new long[maxNode];
		for (int i = 0; i < maxNode; i++) {
			tree[level][i] = i + 1;
		}
		
		int temp = 0;
		int i1;
		for (int i = level - 1; i >= 0; i--) {
			maxNode = (int)Math.pow(2, i);
			tree[i] = new long[maxNode];
			for (int j = 0; j < maxNode; j++) {
				temp = j*2;
				i1 = i+1;
				tree[i][j] = (tree[i1][temp] * tree[i1][temp + 1]) % 1299709;
			}
		}
		return tree;
	}
	
	private static long magicFunction(long[][] tree, int x, int y, int n) {
		long sum = 0;
		n--;
		for (int i = x-1; i < y; i++) {
			sum = (sum + tree[n][i]) % 1299709;
		}
		return sum;
	}
}
