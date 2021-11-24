package Graphs;

import java.util.Scanner;

public class Prims_Algorithm {

	public static void prims(int [][]adjMatrix ){
		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int parent[] = new int [n];
		int weight[] = new int [n];

		parent[0] =-1 ;
		weight[0] = 0 ;

		for( int i = 1 ; i < n ; i++){
			weight[i]= Integer.MAX_VALUE;

		}
		for ( int i = 0 ;i<n ;i++){
			int minvertex = findMinVertex(visited , weight);
			visited[minvertex ]= true;
			for (int j = 0 ; j<n;j++){
				if(adjMatrix[minvertex][j]!=0 && !visited[j]){

					if(weight[j] > adjMatrix[minvertex ][j]){
						weight[j] = adjMatrix[minvertex ][j];
						parent[j] = minvertex ;
					}
				}
			} 

		}
		for(int i = 1 ; i< n ; i++){
			if(i<parent[i]){
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			}
			else {
				System.out.println(parent[i]+" "+i+" "+weight[i]);
			}
		}
	}
	public static int findMinVertex(boolean[]visited,int[] weight){
		int minvertex = -1;
		for ( int i = 0;i<visited.length ;i++){
			if(!visited[i] && (minvertex==-1 || weight[i]<weight[minvertex])){
				minvertex = i;
			}
		}
		return minvertex;
	}


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
		
		prims(adjMatrix);
	}
}



