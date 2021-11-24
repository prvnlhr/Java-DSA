package Graphs;

import java.util.Scanner;

public class Dijkstras_Algorithm {

	public static void Dijkstras(int[][]adjMatrix) {

		int n = adjMatrix.length;

		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		distance[0] = 0;
		for(int i = 1 ; i<n ;i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		for(int i = 0 ; i< n-1 ; i++) {
			
			int minvertex = findMinveretx(visited , distance);
			visited[minvertex]= true;
			for(int j = 0 ; j< n ; j++) {
				if(adjMatrix[minvertex][j] > 0 && !visited[j]  && adjMatrix[minvertex][j] <Integer.MAX_VALUE) {
					// j is unvisited neighbor of minvertex
					// calculate distance  to reach j from  source via minvertex
					int newdist = distance[minvertex] + adjMatrix[minvertex][j];
					if(newdist < distance[j]) {
						distance[j] = newdist;
					}
				}
			}
		}
		for(int i = 0 ; i< n ; i++) {
			System.out.println(i+" "+distance[i]);
		}
	}

	public  static int findMinveretx(boolean[] visited, int[] distance) {
		int minvertex = -1 ;

		for(int i = 0 ; i< visited.length; i++) {
			if(!visited[i] && (minvertex==-1 || distance[i]<distance[minvertex])) {
				minvertex = i ;
			}
		}
		return minvertex;
	}
	

	//--Main Method ---------------------------------------
	public static void main(String args[]) { 
		Scanner s =  new  Scanner(System.in);
		int V= s.nextInt();
		int E = s.nextInt();
		int[][] adjMatrix = new int[V][V];

		for ( int i = 0; i<E ;i++){
			int V1 = s.nextInt();
			int V2 = s.nextInt();
			int W = s.nextInt();
			adjMatrix[V1][V2] = W;
			adjMatrix[V2][V1] = W;
		}
		Dijkstras(adjMatrix);
	}
}

