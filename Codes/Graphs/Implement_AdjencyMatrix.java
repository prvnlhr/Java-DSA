package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL; 

public class Implement_AdjencyMatrix {

	//-- Depth First Traversal ---"works for connected and not connected components"----------------------------------------
	
	public static void DFtraversalhelper(int [][] adjMatrix , int currentVertex , boolean [] visited ) {

		visited[currentVertex] = true;
		System.out.print(currentVertex+" ");
		for(int i = 0 ; i<adjMatrix.length;i++) {	
			if(adjMatrix[currentVertex][i]==1 && visited[i]== false){
				DFtraversalhelper(adjMatrix, i,visited);
			}
		}
	}
	public static void DFtraversal(int [][] adjMatrix) {
		boolean visited[] = new boolean[adjMatrix.length]; 
		for(int i = 0 ; i<adjMatrix.length ; i++) { // to prints non connected components.
			if(!visited[i]) {
			DFtraversalhelper(adjMatrix ,i, visited);
			System.out.println();
		}
		}
	}
//-- Breadth First Traversal --"works for connected and not connected components"--------------------------------------------
	public static  void BFtraversalhelper(int [][] adjMatrix , int cv , boolean[] visited) {

		Queue<Integer> q = new LinkedList<>();
		visited[cv] = true;
		q.add(cv);
		while(!q.isEmpty()) {
			int currentVertex = q.poll();
			System.out.print(currentVertex+" ");
			for(int i = 0 ; i< adjMatrix.length ; i++) {
				if(adjMatrix[currentVertex][i] ==1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	public static void BFtraversal(int[][] adjMatrix){

		boolean visited[] = new boolean[adjMatrix.length]; 
		for(int i  = 0 ; i < visited.length; i++) { // to prints non connected components.
			if(!visited[i]) {
				BFtraversalhelper(adjMatrix , i , visited);
				System.out.println();
			}
		}
	}


//-- Main Method ----------------------------------------

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);

		int vertices = s.nextInt();
		int edges = s.nextInt();
		int [][] adjMatrix = new int[vertices][vertices];

		for(int i = 0 ; i<edges ; i++) {
			int V1 = s.nextInt();
			int V2 = s.nextInt();
			adjMatrix[V1][V2] = 1;
			adjMatrix[V2][V1] = 1;
		}
//------- Printing adjMatrix ------------------------------------------------
//		for(int i = 0 ; i < adjMatrix.length ; i++) {
//			for(int  j = 0 ; j < adjMatrix[0].length ; j++) {
//				System.out.print(adjMatrix[i][j]+" ");
//			}
//			System.out.println();
//		}
//--------------------------------------------------------------
		
		System.out.println("DFT: ");
		DFtraversal(adjMatrix);
		System.out.println();
		
		System.out.print("BFT: ");
		BFtraversal(adjMatrix);
	}
}
