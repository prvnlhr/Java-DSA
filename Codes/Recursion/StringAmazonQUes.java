package Recursion;
import java.util.Scanner;

public class StringAmazonQUes {


	public static String stringoutput(String str) {

		str=str+" ";				
		int wordcount=1;
		int	wordstart=0;
		int wordend=0;
		String result="";

		for(int j=wordstart;j<str.length()-1;j++){

			if(str.charAt(j)==str.charAt(j+1)){
				wordcount++;
			}

			if(str.charAt(j)!=str.charAt(j+1)) {
				result=result+str.charAt(j)+wordcount;
				wordend=j-1;
				wordstart=wordend;
				wordcount=1;
			}
		}
		return result;
	}

	public static String takeinput() {

		Scanner a=new Scanner(System.in);
		String str=a.nextLine();
		return str;
	}

	public static void main(String[] args) {

		String str=takeinput();
		String result=stringoutput(str);
		System.out.println(result);
	}
}


