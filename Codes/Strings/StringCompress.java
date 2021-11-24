package Strings;
import java.util.Scanner;

public class StringCompress {

	public static String StringCompress(String input) {

		String finalprint;
		int wordstart=0;
		String printword="";
		int wordend=input.length();
		String ans="";

		for(int i=0; i<input.length();i++) {
			int wordcount=0;

			for(int j=wordstart; j<wordend; j++) {

				if(input.charAt(wordstart)!=input.charAt(j)) {

                    if(wordcount>1) {
						printword=printword+input.charAt(j-1)+""+wordcount;
						wordstart=j;
						break;
					}
                    if(wordcount==1) {
						printword=printword+input.charAt(j-1);
						wordstart=j;
						break;
					}
                   }
				else {
					wordcount++;
                    }
                  }
                }
		finalprint=printword+input.charAt(input.length()-1);
		return finalprint;
        }
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.nextLine();

		String finalprint= StringCompress(input);
		System.out.println(finalprint);
	}
  }


