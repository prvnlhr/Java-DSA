package Recursion;

import java.util.Scanner;

public class CheckPalindromeRecursively {

	private static boolean isStringPalindrome(String input) {

		if(input.length()<=1){

			return true;
		}

		if(input.charAt(0)==input.charAt(input.length()-1)) {

			return isStringPalindrome(input.substring(1 , input.length()-1));
		}
		else {
			return false;

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		isStringPalindrome(input);
		System.out.println(isStringPalindrome(input));
	}

}
