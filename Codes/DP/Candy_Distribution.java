package DP;

import java.util.Scanner;

public class Candy_Distribution {
//__ Iterative code___________________________________________
	public static int getMin(int arr[], int N){
		
		int dp[] = new int [N];
		dp[0] = 1;
		for(int i = 1 ; i < arr.length ; i++) {
			
			if(arr[i] > arr[i-1]) {
				dp[i] =	1 + dp[i-1];
			}
			else {
				dp[i] = 1;
			}
		}
		for(int i = N-2 ; i >= 0 ; i--){ // back track
	        if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]){
	          int c = dp[i] = dp[i+1] + 1;
	          }
	    }
		int myAns = 0;
		for(int i  = 0 ; i<dp.length ; i++) {
			myAns = myAns + dp[i];
		}
		System.out.println();
		return myAns;
		
	}
//-- Main Method -------------------------------------------
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i] = s.nextInt();
		}
		int ans = getMin(arr, n);
		System.out.println(ans);

	}

}
