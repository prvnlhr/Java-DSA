package Recursion;

import java.util.Scanner;

public class Test1RecursionCheckSequence {
	static boolean res = false;	
	public static boolean isSubSequence(String a, String b)  { 

		if (a.length()== 0) { 
			res = false;
			return res; 
		}
		if (b.length()== 0) {
			res = true;
			return res; 
		}
		if (a.charAt(0)==b.charAt(0)) {
			res = true;
			return isSubSequence(a.substring(1) , b.substring(1)); 
		}
		else {
			res = false;
			isSubSequence(a.substring(1), b);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a= s.nextLine();
		String b = s.nextLine();
		boolean res = isSubSequence(a,b);
		System.out.println(res);
	}
}
