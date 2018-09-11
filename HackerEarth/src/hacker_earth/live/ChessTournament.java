package hacker_earth.live;

import java.util.Scanner;

public class ChessTournament {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int dim = (int)Math.pow(2, n);
		dim--;
		
		int[][] board = new int[dim][dim];
		
		//Read all the inputs
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j <= i; j++) {
				board[i][j] = input.nextInt();
			}
		}
		
		//Find the winner
		int players = dim + 1;
		int[] winners;
		int[] oldWinners;
		winners = new int[players];
		for (int i = 0; i < players; i++) 
			winners[i] = i+1;
		int pi = 0;
		int pj = 0;
		
		for (int i = 0; i < dim; i++) {
			players /= 2;
			oldWinners = winners;
			winners = new int[players];
			
			for (int j = 0; j < players; j++) {
				pi = oldWinners[2*j];
				pj = oldWinners[2*j+1];
				if (board[pj-2][pi-1] == 1) 
					winners[j] = pj;
				else
					winners[j] = pi;
			}
			if(players == 1)
				System.out.println(winners[0]);
		}
		
		//Print result
		//System.out.println(winners[0]);
	}
}
