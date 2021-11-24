package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
	
	static int power=1;
	public static int power(int x, int n) {
		
		if(n>0) {
			
			power=power*x;
			power(x,n-1);
			
		}
		return power;
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(power(x, n));
	}

}


