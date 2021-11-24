package Graphs;

import java.util.Scanner;

public class sssss {
	  public static boolean exist(char[][] board, String word) {
	        
	        //Base case
	        if(board==null || board.length==0 || word==null || word.length()==0)
	            return false;
	        
	        int rows = board.length;
	        int cols = board[0].length;
	        
	        //to iterate through the word
	        int index=0;
	        
	        for(int i=0;i<rows;i++)
	        {
	            for(int j=0;j<cols;j++)
	            {
	                if(board[i][j]==word.charAt(index))
	                {
	                    if(wordFound(board,i,j,word,index+1))
	                        return true;
	                }
	            }
	        }
	        
	        return false;
	        
	    }
	    
	    public static boolean wordFound(char[][] board,int row,int col,String word,int index)
	    {
	        //Base case
	        if(index==word.length())
	            return true;
	        
	        //mark visited
	        char temp = board[row][col];
	        board[row][col]='#';
	        
	        //check the top
	        if(row-1>=0 && board[row-1][col]!='#' && board[row-1][col]==word.charAt(index))
	        {
	            if(wordFound(board,row-1,col,word,index+1))
	                        return true;
	        }
	        
	        //check the left
	        if(col-1>=0 && board[row][col-1]!='#' && board[row][col-1]==word.charAt(index))
	        {
	            if(wordFound(board,row,col-1,word,index+1))
	                        return true;
	        }
	        
	        //check the bottom
	        if(row+1<board.length && board[row+1][col]!='#' && board[row+1][col]==word.charAt(index))
	        {
	            if(wordFound(board,row+1,col,word,index+1))
	                        return true;
	        }
	        
	        //check the right
	        if(col+1<board[0].length && board[row][col+1]!='#' && board[row][col+1]==word.charAt(index))
	        {
	            if(wordFound(board,row,col+1,word,index+1))
	                        return true;
	        }
	        
	        //mark unvisited
	        board[row][col]=temp;
	        
	        return false;
	    }
	    public static int solve(String[] Graph , int N, int M){

			char [][] matrix = new char[N][M];
			for(int  p = 0 ; p < N ; p++) {
				for(int k = 0 ; k < M ; k++) {
					matrix[p][k] = Graph[p].charAt(k);
				}
			}
			String s  = "CODINGNINJA";
			
			boolean ans = exist(matrix , s);
			if(ans == true) {
				return 1;
			}
			return 0;
			
		}
	    public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int	M = s.nextInt();

		String[] Graph = new String[N];

		for(int i = 0; i < N; i++){
			Graph[i] = s.next();
		}
//	boolean ans = 	solve(Graph, N, M);
//		System.out.println(ans);
	}
}


