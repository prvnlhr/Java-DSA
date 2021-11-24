package Graphs;

import java.util.Scanner;

public class Island {
	

//-- Island Function -----------------------------------------------------------------------------
//__(1)____________________________________________________
	public static int solve(int n,int m,int U[],int V[]) {

		int edge[][] = new int[n+1][n+1];
		for(int i = 0 ; i<m ; i++){
			edge[U[i]][V[i]] = 1;
			edge[V[i]][U[i]] = 1;
		}
		return countConnectedIslands(edge);
	}
//__(2)_____________________________________________________
	public static int countConnectedIslands(int edge[][]) {
		int count = 0;
		boolean visited[] = new boolean[edge.length];
		
		for(int i = 1 ; i<visited.length ; i++) {
			if(!visited[i]) {
				countConnectedIslands(edge,i,visited);
				count++;
			}
		}
		return count;
	}
//__(3)_________________________________________________________________________________
	public static void countConnectedIslands(int edge[][], int sv, boolean visited[]) {
		
		visited[sv] = true;
		
		for(int i = 1 ; i<edge.length ; i++) {
			if(edge[sv][i]==1 && !visited[i]) {
				countConnectedIslands(edge, i, visited);
			}
		}
	}



//-- Main Method -------------------------------------------------------------
	public static int [] takeInput(int M) {
		int arr[] = new int[M];
		for(int i = 0 ; i< M ; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		int N = s .nextInt();
		int M = s.nextInt();
		int [] u = takeInput(M);
		int [] v = takeInput(M);

		int ans =  solve(N, M, u, v);
		System.out.println(ans);
	}
}

	
	


