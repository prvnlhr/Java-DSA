package DP;

import java.util.Scanner;

public class Steps_to_1_using_DP_ITERATIVE {
	//-- Step to 1 Recursive function ---------------------------------------------------------------------------------------------------
	public static int countStepsTo1(int n){


		int [] steps  = new int[n+1];

		for(int i = 2 ; i<=n ; i++) {

			int count1 , count2 = Integer.MAX_VALUE;
			int count3 = Integer.MAX_VALUE;

			count1 = steps[i-1];
			
			if(i%2==0) {
				count2 = steps[i/2];
			}
			if( i%3 ==0) {
				count3 = steps[i/3];
			}
			steps[i] = 1 + Math.min(count1, Math.min(count2, count3));
		}
		for(int i : steps) {
			System.out.print(i+" ");
		}
		return steps[n];
	}


	//-- Main Method ---------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countStepsTo1(n ));
	}
}


