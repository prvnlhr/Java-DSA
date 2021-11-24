package Recursion;

import java.util.Scanner;

public class StringRemoveDuplicateRecursion {
	static String res ="";

	public static String removeDuplicate(String input) {

		if(input.length()<=1 ) {
			return res + input.charAt(input.length()-1) ;
		}
		if(input.charAt(0)==input.charAt(1)) {
			res = res + input.charAt(0);
			return removeDuplicate(input.substring(2));
		}

		if(input.charAt(0)!=input.charAt(1)) {
			res =res + input.charAt(0);
			return removeDuplicate(input.substring(1));
		}
		return res;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeDuplicate(input));
	}


}

