package Arrays;

import java.util.Scanner;

public class ArrayTripletsum {
	public static void TripletPairs(int[] arr , int sum) {

		        int l, r; 
		  
		        /* Sort the elements */
		        arr=ArraySort(arr); 
		  
		        /* Now fix the first element one by one and find the 
		           other two elements */
		        for (int i = 0; i < arr.length - 2; i++) { 
		  
		            l = i + 1; 
		            r = arr.length-1; 
		            while (l < r) { 
		                if (arr[i] + arr[l] + arr[r] == sum) { 
		                    System.out.println(arr[i] + " " + arr[l] + " " + arr[r]); 
		                      l++;
		                    
		                } 
		                else if (arr[i] + arr[l] + arr[r] < sum) 
		                    l++; 
		 
		                else  // A[i] + A[l] + A[r] > sum 
		                    r--; 
		            } 
		        }
		    }
	  public static int[] ArraySort(int[] arr) {
			
//			Arrays.sort(arr);
		     int temp=0;
			for (int i = 0; i <arr.length ; i++)  {
		            for (int j = i + 1; j < arr.length; j++) { 
		                if (arr[i] > arr[j]) 
		                {
		                    temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
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
		int sum = s.nextInt();
		TripletPairs(arr,sum);
	}
}






