package Recursion;

import java.util.Scanner;

public class CheckNumberInArray {

	public static boolean checkNumber(int[] input, int x) {
         
         
        boolean present = ans(input , 0 , x);
        return present;
	}
	
	  public static boolean ans(int [] input , int index , int x ) {
		  if(index == input.length) {
			  return false;
		  }
	  if(input[index]==x) {
		  return true;
	  }
	 return ans(input , index+1 , x);
	  }







	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] input = new int[size];

		for(int i = 0; i<input.length; i++) {
			input[i] = s.nextInt();
		   }
		int num = s.nextInt();
		boolean present=checkNumber(input , num);
		System.out.println(present);
	}
}

