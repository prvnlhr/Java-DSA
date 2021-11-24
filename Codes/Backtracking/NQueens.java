package Backtracking;

import java.util.Scanner;

public class NQueens {
//----- N Queen face:
	public static void placeNQueens(int n){
		
		   int board[][] = new int[n][n];  
		   
		    if (solveBoard(board, 0) == false)  
		    {  
		        System.out.printf("Solution does not exist");  
		        return ;  
		    }  
		  
		    return ;  
		}  
		
	
	public static boolean solveBoard(int [] [] board , int col ) {
			int N = board.length;
	
			if (col == N)  
	    {  
	        printboard(board);  
	        System.out.println();
	        return true;  
	    }  
	  
	    /* Consider this column and try placing  
	    this queen in all rows one by one */
	    boolean res = false;  
	    for (int i = 0; i < N; i++)  
	    {  
	        /* Check if queen can be placed on  
	        board[i][col] */
	        if ( isSafe(board, i, col) )  
	        {  
	            /* Place this queen in board[i][col] */
	            board[i][col] = 1;  
	  
	            // Make result true if any placement  
	            // is possible  
	            res = solveBoard(board, col + 1) || res;  
	  
	            /* If placing queen in board[i][col]  
	            doesn't lead to a solution, then  
	            remove queen from board[i][col] */
	            board[i][col] = 0; // BACKTRACK  
	        }  
	    }  
	  
	    /* If queen can not be place in any row in  
	        this column col then return false */
	    return res;  
	}  
	  
  public static void printboard(int[] [] board) {
	  int n = board.length;
	  for(int  i = 0 ; i< board.length ; i++) {
		  for(int j  = 0 ; j< n ; j++) {
			  System.out.print(board[i][j]+" ");
		  }
	  }
  }
  
		static boolean isSafe(int board[][], int row, int col) {  
		int n = board.length;
			int i, j;  
		  
		    /* Check this row on left side */
		    for (i = 0; i < col; i++)  
		        if (board[row][i] == 1)  
		            return false;  
		  
		    /* Check upper diagonal on left side */
		    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)  
		        if (board[i][j] == 1)  
		            return false;  
		  
		    /* Check lower diagonal on left side */
		    for (i = row, j = col; j >= 0 && i < n; i++, j--)  
		        if (board[i][j] == 1)  
		            return false;  
		  
		    return true;  
		}  
	
//------------------------------------------------------------------------------------------------
//-- Main Method: 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		placeNQueens(n);
		}
	}
