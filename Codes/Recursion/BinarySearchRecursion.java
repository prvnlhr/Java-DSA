package Recursion;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearchRecursion {

	public static int binarysearch(int[] arr, int num) {
		Arrays.sort(arr);
		int si=0;
		int ei=arr.length-1;
		return searchIndex( arr , si , ei , num);
	}
	
	public static int searchIndex(int[] arr, int si, int ei ,int num) {

		if(si>ei) {
			return -1 ;
			
			
		}
		int midIndex=(si + ei)/2;

		if(arr[midIndex]==num) {
			return midIndex;
		}
		if(num> arr[midIndex]) {
			return searchIndex(arr , midIndex+1 , ei , num);
		}
		if( arr[midIndex]< num) {
			return searchIndex(arr , si , midIndex-1 , num);
		}
		return midIndex;
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
		int num=s.nextInt();
		binarysearch(arr,num);
		System.out.println(binarysearch(arr,num));
		}
	}


