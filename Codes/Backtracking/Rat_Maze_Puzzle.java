package Backtracking;

import java.util.Scanner;

public class Rat_Maze_Puzzle {
	
//----------------------------------------------------------------------
//-- 	
	public static boolean ratInAMaze(int maze[][] ){
		int n = maze.length;
		int [] [] pathmaze = new  int[n][n];
		
		return solvemaze(maze , pathmaze, 0 , 0 ); 
}
	public static boolean solvemaze(int[][] maze , int[][] pathmaze , int i , int j ) {
		int n = maze.length;

		if( i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || pathmaze[i][j] == 1 ) { // OUT of maze:
			return false;
		}
	
		pathmaze[i][j]=1; // Add path:
		
		if(i == n-1 && j == n-1) {        // DESTINATION:
			return true;
		}
		
		if(solvemaze(maze, pathmaze, i-1, j)){  // UP:
			return true;
			
		}
		if(solvemaze(maze, pathmaze, i, j+1)){  // RIGHT:
			return true;
			
		}
		if(solvemaze(maze, pathmaze, i+1, j)){ // DOWN:
			return true;
			
		}
		if(solvemaze(maze, pathmaze, i, j-1)){ // LEFT:
			return true;
		}
		return false;
		
	}
	
//	public static boolean ratInAMaze(int maze[][] ){
//		int n = maze.length;
//		int [] [] pathmaze = new  int[n][n];
//		boolean res = ratmaze_helper(maze , pathmaze , 0 , 0 , 1 , false);
////		input.printmaze(pathmaze);
////		System.out.println();
//		return res;
//		
//	}
//	
//	static boolean res = false;
//	static boolean chance = false;
//	public static boolean ratmaze_helper(int maze[][] , int[][] pathmaze , int i , int j , int flag , boolean chance) {
//		
//		
//	
//		pathmaze[i][j] = 1;
//
////------Base Case:
//		if(i == maze.length-1 && j == maze.length-1 ) { 
//			System.out.println("i"+i+"j"+j);
//			res = true;
//			return res;
//		}
//		
////------Path deciding block:
//	
//		if( j+1< maze.length && maze[i][j+1]==1 && pathmaze[i][j+1] != 1) { // if right path possible:
//			j = j + 1;
////			flag = 1;
//			chance = true;
//			
//		}
//		else if (i+1 < maze.length && maze[i+1][j]==1 && pathmaze[i+1][j]!=1) { // if downpath possible:
//			i = i + 1;
////			flag = 1;
//			chance = true;
//
//		}
//		else if( i-1 >= 0 && maze[i-1][j]==1  && pathmaze[i-1][j]!= 1) { // if up path possible:
//			i = i-1;
////			flag = 1;
//			chance = true;
//
//		}
//		else if( j-1 >=0 && maze[i][j-1]==1 && pathmaze[i][j-1]!=1 ) { // if left path possible:
//			j = j-1;
////			flag = 1;
//			chance = true;
//
//		}
//	
//		
////------ BackTrack Step:
//		if(chance != true) {
//			if(j+1 <pathmaze.length && pathmaze[i][j+1]==1 ) {//right
//				j = j+1;
//				flag = 1;
//				chance  = true;
//			}
//			else if(i-1 >=0 && pathmaze[i-1][j]==1) {//up
//				i = i-1;
//				flag = 1;
//				chance  = true;
//
//			}
//			else if(i+1 <pathmaze.length && pathmaze[i+1][j]==1) {//down
//				i = i+1;
//				flag = 1;
//				chance  = true;
//
//			} 
//			else if(j-1 >= 0 && pathmaze[i][j-1]==1 ){//left
//				j = j-1;
//				flag = 1;
//				chance  = true;
//
//			}
//		}
//		if(flag ==1 && chance == true) {
//			ratmaze_helper(maze, pathmaze, i, j, 0 , false);
//		}
//		if(chance == false) {
//			return false;
//		}
//
//		return res ;
//	}
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
		ratInAMaze(maze);
		System.out.println(ratInAMaze(maze));
	}
}
