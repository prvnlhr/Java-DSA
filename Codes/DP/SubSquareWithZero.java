package DP;

import java.util.Scanner;

public class SubSquareWithZero {

//-- Sub Square with zero -------------------------------------------------------------------------------------
	public static int findMaxSquareWithAllZeros(int[][] input){

		int max =0;
		int dp[][] = new int[input.length][input[0].length];

		for(int i = 0; i<input.length; i++){
			if(input[i][0]==0){
				dp[i][0] = 1;
				max = 1;

			} else { 
				dp[i][0] = 0;
			}
		}
		for(int j=0; j<input[0].length; j++){
			if(input[0][j]==0){
				dp[0][j] = 1;
				max = 1;
			} 
			else {
				dp[0][j] = 0;
			}
		}

		for(int i = 1 ; i< input.length; i++){
			for(int j = 1 ; j < input[0].length; j++) {

				if(input[i][j] == 1 ) {
					dp[i][j] = 0;
				}	
				else {
					dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j] ,dp[i][j-1] ));
					if(dp[i][j] > max) {
						max = dp[i][j];
					}
				}
			}
		}
		return max;
	}	
//-- Main Method -------------------------------------------------------------------------------------------------
public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int [][] input = new int[n][m];

		for(int i = 0 ;i < n ; i ++ ) {
			for(int j = 0 ; j< m ; j++) {
				input[i][j] = s.nextInt();
			}
		}
		int ans = findMaxSquareWithAllZeros(input);
		System.out.println(ans);
	}
}
