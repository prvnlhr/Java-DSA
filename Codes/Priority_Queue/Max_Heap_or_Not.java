package Priority_Queue;

import java.util.Scanner;

public class Max_Heap_or_Not {
//-- Max_heap_or_Not function -------------------------------------------
	public static boolean checkMaxHeap(int arr[]) {

		int n = arr.length;
		boolean ans = true;

		for(int  i = 0 ; i<= (n-2)/2 ; i++) {
			int parentIndex = i;
			int leftchildIndex = 2*i+1;
			int rightchildIndex = 2*i+2;

			if(arr[parentIndex] < arr[leftchildIndex]) {
				return false;
			}
			if(rightchildIndex < n && arr[parentIndex] < arr[rightchildIndex]) {
				return false;
			}
		}
			return true;
		}
	
	
//-- Main Method --------------------------------------
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0 ; i<n ;i++) {
			arr[i] = s.nextInt();
		}
		boolean output = checkMaxHeap(arr);
		System.out.println(output);
	}
}
