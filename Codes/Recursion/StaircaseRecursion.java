package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class StaircaseRecursion {
//-- Staircase Function:
	public static long  staircase(int n){
		long [] res = new long [n + 1]; 
		res[0] = 1; 
		res[1] = 1; 
		res[2] = 2; 

		for (int i = 3; i <= n; i++) 
			res[i] = res[i - 1] + res[i - 2] + res[i - 3]; 
		return res[n]; 
	} 
//-- MAIN METHOD:
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase( n));
	}
}
