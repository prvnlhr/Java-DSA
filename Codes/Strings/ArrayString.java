package Strings;


public class ArrayString {
	
	public static void main(String[] args) {
		
//		String str="Coding Ninja";
		
//		System.out.println(str);
//		System.out.println(str.length());      //length is 12 because it counts space between coding and ninja
//		System.out.println(str.charAt(5));
		
		
//		String str1="coding";
//		String str2=" is fun";
		
//		str1+=str2;
//		System.out.println(str1+=str2);
		
		//or
		
//		System.out.println(str1.concat(str2));
		
		
//		System.out.println(str1.equals(str2));  //compares length
		
//		System.out.println(str1.compareTo(str2)); 
		
	
//  System.out.println(str1.substring(1, 5));
//		String a="coding";
//		for(int i=2;i<4;i++)
//		{
//		    System.out.println(a.substring(i));
//		}
//	}
//}
		String a="coding";
		for(int i=2;i<5;i++)
		{
		    System.out.print(a.substring(i-2,i+1));
		}
	}
}