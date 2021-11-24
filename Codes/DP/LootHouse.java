package DP;

import java.util.Scanner;

public class LootHouse {

	static int suml1 = 0;
	static int suml2 = 0;
	static int i = -2;
	
	public static int getMaxMoney(int arr[], int n){
		if (n == 0) 
			return 0; 
		if (n == 1) 
			return arr[0]; 
		if (n == 2) 
			return Math.max(arr[0], arr[1]); 

		// dp[i] represent the maximum value stolen 
		// so far after reaching house i. 
		int[] dp = new int[n]; 

		// Initialize the dp[0] and dp[1] 
		dp[0] = arr[0]; 
		dp[1] = Math.max(arr[0], arr[1]); 

		// Fill remaining positions 
		for (int i = 2; i<n; i++) 
			dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]); 

		return dp[n-1]; 
	} 

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i] = s.nextInt();
		}
		int ans  = getMaxMoney(arr, n);
		System.out.println(ans);
	}
}
