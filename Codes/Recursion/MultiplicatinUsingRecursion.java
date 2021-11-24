package Recursion;

import java.util.Scanner;

public class MultiplicatinUsingRecursion {
	
	public static int multiplyTwoIntegers(int n , int  m) {
		
		
		
		return m*n;
		
	}
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		multiplyTwoIntegers( n , m);
		System.out.println(multiplyTwoIntegers(n , m));
	}

}
