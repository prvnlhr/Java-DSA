package Strings;
import java.util.Scanner;


//
//Input String: "aaaa"
//Expected Output: "a"
//
//Input String: "aabbbcc"
//Expected Output: "abc"

//
//Sample Input 1:
//aabccbaa
//Sample Output 1:
//abcba
//Sample Input 2:
//xxyyzxx
//Sample Output 2:
//xyzx



public class StringRemoveConsecutives {

	public static String reversewordwise(String str) {


		char lastch=str.charAt(0);

		String ans=""+str.charAt(0);

		for(int i=0; i<str.length(); i++) {

			if(str.charAt(i)!=lastch) {

				ans=ans+str.charAt(i);

				lastch=str.charAt(i);
			}
		}

		return ans;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str = s.nextLine();
		String ans=reversewordwise(str);
		System.out.println(ans);
	}
}


