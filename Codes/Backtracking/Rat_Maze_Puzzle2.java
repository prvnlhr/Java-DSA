package Backtracking;

import java.util.Scanner;

public class Rat_Maze_Puzzle2 {
	
//--- MAIN MAZE CALL FUNCTION-------------------------------------------------------------------
	
	public static void ratInAMaze(int maze[][] ){
		int n = maze.length;
		int [] [] pathmaze = new  int[n][n];
		print_All_Paths(maze , pathmaze, 0 , 0 ); 
}
	
	
//--- PRINT ALL PATHS :
	public static void print_All_Paths(int[][] maze , int[][] pathmaze , int i , int j ) {
		int n = maze.length;
//---------------------------------------------------------
		if( i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || pathmaze[i][j] == 1 ) { // OUT of maze:
			return ;
		}
//--------------------------------------------------------
		pathmaze[i][j] = 1; // Add path:
//--------------------------------------------------------
		if(i == n-1 && j == n-1) {  // DESTINATION: Printing path and reseting destination ==0;
			System.out.println();
			for(int r = 0 ; r < n ; r++) {
				for(int c = 0 ; c < n ; c++) {
					System.out.print(pathmaze[r][c]+" ");												
				}
			}
			pathmaze[i][j]=0;
			return ;
		}
//--Exploring other paths ------------------------------------------------------	
		print_All_Paths(maze, pathmaze, i-1, j); // UP:
		
		print_All_Paths(maze, pathmaze, i, j+1);  // RIGHT:
		
		print_All_Paths(maze, pathmaze, i+1, j);// DOWN:
		
		print_All_Paths(maze, pathmaze, i, j-1); // LEFT:
		pathmaze[i][j]=0;
		
	}
	

//------------------------------------------------------------------------
//-- Main method:
	static MazeInput input = new MazeInput();
	public static void main(String[] args) {
//		static MazeInput input = new MazeInput();
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int maze [][] = input.takeInput(n);
//		input.printmaze(maze);
//		System.out.println();
//		ratInAMaze(maze);
		ratInAMaze(maze);
	}
}
