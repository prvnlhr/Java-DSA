package Backtracking;

import java.util.Scanner;

public class MazeInput {
//--------------------------------------------------------
//-- Maze Input:
	static Scanner s = new Scanner(System.in);
	public static int [] [] takeInput(int n) {

		int [] [] maze = new int [n][n];

		for(int i = 0 ; i < maze.length ; i++) {

			for(int j = 0 ; j < maze.length; j++) {

				maze [i][j] = s.nextInt();
			}
		}
		return maze;
	}
//----------------------------------------------------------
//-- Print Maze:
	public static void printmaze(int[][] maze) {
		for(int i = 0; i < maze.length ;i++) {
			for(int j = 0; j < maze.length ; j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
	}
}
