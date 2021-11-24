package Graphs;

public class Edge implements Comparable<Edge> {
	
	int v1;
	int v2;
	int w;
	
	public Edge(int V1 , int V2 , int W) {
		this.v1 = V1;
		this.v2 = V2;
		this.w = W ;
	}

	@Override
	public int compareTo(Edge o) {
		return this.w - o.w;
	}
}
