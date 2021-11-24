package Arrays;

import java.util.Scanner;

public class binarySearch {
	public static int binarysearch(int[] arr){

		int start=0;
		int end =arr.length-1;
      int [] arr1= {7,3,2,4,6,8};

      for(int i=0; i<arr1.length;i++) {		
	
    	  while(start<=end){
		
		int mid=(start+end)/2;

			if((arr1[i])==arr[mid]) {
				System.out.println(arr1[i]);
				return mid;
			}
			
			
			else if(arr1[i]>arr[mid]) {	   
				start=mid+1;
			}
			
			else {
				end=mid-1;
		}
	}
		
	}
	return -1;
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

//		int num=s.nextInt();
		binarysearch(arr);
		System.out.println(binarysearch(arr));
    }
 }



