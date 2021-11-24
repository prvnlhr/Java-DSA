package Graphs;

import java.util.Scanner;

public class Cycle {
//--- Cycle main function start -----------------------------
	static int count = 0;

	public static int solve_helper(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				if (mat[i][j] == 1) {
					int k = j;
					int start = i;
					int check = i;
					check1(mat, k, start, check);
				}
			}
		}
		return count / 6;
	}

//-- first connection check -------------------------------------------------
	public static void check1(int mat[][], int k, int start, int check) {

		for (int l = 0; l < mat[0].length; l++) {
			if (mat[k][l] == 1 && l != check) {
				int ans = checkfinal(mat, start, l);
				if (ans == 1) {
					count++;
				}
			}
		}
	}

//-- last final check if end-->start: cycle exists--------------------------------------------------------
	public static int checkfinal(int[][] mat, int start, int l) {

		for (int p = 0; p < mat[0].length; p++) {
			if (mat[l][p] == 1 && p == start) {
				// System.out.println("matched");
				return 1;
			}
		}
		return 0;
	}

	// ------------------------------------------------------------------------------
	public static int solve(int n, int m, int U[], int V[]) {

		int mat[][] = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			mat[U[i]][V[i]] = 1;
			mat[V[i]][U[i]] = 1;
		}
		return solve_helper(mat);
	}

//-- MAIN METHOD -------------------------------------------------------------------------------------------------

	public static int[] u = new int[5005];
	public static int[] v = new int[5005];

	public static void main(String[] args) {

		int n, m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			u[i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			v[i] = scan.nextInt();
		}
		System.out.println("No_of_cycles: " + solve(n, m, u, v));
	}
}
