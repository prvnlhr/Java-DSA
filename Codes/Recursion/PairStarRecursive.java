package Recursion;

import java.util.Scanner;

public class PairStarRecursive {
	
	public static String addStars(String s) {

		if(s.length()==1) {
			return s;
		}
		if(s.charAt(0)!=s.charAt(1)) {
			return s.charAt(0)+	addStars(s.substring(1));
		}
		else {
			return s.charAt(0)+ "*" +	addStars(s.substring(1));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		addStars( a);
		System.out.println(addStars(a));
	}
}
