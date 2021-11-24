package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortRecursion {

	public static int[] binarysearch(int[] input) {

		int mid = input.length/2;
		int l = input.length;
		int [] s1 = new int[mid];
		int [] s2 = new int[l-mid];
		newArray(input , s1 , 0);
		newArray(input , s2 , mid);
		Arrays.sort(s1);
		Arrays.sort(s2);
   
		int ans[]=mergeSort(input , s1 , s2);
		return ans;
		}





	public static int [] mergeSort( int [] input , int [] s1 , int [] s2){
  
             
		int i=0;
		int j=0;
        int l=0;
		if( l==input.length-1) {
			return input;
		}
        if(s1[i]<s2[j]) {
				input[l]=s1[i];
				i++;
				l++;
				
			  }
			if(s1[i]>s2[j]) {
				input[l]=s2[j];
				j++;
				l++;
			
			}
		
		return input;
	}


	public static int [] newArray(int[] input , int [] arr , int si) {

		for(int i=0 ; i<arr.length; i++) {

			arr[i]=input[si];
			si=si+1;
		}

		return arr;


	}

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {

		int size = s.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = takeInput();
		int[] ans=binarysearch(arr);
             for(int i= 0; i<ans.length; i++) {
            	 System.out.print(ans[i]+" ");
             }
            	 
             }
}



