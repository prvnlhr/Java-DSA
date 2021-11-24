package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionMaximumProfit {

	public static int maximumProfit(int[] budgets) {
		Arrays.sort(budgets);


		//Creating a new array of profits for all prices one by one
		int [] profits = new int[budgets.length];

		for(int i = 0 ; i<budgets.length; i++) {
			profits[i]= Profit(budgets , i);
		}
		//fuction to decide which profit is max
		return MaxProfit(profits , 0); 
	}


	static int res = 0;
	static int max = Integer.MIN_VALUE;
	
	public static int MaxProfit( int [] profits , int index) {

		if(index > profits.length-1) {
			return max;
		}
		if(profits[index] > max) {
			max=profits[index];
		}
		return MaxProfit(profits, index+1);
	}

	//profits array creation
	public static int  Profit(int [] budgets , int index) {
		int profit = 0;
		for(int j = 0; j<budgets.length; j++) {
			if(budgets[j]>=budgets[index]) {
				profit = profit+budgets[index];
			}
		}
		return profit ;
	}

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		int buyers = s.nextInt();
		int[] budgets = new int[buyers];
		for(int i = 0 ; i<budgets.length; i++) {
			budgets[i]=s.nextInt();
		}

		int res = maximumProfit(budgets);
		System.out.println(res);
	}
}
