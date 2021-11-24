package DP;

import java.util.Scanner;

public class min_Square_count {
	
//___ ITERATIVE __________________________________________________________________________
	
	public static int minCountI(int n) {
			
		int [] dp = new int[n+1];
		dp[0] = 0 ;

		for(int i = 1 ; i <= n ; i++) {

			int minAns = Integer.MAX_VALUE;
			for(int  j = 1 ; j*j <= i ; j++ ) {

				int currAns = dp[i - (j*j)];
				if(minAns > currAns) {
					minAns = currAns;
				}
			}
			dp[i] = 1 + minAns;
		}
		return dp[n];
	}
		
//___ MEMOIZATION ____________________________________________________________________________
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
	
//__ RECURSIVE _______________________________________________________________________________________________________________	
	public static int minSquareCountREC(int n) {

		if(n==0){
			return 0;
		}
		int minAns = Integer.MAX_VALUE;
		for(int  i = 1 ; i *i <= n ; i++){
			int currAns  = minSquareCountREC(n-(i*i));
			if(minAns > currAns){
				minAns = currAns;
			}
		}
		int myAns = 1 + minAns;
		return myAns;
	}
//---------------------------------------------------------
//-- Main Method :
	public static void main(String[] args) {

		Scanner s =  new Scanner(System.in);
		int n  = s.nextInt();
		int ans = minCountI(n);
		System.out.println(ans);
	}
}
