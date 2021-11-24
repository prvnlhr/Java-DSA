package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Kruskal_Algorithm {

//-- Krushkal's Algorithm ----overall time complexity:( ElogE + EV )-----------------------------------------------------
	public static Edge[] kruskals(Edge[] edgeList, int n) {

//__Step 2: sort the adjList: using comparable and ToCompare "refer Edge class"
		// __O(ElogE) :
		Arrays.sort(edgeList);

		// __Creating mst to store final new connections:
		Edge mst[] = new Edge[n - 1];
		// --Creating parent array to store vertex and their connection to parent
		// vertex:
		int[] parent = new int[n];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
//__Step 3: //running loop till n-1 edges and checking for v1 and v2 if parent connection exist
		// or not. i.e . if v1parent != v2parent means their parents are different so we
		// can create a edge
		// and we also update their parent in parent array.
		// basically we Check if cycle exist or not.
		// __O(EV):
		int count = 0;
		int i = 0;
		while (count != n - 1) {
			Edge currentEdge = edgeList[i++];
			int v1parent = findParent(currentEdge.v1, parent);
			int v2parent = findParent(currentEdge.v2, parent);
			if (v1parent != v2parent) {
				mst[count] = currentEdge;
				count++;
				parent[v1parent] = v2parent; // updating parent array
			}
		}
		return mst;
	}

//__finding parent_for v1 and v2 ___________________________________________________
	public static int findParent(int V, int[] parentArray) {

		if (parentArray[V] == V) {
			return V;
		}
		return findParent(parentArray[V], parentArray);
	}

	// -- Main Method ------------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

//_Step 1: creating adjList__ O(E):
		Edge edgeList[] = new Edge[E];
//__Initialising the input from user and inserting in adjlist :
		for (int i = 0; i < E; i++) {
			int V1 = s.nextInt();
			int V2 = s.nextInt();
			int W = s.nextInt();
			Edge a = new Edge(V1, V2, W);
			edgeList[i] = a;
		}
//__calling kruskals function:
		Edge[] mst = kruskals(edgeList, V);

//--Printing output:
		System.out.println("Output MST :");
		for (int i = 0; i < mst.length; i++) {
			if (mst[i].v1 < mst[i].v2) {
				System.out.println(mst[i].v1 + " " + mst[i].v2 + " " + mst[i].w);
			} else {
				System.out.println(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].w);
			}
		}
	}
}

//for(int i = 0 ; i <edgeList.length; i++) {
//	System.out.println(edgeList[i].v1+" "+edgeList[i].v2+" "+edgeList[i].w);
//}