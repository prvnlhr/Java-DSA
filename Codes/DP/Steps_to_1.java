package DP;

import java.util.Scanner;

public class Steps_to_1 {
	//-- Step to 1 Recursive function ---------------------------------------------------------------------------------------------------
	public static int countStepsTo1(int n){

		if( n==1) {
			return 0;
		}
		int count1 = Integer.MAX_VALUE;
		int count2 = Integer.MAX_VALUE;
		int count3 = Integer.MAX_VALUE;

		count1 = countStepsTo1(n-1);

		if(n%2 ==0) {
			count2  = countStepsTo1(n/2);
		}
		if(n%3==0) {
			count3 = countStepsTo1(n/3);
		}
		return Math.min(count1, Math.min(count2, count3));
	}

	//-- Main Method ---------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countStepsTo1(n));
	}

}
