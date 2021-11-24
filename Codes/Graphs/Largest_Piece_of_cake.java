package Graphs;

import java.util.Scanner;

public class Largest_Piece_of_cake {
//-----------------------------------------------------------------------------------------------
	public static  int solve(int n,String cake[]) {

		char [][] mat = new char[n][n];

		for(int i = 0 ; i< mat.length; i++) {
			for(int j = 0 ; j< mat[0].length ; j++){
				mat[i][j] = cake[i].charAt(j);
			}
		}
		boolean visited[][] = new boolean[n][n];


		int N = mat.length;
		int M = mat[0].length;
		int max = Integer.MIN_VALUE;

		for(int i = 0 ; i< N ; i++) {
			for(int j = 0 ; j< M;j++) {
				if( mat[i][j]=='1') {
					int res = dfs(mat, visited , i , j);
					max =  Math.max(max, res);
				}
			}
		}
		return max;
	}
//--- DFS Search in four possible direction -------------------------------------------   
	    public static int dfs(char[][] mat ,  boolean [][]visited , int i , int j ) {

	        visited[i][j] = true;

	        int count=0;
	        for(int k=0 ; k<4 ; k++){
	            if( i >=0 && j-1>=0 && i < mat.length && j-1<mat[0].length && mat[i][j-1]=='1' &&visited[i][j-1]==false) { //left

	                count+= dfs(mat, visited, i, j-1);
	            }
	            if( i >=0 && j+1>=0 && i < mat.length && j+1<mat[0].length && mat[i][j+1]=='1' &&visited[i][j+1]==false) { // right

	                count+=dfs(mat, visited, i, j+1);
	            }
	            if( i-1 >=0 && j >=0 && i-1< mat.length && j<mat[0].length && mat[i-1][j]=='1' &&visited[i-1][j]==false) { // up

	                count+=dfs(mat, visited, i-1, j);
	            }
	            if( i+1>=0 && j >=0 && i+1< mat.length && j<mat[0].length && mat[i+1][j]=='1' &&visited[i+1][j]==false) { // down

	                count+= dfs(mat, visited, i+1, j);
	            }
	        }
	        return count + 1; 
	    }
	
//-- Main Method ---------------------------------------------------------------------------------------------------------------------------------

	static String[]cake=new String [55];
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n,m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++){
			cake[i]=scan.nextLine();
		}
		int ans  = solve(n, cake);
		System.out.print(ans);
	}
}
