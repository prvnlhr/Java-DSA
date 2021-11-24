package DP;

import java.util.Scanner;

public class Smallest_Super_Sequence_of_Two_Strings {
//__ Smallest_Super_Sequence_of_Two_Strings_________________________________
	public static int smallestSuperSequence(String str1, String str2) {
	
		int m = str1.length();
		int n = str2.length();
		int [][] dp = new int[m+1][n+1];
		for(int i = 0 ; i < dp.length ; i++) {
			for(int j = 0 ; j< dp[0].length ; j++) {
				dp[i][j] = 0;
			}
		}
		return superSquenceMEM(str1, str2, m, n, dp);
	   //return superSequenceREC(str1, str2, m, n );
	}
	
//__ Memoization______________________________________________________________________
	public static int superSquenceMEM(String str1 , String str2 , int m , int n , int [][] dp ) {

		if( m == 0) {
			return n;
		}
		if( n == 0) {
			return m;
		}
		if(str1.charAt(m-1) == str2.charAt(n-1)){
			if(dp[m][n] == 0){
				int ans = 1 + superSquenceMEM(str1, str2, m-1, n-1 , dp);
				dp[m][n]= ans;
				return  ans;
			}
			else {
				return dp[m][n];
			}
		}
		else {
			if(dp[m][n]==0) {
				int a = superSquenceMEM(str1, str2, m-1, n , dp);
				int b = superSquenceMEM(str1, str2, m, n-1 , dp);
				int ans = 1 +Math.min(a, b);
				dp[m][n] = ans;
				return ans;
			}
			else {
				return dp[m][n];
			}
		}

	}
//__ Recursive_________________________________________________________________________
	public static int superSequenceREC(String str1, String str2 , int m , int n) {
	

		if( m == 0) {
			return n;
		}
		if( n ==0) {
			return m;
		}
		if(str1.charAt(m-1) == str2.charAt(n-1)){
			return  1 + superSequenceREC(str1, str2, m-1, n-1);
		}
		else {
			int a = superSequenceREC(str1, str2, m-1, n);
			int b = superSequenceREC(str1, str2, m, n-1);
			return 1 +Math.min(a, b);
		}
	}
	
//-- Main method ---------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		int ans = smallestSuperSequence(s1, s2);
		System.out.println(ans);
	}
}
