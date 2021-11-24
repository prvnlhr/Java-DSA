package Strings;

import java.util.Scanner;

public class StringMinimumLengthWord {
	// function to find minimum length word

	public static String minimumwordlength(String str) {
		// str == str+ " " adding space for last character
		str=str+" ";

		int count=0;
		int minvalue=Integer.MAX_VALUE;
		String minLengthWord=null;

		int wordstart=0;
		int wordend=0;;
		int wordcount=0;
		int printstart=0;
		int printend=0;

		int i;

		for(i=wordstart; i<str.length();i++) {

			//if string has only one character
			if(str.length()==1) {
				System.out.println(str);
				minLengthWord=str;

				return minLengthWord;
			}

			// if no space found 
			if(str.charAt(i)!=' ') {
				wordcount++; 
			}

			// if space found word ends condition
			else if(str.charAt(i)==' ') {
				wordend=i;

				if(wordcount<minvalue) {

					minvalue=wordcount;
					wordstart=wordend+1; 
					printend=i;
					printstart=i-wordcount;
					wordcount=0;
				}
				else {
					wordcount=0;
				}
			}
		}
		return minLengthWord=str.substring(printstart, printend);
	}

	//taking input of string
	public static String takeinput() {

		Scanner s=new Scanner(System.in);

		String str=s.nextLine();
		return str;
	}

	public static void main(String[] args) {

		String str=takeinput();

		String minWordLength=minimumwordlength(str); 

		System.out.println(minWordLength);
	}
}
