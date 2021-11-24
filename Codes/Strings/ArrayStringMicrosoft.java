package Strings;

import java.util.Scanner;

public class ArrayStringMicrosoft {
	
	public static int anagramcount(int []count) {
		int wordcount=1;
		int newvalue=0;
		int wordstart=1;
		int j;
		for(int i=0; i<count.length;i++) {
		
			for(j=wordstart;j<count.length;j++) {
				
			
			if(count[i]==count[j]) {
				wordcount++;
				count[j]=++newvalue;
				
			}
		}
			System.out.print(wordcount+",");
			wordcount=1;
			wordstart=j;
		}
		return 0;
		
	}

	public static int [] anagramstring(String[] arr) {
		int n=arr.length;
        int [] count =new int[n];
        String str1="";
//        System.out.println(str1);
       int result=0;
      
      
    	   for(int i=0; i<arr.length;i++) {
    		      str1=arr[i];
    		       result=0;
                for(int j=0; j<str1.length();j++) {
//                	System.out.println(str1.charAt(j));
    			   result=result+str1.charAt(j);
    			   count[i]=result;
                 }
//    		   System.out.print(result+" ");
//    		   System.out.println();
    	   }
       

	return count;

	}

	public static String[] takeinput() {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] arr=new String[n];

		for(int i=0; i<n;i++) {
			arr[i]=scan.next();
		}                           //we use next instead of next line because
		                             //of array count which is integer
		return arr;
	}

	public static void main(String[] args) {

		String [] arr=takeinput();
		int [] count=anagramstring(arr);
		
		int output=anagramcount(count);
		
//		for(int i=0;i<count.length;i++) {
//				System.out.print(count[i]+" ");
//}
//	}
//}
	}
}
