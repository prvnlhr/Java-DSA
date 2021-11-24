package jnk;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConsecutiveOrNot2WithoutSorting {

	public static boolean containsConsecutiveNumbers(int [] input) {

		boolean result=false;
		int min=1000;
	//finding the minimum number in array	
		for(int i=0; i<input.length;i++) {
			if(input[i]<min) {
				min=input[i];
			}
		}
 // checking if all array elements are min+1 elements or not
//		i.e if all elements difference is 1 then we have consecutive elements
		int count=0;
    for(int k=0;k<input.length;k++) {
    	 
    	 for(int j=0; j<input.length;j++) {
			if(input[j]==min+1) {
				min=input[j];
				count++;
				break;
			}
		}
	}
   //Deciding result on basis of 'count' 
    if(count==input.length-1) {
    	 result=true;
     }
     else if(count<input.length-1) {
    	 result=false;
     }
		return result;
	}
		
	public static int[] takeinput(){

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] input=new int[n];

		for(int i=0; i<input.length;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {

		int input[]=takeinput();
		boolean result=containsConsecutiveNumbers(input);
		System.out.println(result);
     }
  }
