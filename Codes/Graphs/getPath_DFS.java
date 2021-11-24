package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class getPath_DFS {

	public static ArrayList<Integer> getPathDF(int[][]adjMatrix ,int sv , int ev ) {

		int n = adjMatrix.length;
		boolean[] visited = new boolean[n];

		return getPathHelper(adjMatrix, sv, ev, visited);

	}


	public static ArrayList<Integer> getPathHelper(int[][] adjMatrix, int sv , int ev , boolean[] visited) {

		if(sv == ev) {
			ArrayList<Integer> path = new ArrayList<Integer>();
			path.add(sv);
			return path;
		}
		visited[sv] = true;

		for(int i = 0; i< adjMatrix.length ; i++ ) {
			if(adjMatrix[sv][i] == 1 && visited[i]==false){
				ArrayList<Integer> smallAns = getPathHelper(adjMatrix, i, ev, visited);
				if(smallAns!= null) {
					smallAns.add(sv);
					return  smallAns;

				}
			}
		}
		return null;
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

			ArrayList<Integer> ans = getPathDF(edges , startindex , endindex);
			for(int i : ans) {
				System.out.print(i+" ");
			}
		}
	}

