package Strings;
import java.util.Scanner;

public class StringReverse {

	public static String reverse(String str) {

		String reverse="";

		for(int i=str.length()-1;i>=0;i--) {

			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.nextLine();

		String ReverseString=reverse(str);
		System.out.println(ReverseString);
	}
}


