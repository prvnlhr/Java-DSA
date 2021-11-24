package DP;

import java.util.Scanner;

public class Staircase {
	
	public static long staircase(int n) {
		
		if(  n == 0) {
			return n;
		}
//		long ans1 = 1 + staircase(n-2);
		long ans2 = 1 + staircase(n-3);
		return ans2;
//		return ans1+ans2;
//		return ans1+ans2+ans3;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
	}
}