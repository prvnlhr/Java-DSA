package DP;

import java.util.Scanner;

public class min_Square_count_Memoization {

	public static int minCountMEMO(int n) {

		int [] dp = new int[n+1];
		for(int i  = 0 ; i< n ; i++) {
			dp[i]= -1;
		}
		return minCounthelper(n, dp);  
	}
	public static int minCounthelper(int n  , int [] dp) {    

		if(n == 0){
			return 0;
		}

		int minAns = Integer.MAX_VALUE;
		for(int  i = 1 ; i*i<=n ; i++){
			int currAns;
			if(dp[ n-(i*i)] == -1) {
				currAns  = minCounthelper(n-(i*i),dp);
				dp[n-(i*i)]= currAns;
			}
			else {
				currAns = dp[n-(i*i)];
			}
			if(minAns > currAns){
				minAns = currAns;
			}
		}
		int myAns = 1 + minAns;
		return myAns;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(minCountMEMO(n));
	}
}
