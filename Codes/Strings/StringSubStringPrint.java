package Strings;

import java.util.Scanner;

public class StringSubStringPrint {

	public static void printString(String str) {

		for (int i = 0; i < str.length(); i++) {

			for (int j = i; j < str.length(); j++) {

				System.out.println(str.substring(i, j + 1));
			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		printString(str);
	}
}