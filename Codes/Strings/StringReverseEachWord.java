package Strings;
import java.util.Scanner;

public class StringReverseEachWord {

//	Sample Input 1:
//		Welcome to Coding Ninjas
//	Sample Output 1:
//		emocleW ot gnidoC sajniN
//	Sample Input 2:
//		Always indent your code
//	Sample Output 2:
//		syawlA tnedni ruoy edoc
//	
	
	
	public static String reversewordwise(String str) {

		//     String ans="";
		//     
		//     int currentWordstart=0;
		//  int i=0;
		//     
		//     for(i=0; i<str.length(); i++) {
		//    	 
		//    	 if(str.charAt(i)==' ') {
		//    		 
		//    		 int currentWordEnd=i-1;
		//    		 String reverseWord=" ";
		//    		  reverseWord=" ";
		//    		 for(int j=currentWordstart; j<=currentWordEnd;j++) {
		//    			 
		//    			 reverseWord=str.charAt(j)+reverseWord;
		//    			 
		//    		 }
		//    			 ans+=reverseWord;
		//    			 currentWordstart=i+1;    
		//    			
		//    		 }
		//     }
		//    	
		//    	 String reverseWord="";
		//    	 int currentWordEnd=i-1;
		//    	 
		//    	 for(int j=currentWordstart; j<=currentWordEnd;j++) {
		//    		 
		//    		 reverseWord=str.charAt(j)+reverseWord;
		//    	 }
		//    
		//        ans=ans+reverseWord;
		//    	 return ans;
		//     }
		//OR coding ninja solution
		//after reversing every word..the last word does not have space at end so the program wont print it
		//so for that case we can apply else condition which we state that if there is no space after
		//the word we can directly print using substring
		
		String reverse="";  
		int index = 0;

		for(int i=0; i<str.length(); i++) {

			if(str.charAt(i)==' ') {

				reverse = reverse+str.charAt(i);
				index = i+1;
			}
			else {
				reverse = reverse.substring(0, index) + str.charAt(i) + reverse.substring(index);
			}
		}
		return reverse;
	}
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.nextLine();

		String ans = reversewordwise(str);
		System.out.println(ans);
	}
}


