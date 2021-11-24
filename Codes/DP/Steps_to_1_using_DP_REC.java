package DP;

import java.util.Scanner;

public class Steps_to_1_using_DP_REC {
	//-- Step to 1 Recursive function ---------------------------------------------------------------------------------------------------
	public static int countStepsTo1(int n , int [] dp){

		if( n==1) {
			return 0;
		}
		int count1;
//--------------------------------------------------
		if(dp[n-1]== -1) {
			count1 = countStepsTo1(n-1 , dp);
			dp[n-1]= count1;
			}
		else {
			count1 = dp[n-1];
			}
//---------------------------------------------------
		int count2 = Integer.MAX_VALUE;
		if(n%2 ==0) {
			if(dp[n/2]==-1) {
				count2  = countStepsTo1(n/2 , dp);
				dp[n/2] = count2;
				}
			else {
				count2 = dp[n/2] ;
				}
			}
//---------------------------------------------------
		int count3 = Integer.MAX_VALUE;
		if(n%3==0) {
			if(dp[n/3]== -1) {
				count3 = countStepsTo1(n/3 , dp);
				dp[n/3] = count3;
				}
			else {
				count3 = dp[n/3];
				}
			}
//-----------------------------------------------------
		int myAns = 1 + Math.min(count1, Math.min(count2, count3));
		return myAns;
	}

	//-- Main Method ---------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] dp = new int[n+1];
		for(int i = 0 ; i<n ; i++) {
			dp[i] = -1;
		}
		System.out.println(countStepsTo1(n , dp));
	}
}


