package DP;

import java.util.Scanner;

public class KnapSack {

//-- KnapSACK Function ---------------------------------------------------------------

	public static int knapsack(int[] weight,int value[],int maxWeight, int n){
		
		int [][] dp = new int[20][20];
		for(int i = 0 ; i < dp.length ; i++ ) {
			for(int j =  0 ; j< dp[0].length ; j++) {
				dp[i][j] = -1;
			}
		}
//			return knapsackMEM(weight, value, maxWeight,  n , dp);
			return knapsackI(weight, value, maxWeight,  n );
//			return knapsackREC(weight, value, maxWeight,  n );
	}
//__ TOP_DOWN Iterative__________________________________________________________________________
	public static int knapsackI(int[] wt,int val[],int w, int n ){
//______Initializing DP array
		int dp[][] = new int[n+1][w+1];
		for(int i = 0 ; i< n+1 ; i++) {
			for(int j = 0 ; j< w+1 ; j++ ) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
			}
		}

		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=w; j++) {
				if(wt[i-1] <= j) {
					int a = val[i-1] + dp[i-1][j-(wt[i-1])];
					int b = dp[i-1][j];
					dp[i][j] = Math.max(a, b);
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}

		return dp[n][w];
	}
//__Memoization_________________________________________________________________________________	
	public static int knapsackMEM(int[] weight,int value[],int maxWeight, int n , int [] [] dp){
	
		if(n == 0 ||  maxWeight == 0) {
			return 0;
		}
		
		if(weight[n-1] <= maxWeight) {
		
			if(dp[n][maxWeight]!= -1) {
				return dp [n][maxWeight];
			}
			else {
				int a = value[n-1] + knapsackMEM(weight, value, maxWeight - weight[n-1], n-1 , dp);
				int b = knapsackMEM(weight, value, maxWeight, n-1 , dp);
				int ans = Math.max(a, b);
				return dp[n][maxWeight] = ans;
			}
		}
		else {
			return dp[n][maxWeight] = knapsackMEM(weight, value, maxWeight, n-1 , dp);
		}
	}
//__Recursive____________________________________________________________________
	public static int knapsackREC(int[] weight,int value[],int maxWeight, int n){
		
		if(n == 0 ||  maxWeight == 0) {
			return 0;
		}
		if(weight[n-1] <= maxWeight) {
			int a = value[n-1] + knapsackREC(weight, value, maxWeight - weight[n-1], n-1);
			int b = knapsackREC(weight, value, maxWeight, n-1);
			return Math.max(a, b);
		}
		else {
			return knapsackREC(weight, value, maxWeight, n-1);
		}
	}
//__ MAIN  METHOD__________________________________________________________________
	
	public static int[] takeinput(int n) {
	
		int [] arr = new int[n];
		for(int i = 0; i< n ; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
		static	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
	
	int n = s.nextInt();
	
	int weight[] = takeinput(n);
	int value[]  = takeinput(n);
	int maxWeight = s.nextInt();
	int ans = knapsack(weight, value, maxWeight, n);
	System.out.println(ans);
		}
}
