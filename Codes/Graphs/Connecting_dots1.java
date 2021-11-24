package Graphs;

import java.util.Scanner;

public class Connecting_dots1 {

	public static int Solve(String [] board , int n , int m) {
		boolean ans = false;
		char mat[][] = new char[n][m];

		for(int p = 0 ; p < n; p++) {
			for(int q = 0 ; q < m ; q++) {
				mat[p][q] = board[p].charAt(q); 
			}
		}
		boolean [][]visited = new boolean[n][m];

		for(int i = 0 ; i< n ; i++) {
			for(int j = 0 ; j < m  ;j++) {  
				System.out.println(mat[i][j]+" "+i+" "+j);
				int start_i = i ;
				int start_j = j ;
				ans = dfs(mat, visited, i, j , start_i , start_j);  
				System.out.println("ans: "+ ans);
				if(ans) {
					return 1;
				}
			}
		}
		printV(visited);
		return 0;
	}
	
	public static boolean dfs(char[][] mat ,  boolean [][]visited , int i , int j , int start_i , int start_j ) {

		visited[i][j] = true;
		//__if start and end point meet
		if((i-1 == start_i && j==start_j)) {
			return true;
		}
		if((i+1 == start_i && j==start_j)) {
			return true;
		}
		if((i== start_i && j+1==start_j)) {
			return true;
		}
		if((i == start_i && j-1==start_j)) {
			return true;
		}
	//-----checking four directions:	
		if( i >=0 && j+1>=0 && i < mat.length && j+1<mat[0].length && mat[i][j+1]==mat[i][j]  && visited[i][j+1]==false) { // right
			System.out.println("right");
			return dfs(mat, visited, i, j+1 , start_i , start_j);
		}
		if( i+1>=0 && j >=0 && i+1< mat.length && j<mat[0].length && mat[i+1][j] == mat[i][j]  && visited[i+1][j]==false) { // down
			System.out.println("down");
			return dfs(mat, visited, i+1, j, start_i , start_j);
		}
		if( i-1 >=0 && j >=0 && i-1< mat.length && j<mat[0].length && mat[i-1][j]== mat[i][j]  && visited[i-1][j]==false) { // up
			System.out.println("up");
			return dfs(mat, visited, i-1, j, start_i , start_j);
		}
		if( i >=0 && j-1>=0 && i < mat.length && j-1<mat[0].length && mat[i][j-1]== mat[i][j] && visited[i][j-1]==false) { //left
			System.out.println("left");
			return dfs(mat, visited, i, j-1, start_i , start_j);
		}


		return false;
	}



	//-- Main -------------------------------------------
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		int N = s .nextInt();
		int M = s.nextInt();
		String [] S = new String[N];
		for(int i = 0 ; i<N ; i++) {
			S[i] = s.next();
		}
		int ans = Solve( S, N, M);
		System.out.println(ans);
	}
	public static void printV(boolean[][] visited) {

		for(int i =  0 ; i < visited.length ; i++) {
			for(int j = 0 ; j< visited[0].length; j++) {
				System.out.print(visited[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//for(int i= 0 ; i< n ; i++) {
//	for(int j = 0 ; j< m ; j++) {
//		System.out.print(mat[i][j]+" ");
//	}
//	System.out.println();
//}