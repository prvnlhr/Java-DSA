package Strings;

import java.util.Scanner;

//
//
//Two strings are said to be a permutation of each other when 
//either of the string's characters can be rearranged so that 
//it becomes identical to the other one.
//
//Example: 
//str1= "sinrtg" 
//str2 = "string"
//
//The character of the first string(str1) can be rearranged 
//to form str2 and hence we can say that the given strings are a 
//permutation of each other.
//
//
//Sample Input 1:
//abcde
//baedc
//Sample Output 1:
//true
//Sample Input 2:
//abc
//cbd
//Sample Output 2:
//false





public class StringPermutation {

	public static boolean reverse(String str1, String str2) {

		int count = 0;

		boolean isResult = false;
		// this code is a good example for
		// understanding loop and if else conditions
		int j;

		if (str1.length() != str2.length()) {
			isResult = false;
			System.out.println("not equal");
		}

		else {

			System.out.println("entered loop");

			for (int i = 0; i < str1.length() - 1; i++) {
				for (j = 0; j < str2.length(); j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						count++;
					}
				}
			}
			// after this loop ends, we will make conclusion
			// check if loop result satisfies or not
			if (count == str1.length() - 1) {
				isResult = true;
				System.out.println("is permutation");
			} else {
				System.out.println("equal but not per");
				isResult = false;
			}
		}
		return isResult;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean b = s.nextBoolean();
		int a = s.nextInt();
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		boolean x = reverse(str1, str2);
		System.out.println(x);
	}
}
