package DP;

import java.util.Scanner;

public class Min_Cost_path {
	
//-- MINIMUM COST PATH MAIN FUNCTION -------------------------------------------------------------------------------------------------
	public static int minCostPath(int input[][]) {
		
		int[] [] dp = new int[input.length+1][input[0].length+1];
		
		for(int i = 0 ; i< input.length ; i++) {
			for(int j = 0 ; j< input[0].length ; j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}

		return minCostPathI(input,dp);       //__iterative function call:
//		return minCostPathMEM(input,0,0,dp); //__memoization function call:	
//		return minCostPathREC(input,0,0);    //__recursive function call:
		}
	
//__ ITERATIVE__________________________________________________________________
	public static int minCostPathI(int[][] input , int [][]dp) {
		int m = input.length;
		int n = input[0].length;
		
	
		for(int i = m-1 ; i>=0 ; i--) {
			for(int j = n-1 ; j>=0 ; j--) {

				if(i == m-1 && j== n-1) {
					dp[i][j]= input[i][j];
					continue;
				}
				int a =	 minCostPathREC(input,i,j+1);
				int b =  minCostPathREC(input,i+1,j);
				int c =  minCostPathREC(input,i+1,j+1);
				dp[i][j] = input[i][j] + Math.min(a, Math.min(b, c));
			}
		}
		return dp[0][0];
	}
	
//__ MEMOIZATION___________________________________________________________________
	public static int minCostPathMEM(int input[][] , int i , int j , int[] [] dp) {
		
		int m = input.length;
		int n = input[0].length;

		if(i==m-1 && j==n-1) {
			return input[i][j];
		}
		if( i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		int a , b , c ;
		
		if(dp[i][j+1]== Integer.MIN_VALUE) {
			a =	 minCostPathREC(input,i,j+1);
			dp[i][j+1] = a;
		}
		else {
			a = dp[i][j+1];
		}
		if(dp[i+1][j]== Integer.MIN_VALUE) {
			b =  minCostPathREC(input,i+1,j);
			dp[i+1][j] = a;
		}
		else {
			b = dp[i+1][j];
		}
		if(dp[i+1][j+1]== Integer.MIN_VALUE) {
			c =  minCostPathREC(input,i+1,j+1);
			dp[i+1][j+1] = a;
		}
		else {
			c = dp[i+1][j+1];
		}
		int ans  = input[i][j] + Math.min(a, Math.min(b, c));
		return ans;
	}
	
//__ RECURSIVE function______________________________________________________
	public static int minCostPathREC(int input[][] , int  i , int j) {
		
		int m = input.length;
		int n = input[0].length;

		if(i == m-1  &&  j == n-1) {
			return input[i][j];
		}
		if( i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		int a =	 minCostPathREC(input,i,j+1);
		int b =  minCostPathREC(input,i+1,j);
		int c =  minCostPathREC(input,i+1,j+1);

		int ans  = input[i][j] + Math.min(a, Math.min(b, c));
		return ans;
	}

//-- MAIN METHOD ----------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		int arr [][] = new int[m][n];

		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int ans = minCostPath(arr);
		System.out.println(ans);
	}
}
