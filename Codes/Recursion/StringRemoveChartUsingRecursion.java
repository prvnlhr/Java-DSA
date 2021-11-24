package Recursion;

import java.util.Scanner;

public class StringRemoveChartUsingRecursion {
	
	public static String removeX(String input) {
//		   
//           return findString(input, 0);
//           }
//     
//	static String res="";
//           public static String findString(String s , int index) {
//        	   if(index==s.length()) {
//        		   return res ;
//        	   }
//        	   if(s.charAt(index)=='x' ) {
//        		      return findString(s.substring(1) , 1);
//        	     }
//        	   else {
//        		   res = res + s.charAt(index);
//        		   return findString(s.substring(index) , 1);
//        	   }
//           }

	//OR CN solution

           if(input.length() == 0) {
               return input;
           }

           String ans = "";

           if(input.charAt(0) != 'x' ) {
               ans = ans + input.charAt(0);
           }

           String smallAns = removeX(input.substring(1));
           return ans + smallAns;

       }
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}


}


	


