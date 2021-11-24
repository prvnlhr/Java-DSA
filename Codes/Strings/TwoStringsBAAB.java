package Strings;

import java.util.Scanner;

public class TwoStringsBAAB {

	public static void twoSubstrings(String str) {

		for(int i=0; i<str.length()-2;i++) {

			if(str.charAt(i)=='B' & str.charAt(i+1)=='A' ) {
				System.out.println("ba loop");

				for(int j=i+2;j<str.length()-1;j++) {


					if(str.charAt(j)=='A' & str.charAt(j+1)=='B') {

						System.out.println("yes");
						return;
					}

					System.out.println(j);
				}
			}
			else if(str.charAt(i)=='A' & str.charAt(i+1)=='B') {
				System.out.println("ab loop");

				for(int k=i+2;k<str.length()-1;k++) {

					if(str.charAt(k)=='B' & str.charAt(k+1)=='A') {

						System.out.println("yes");
						return;
					}
				}
			}
		}
		System.out.println("no");
	}

	public static String takeinput() {

		Scanner s=new Scanner(System.in);

		String str=s.nextLine();

		return str;
	}

	public static void main(String[] args) {

		String str=takeinput();

		twoSubstrings(str);

		//System.out.println(twoString);
	}






}


