package Backtracking;

import java.util.Scanner;

public class NQueen_CNSolution {
//---------------------------------------------------------------------------------
	public static void NQueen(int n) {
		int board[][] = new int[n][n];
		placeQueen(board , 0 , n);
	}

//-- Place Queen recursive helper  function:
	public static void placeQueen(int [] [] board , int row , int n ) {

//------ if End of board is reached i.e all queens are placed:
		if(row == n) {
//------ print the possible solution:			
			for(int i = 0 ; i< n ; i++) {
				for(int j = 0; j< n ; j++) {
					System.out.print(board[i][j]+" ");
				}
			}
			System.out.println();
		}
//------- Checking if selected row && col position is safe or not:
		for(int j = 0 ; j< n ; j++) {
			if(isBOardSafe(board, row, j)) {
//-------- if safe to place the mark it as 1:
				board[row][j]=1;
//-------- recursive call for next row:
				placeQueen(board, row + 1 , n);
//--------- if placement if not possible then backtrack and removing 1 from cell:				
				board[row][j] = 0;
			}
		}
	}
//-- function to check if postion is safe or Not:	
	public static boolean isBOardSafe(int [] [] board , int row , int col) {

		int n = board.length;

		for(int i = row-1 , j = col-1; i>=0 && j >= 0; i-- , j--) { // upward left diagonal
			if(board[i][j]==1) {
				return false;
			}
		}
		for(int i = row+1 , j = col+1 ; i < n && j<n ; i++ , j++) { //  right Downward diagonal
			if(board[i][j]==1) {
				return false;
			}
		}
		for(int i = row -1 , j = col+1 ; i>= 0 && j< n ; i-- , j++) { //  upward right diagonal
			if(board[i][j]==1) {
				return false;
			}
		}
		for(int i = row +1 , j= col -1 ; i< n && j>=0 ; i++ , j--) { //  left Downward diagonal
			if(board[i][j]==1) {
				return false;
			}
		}
		for(int i = row - 1 ; i>=0 ; i--) { // upward column
			if(board[i][col]==1) {
				return false;
			}
		}
		for(int i = row +1 ; i< n ; i++) { // downward column
			if(board[i][col]==1) {
				return false;
			}
		}
		return true;
	}

//--------------------------------------------------------------------------------
//-- Main Method:
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
	}
}
