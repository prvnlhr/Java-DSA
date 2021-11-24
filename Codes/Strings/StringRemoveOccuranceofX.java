package Strings;

import java.util.Scanner;

//Sample Input 1:
//aabccbaa
//a
//Sample Output 1:
//bccb
//Sample Input 2:
//xxyyzxx
//y
//Sample Output 2:
//xxzxx

public class StringRemoveOccuranceofX {

	public static String removeX(String str, char x) {
		String print = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != x) {
				print = print + str.charAt(i);
			} else {
				continue;
			}
		}
		return print;
	}
	
	
//optimised o(n) o(1)
	public static void removeXOptimised(String str, char x) {
		String print = "";

		char[] t = str.toCharArray();
		int j = 0;
		int count = 0;

		for (int i = j; i < str.length(); i++) {

			if (t[i] != x) {
				t[j++] = t[i];
				System.out.println(t);
			} else {
				count++;
				System.out.println(count);
			}
		}

		System.out.println(j);

		while (count > 0) {

			t[j++] = '\0';
			System.out.println(t);

			count--;

		}

//		
//		
//		for (int j = 0 ; j < str.length(); j++){
//			
//			int count = 0;
//			if(str.charAt(j)== x) {
//				count = count + 1;
//			}
//			
//		}

		System.out.println(t);

	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str = s.nextLine();

		char x = s.next().charAt(0);

		removeXOptimised(str, x);

	}
}
