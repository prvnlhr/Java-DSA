package Graphs;

import java.util.Scanner;

public class connectingdots2 {

	static int[] cx = { 0 , 0 ,-1 , 1 };
	static int[] cy = { 1 ,-1 , 0 , 0 }; 
	static boolean found = false;
	public static int Solve(String [] board , int n , int m) {
		boolean ans = false;
		char mat[][] = new char[n][m];

		for(int p = 0 ; p < n; p++) {
			for(int q = 0 ; q < m ; q++) {
				mat[p][q] = board[p].charAt(q); 
			}
		}
		boolean [][]visited = new boolean[n][m];
//------------------------------------------------------------------
		for(int i = 0 ; i< n ; i++) {
			for(int j = 0 ; j < m  ;j++) {  
				int start_i = i;
				int start_j = j;
				System.out.println(mat[i][j]+" "+i+" "+j);
				char color = mat[i][j];
				ans = dfs(mat, visited, i, j , n , m , start_i , start_j , mat[i][j]);  
				if(found==true) {
					return 1;
				}
				System.out.println(ans);
			}
		}
	//-----------------------------------------------------------------------------
		return 0;
	}
	static boolean f =false;
	static int count = 0;
	private static boolean dfs(char[][] mat, boolean[][] visited, int x, int y , int n , int m , int start_i , int start_j , char colormatch) {
//		if(count== 20) {
//			return false;
//		}
		if(f || count>=4 && x==start_i && y==start_j){
            f = true;
            return true;
        }else if(visited[x][y]){
            return false ;
        }
		visited[x][y] = true;
		for(int i = 0 ; i<4 ; i++) {
			int dx = x + cx[i];
			int dy = y + cy[i];
			
		
			if(dx >= 0 && dx < n && dy >= 0 && dy < m  && mat[dx][dy]==colormatch &&visited[dx][dy]==false ) {
				if(dy<y) {
					System.out.println("left");
				}
				if(dy>y) {
					System.out.println("right");
				}
				if(dx>x) {
					System.out.println("down");
				}
				if(dx<x) {
					System.out.println("up");
				}
				
				System.out.println("["+dx+"]"+"["+dy+"]"+" "+mat[dx][dy]);
				count++;
				dfs(mat, visited, dx, dy, n, m , start_i , start_j , colormatch);
			}
		}
		return false;
	}
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


