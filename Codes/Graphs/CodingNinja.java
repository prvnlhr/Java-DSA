package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CodingNinja {

	// -- My solution 'fails one test case'
	// --------------------------------------------
	// public static Boolean solve(String[] Graph , int N, int M){
	//
	// char [][] matrix = new char[N][M];
	// for(int p = 0 ; p < N ; p++) {
	// for(int k = 0 ; k < M ; k++) {
	// matrix[p][k] = Graph[p].charAt(k);
	// }
	// }
	// String s = "CODINGNINJA";
	//
	// boolean ans = solve_helper(matrix , s);
	// return ans;
	//
	//
	// }
	// static boolean ans = false;
	// public static boolean solve_helper(char[][] matrix , String s ) {
	//
	// boolean ans = false;
	// int N = matrix.length;
	// int M = matrix[0].length;
	// boolean [][] visited = new boolean[N][M];
	//
	// for(int i = 0 ; i< visited.length ;i++) {
	// for(int j = 0 ; j< visited[0].length; j++) {
	// if(visited[i][j]==false && matrix[i][j]==s.charAt(i)) {
	// ans = dfs(matrix , s.substring(1) , visited , i,j );
	// }
	// }
	// }
	//
	// for(int p = 0 ; p< visited.length;p++) {
	// for(int q = 0 ; q< visited[0].length;q++) {
	// System.out.print(visited[p][q]+" ");
	// }
	// System.out.println();
	// }
	// return ans;
	// }
	// static boolean res = false;
	//
	// public static boolean dfs(char[][] matrix , String s , boolean [][] visited ,
	// int i , int j) {
	// int N = matrix.length;
	// int M = matrix[0].length;
	//// System.out.println(s+" "+s.charAt(1));
	//
	// System.out.println("mat"+matrix[i][j]);
	// if(matrix[i][j]=='A') {
	// return true;
	// }
	//
	// if(i-1<matrix.length && j-1 < matrix[0].length && i-1 >= 0 && j-1>=0 &&
	// (!visited[i-1][j-1]) && matrix[i-1][j-1]==s.charAt(0) ){
	// System.out.println("1");
	// System.out.println(matrix[i-1][j-1]);
	// visited[i][j]= true;
	// res= dfs(matrix, s.substring(1), visited, i-1, j-1);
	// return res;
	// }
	//
	// if(i-1<matrix.length && j <matrix[0].length && i-1 >= 0 && j >= 0 &&
	// (!visited[i-1][j])&& matrix[i-1][j]==s.charAt(0)) {
	// System.out.println("2");
	// System.out.println(matrix[i-1][j]);
	// visited[i][j]= true;
	// res = dfs(matrix, s.substring(1), visited, i-1, j );
	// return res;
	// }
	//
	// if(i-1<matrix.length && j+1 <matrix[0].length && i-1 >= 0 && j+1 >= 0 &&
	// (!visited[i-1][j+1])&& matrix[i-1][j+1]==s.charAt(0)) {
	// System.out.println("3");
	// System.out.println(matrix[i-1][j+1]);
	// visited[i][j]= true;
	// res = dfs(matrix, s.substring(1), visited, i-1, j+1);
	// return res;
	// }
	//
	// if(i<matrix.length && j-1 <matrix[0].length && i >= 0 && j -1>= 0 &&
	// (!visited[i][j-1])&& matrix[i][j-1]==s.charAt(0)) {
	// System.out.println("4");
	// System.out.println(matrix[i][j-1]);
	// visited[i][j]= true;
	// res= dfs(matrix, s.substring(1), visited, i , j-1);
	// return res;
	// }
	//
	// if(i<matrix.length && j+1<matrix[0].length && i >= 0 && j+1 >= 0 &&
	// (!visited[i][j+1])&& matrix[i][j+1]==s.charAt(0)) {
	// System.out.println("5");
	// visited[i][j]= true;
	// res = dfs(matrix, s.substring(1), visited, i , j+1);
	// return res;
	// }
	//
	// if(i+1<matrix.length && j-1 <matrix[0].length && i+1>=0 && j-1>=0 &&
	// (!visited[i+1][j-1])&& matrix[i+1][j-1]==s.charAt(0)) {
	// System.out.println("6");
	// System.out.println(matrix[i+1][j-1]);
	// visited[i][j]= true;
	// res = dfs(matrix, s.substring(1), visited, i+1, j-1);
	// return res;
	// }
	//
	// if(i+1<matrix.length && j <matrix[0].length&& i+1>=0 && j>=0 &&
	// (!visited[i+1][j])&& matrix[i+1][j]==s.charAt(0)) {
	// System.out.println("7");
	// System.out.println(matrix[i+1][j]);
	// visited[i][j]= true;
	// res = dfs(matrix, s.substring(1), visited, i+1, j );
	// return res;
	// }
	// if(i+1<matrix.length && j+1 <matrix[0].length&& i+1>=0 && j+1>=0 &&
	// (!visited[i+1][j+1])&& matrix[i+1][j+1]==s.charAt(0)) {
	// System.out.println("8");
	// System.out.println(matrix[i+1][j+1]);
	//// System.out.println(matrix[i+1][j+1]);
	// visited[i][j]= true;
	// res = dfs(matrix, s.substring(1), visited, i+1, j+1);
	// return res;
	// }
	// return false;
	// }

//-- CN solution ------------------------------------------------------------------------------------------
	public static boolean helper(String[] mat, int i, int j, boolean visited[][], String c) {

		if (c.length() == 0) {
			return true;
		}
		int xDir[] = { -1, -1, 0, 1, 1, 1, 0, -1 };
		int yDir[] = { 0, 1, 1, 1, 0, -1, -1, -1 };

		for (int k = 0; k < xDir.length; k++) {

			if (i + xDir[k] >= 0 && i + xDir[k] < mat.length && j + yDir[k] >= 0 && j + yDir[k] < mat[0].length()
					&& mat[i + xDir[k]].charAt(j + yDir[k]) == c.charAt(0) && !visited[i + xDir[k]][j + yDir[k]]) {
				visited[i + xDir[k]][j + yDir[k]] = true;
				boolean yesorno = helper(mat, i + xDir[k], j + yDir[k], visited, c.substring(1));
				if (yesorno) {
					return true;
				} else {
					visited[i + xDir[k]][j + yDir[k]] = false;
				}
			}
		}
		return false;
	}

	// int solve(String[] Graph , int N, int M){

	static int solve(String[] Graph, int N, int M) {

		Queue<Pair> q = new LinkedList<>();// This queue is used to store the i,j of character c
		char character[][] = new char[N][M];
		for (int i = 0; i < Graph.length; i++) {
			for (int j = 0; j < Graph[i].length(); j++) {
				character[i][j] = Graph[i].charAt(j);
				if (character[i][j] == 'C') {
					Pair p = new Pair(i, j);
					q.add(p);// We are adding i,j of character c
				}
			}
		}
		while (!q.isEmpty()) {
			Pair temp = q.remove();// Taking each c char
			boolean visited[][] = new boolean[N][M];
			visited[temp.row][temp.column] = true;
			if (helper(Graph, temp.row, temp.column, visited, "ODINGNINJA") == true) {
				return 1;
			}

		}
		return 0;
	}

	int find(char character[][], int i, int j, String s, boolean visited[][]) {
		if (s.length() == 0) {
			return 1;
		}
		// This nested for loops are valid directions
		for (int row = i - 1; row <= i + 1; row++) {
			for (int column = j - 1; column <= j + 1; column++) {
				if (row != column
						&& (row >= 0 && column >= 0 && row < character.length && column < character[0].length)) {
					if (character[row][column] == s.charAt(0) && !visited[row][column]) {
						visited[row][column] = true;
						if (find(character, row, column, s.substring(1), visited) == 1)
							return 1;
						visited[row][column] = false;

					}
				}
			}
		}
		return 0;
	}

//-- Main Method ---------------------------------------
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		String[] Graph = new String[N];

		for (int i = 0; i < N; i++) {
			Graph[i] = s.next();
		}
		System.out.print(solve(Graph, N, M));
	}

}
