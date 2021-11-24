package Strings;

import java.util.Scanner;




//A palindrome is a word, number, phrase, or other sequences of characters 
//which read the same backwards and forwards.
// 1. abcdcba
// true
//2 . coding
// false

public class StringPalindrome {

	public static boolean reverse(String str) {

		int i=0;
		int j=str.length()-1;

		while(i<=(str.length()/2)-1) {
0
.
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;       //in String we should use equals function rather then == 
			j--;
		}
		if(i==str.length()/2-1) {

		}
		return true;
	}

	//OR CN solution
	//		int i=0;
	//		int j=str.length()-1;
	//		
	//		while(i<j) {
	//			if(str.charAt(i)!=str.charAt(j)) {
	//				return false;
	//			}
	//			i++;
	//			j--;
	//		}
	//		return true;
	//}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.nextLine();

		boolean x = reverse(str);
		System.out.println(x);

	}
}

