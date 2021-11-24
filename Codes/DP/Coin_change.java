package DP;

import java.util.Scanner;

public class Coin_change {
	
//-- COIN CHANGE FUNCTION ---------------------------------------------
	public static int countWaysToMakeChange(int denominations[], int value){
//		
		int dp[] = new int[denominations.length+1];
		for(int i = 0 ; i<dp.length ; i ++) {
			dp[i] = -1;
		}
		int n = denominations.length;
//		return countWaysMEM(denominations, value, n, dp);
//		return countWaysI(denominations, value);
		return countWaysREC(denominations, value, n);
	
	}
//__ recursive________________________________________________________
	public static int countWaysREC(int arr[] , int value , int n) {
		
		if(value == 0) {
			return 1;
		}
		if(value < 0) {
			return 0;
		}
		if(n <= 0 && value>=1) {
			return 0;
		}
		int a  = countWaysREC(arr, value, n-1) ;
		int b = countWaysREC(arr, value - arr[n-1], n);
		int ans = a+b;
		return ans;
	}
//__ MEMOIZATION_______________________________________________________
	public static int countWaysMEM(int arr[] , int value , int n , int dp[] ) {
		
		if(value == 0) {
			return 1;
		}
		if(value < 0) {
			return 0;
		}
		if(n <= 0 && value>=1) {
			return 0;
		}
		if(dp[n]!=-1) {
		return dp[n];
		}
		else {
			int a  = countWaysMEM(arr, value, n-1 , dp) ;
			int b = countWaysMEM(arr, value - arr[n-1], n , dp);
				return dp[n] = a+b;
			}
	}
//__ Iterative___________________________________________________________
	public static int countWaysI(int arr[] , int value ) {
		int n = arr.length;
		int dp [][] = new int  [n][value+1];
		for(int i = 0 ; i < n ; i++) {
			
					dp[i][0] = 1;
				}
		
		
		for(int i = 1 ; i <n ; i++) {
			for(int j = 1 ; j <value ; j++) {
				if(arr[i-1] <= j) {
					int a =  dp[i-1][j-(arr[i-1])];
					int b = dp[i-1][j];
					dp[i][j] = a+b;
				}
				else {
					dp[i][j] = dp[i-1][j];
				}

			}
		}
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<=value ; j++) {
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		int ans = dp[n-1][value];
		return ans;
		}
	
	
//-- MAIN METHOD ---------------------------------------------------
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int  n = s.nextInt();
	int arr[]  = new int[n] ;
	
	for(int i = 0 ; i<n ; i++) {
		arr[i] = s.nextInt();
		}
	int value  = s.nextInt();
	int ans = countWaysToMakeChange(arr,value);
	System.out.println(ans);
	}
}

