package DP;

import java.util.Scanner;

public class SubsetSum {
//__ Subset function ____________________________________
	
	public static boolean subsetSum(int arr[] , int n , int sum) {
		
	
		 return subsetSumI(arr, n, sum );
		
	}
	
	public static boolean subsetSumI(int arr[] , int n , int sum ) {
		boolean [][] dp = new boolean [sum+1][n+1];
		 for (int i = 0; i <= n; i++) {
			 dp[0][i] = true;
		 }
		 for (int i = 1; i <= sum; i++) { 
	            dp[i][0] = false; 
		 }
		 for (int i = 1; i <= sum; i++) { 
	            for (int j = 1; j <= n; j++) { 
	                dp[i][j] = dp[i][j - 1]; 
	                if (i >= arr[j - 1]) 
	                    dp[i][j] = dp[i][j] || dp[i - arr[j - 1]][j - 1]; 
	            } 
	        }
	        return dp[sum][n];
	}
//		____________________________________________________
		public static boolean subsetSumREC(int arr[] , int n , int sum) {
			
			if(sum == 0) {
				return true;
			}
			if(n == 0 && sum != 0) {
				return false;
			}
			if(arr[n-1] > sum) {
				return subsetSumREC(arr, n-1, sum);
			}
			else {
				boolean a = subsetSumREC(arr, n-1, sum);
				boolean b = subsetSumREC(arr, n-1, sum - arr[n-1]);
				return a||b;
			}
		}
	
	
	
//-- Main method -----------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr [] = new int[n];
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i]= s.nextInt();
			}
		int sum = s.nextInt();
		boolean ans = subsetSumI(arr, n, sum);
		if(ans){
	        System.out.println("Yes");
	        }
	        else {
	             System.out.println("No");
	        }
		System.out.println(ans);
	}

}
