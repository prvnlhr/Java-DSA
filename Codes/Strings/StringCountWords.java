package Strings;
import java.util.Scanner;

public class StringCountWords {

	public static int countWords(String str) {
		int count=1;
		for(int i=0; i<str.length();i++) {

			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str = s.nextLine();
		//System.out.println(count);

		int count=countWords(str);

		System.out.println(count);
	}
}



