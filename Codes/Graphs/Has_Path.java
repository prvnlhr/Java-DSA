package Graphs;

import java.util.Scanner;

public class Has_Path {
	
	
	public static boolean HasPath(int[][]adjMatrix ,int sou , int des ) {
		int n = adjMatrix.length;
		boolean[] visited = new boolean[n];
		int currentVertex = sou;
		return HasPathHelper(adjMatrix, sou, des, currentVertex ,visited);
		}
	public static boolean HasPathHelper(int[][] adjMatrix, int sou , int des ,int currentVertex , boolean[] visited) {
		
		if(currentVertex == des) {
			return true;
		}
		visited[currentVertex] = true;
		
		for(int i = 0; i< adjMatrix.length ; i++ ) {
			if(adjMatrix[currentVertex][i] == 1 && visited[i]==false){
				currentVertex = i ; 
				return  HasPathHelper(adjMatrix, sou, des, currentVertex, visited);
			}
		}
		return false;

	}
	
//-- main method -------------------------------
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		   int[][] edges = new int[V][V];

	        for (int i = 0; i < E; i++) {
	            int a = s.nextInt();
	            int b = s.nextInt();
	            edges[a][b] = 1;
	            edges[b][a] = 1;

	        }
	        int startindex = s.nextInt();
	        int endindex = s.nextInt();

		boolean ans = HasPath(edges , startindex , endindex);
		System.out.println(ans);
	}
}
