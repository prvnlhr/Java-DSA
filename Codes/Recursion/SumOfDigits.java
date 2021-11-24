package Recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigits(int input){

		if (input==0) { 
			return input; 
		}
		return (input % 10 ) + sumOfDigits(input / 10);
	} 

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		sumOfDigits(num);
		System.out.println(sumOfDigits(num));
	}
}
