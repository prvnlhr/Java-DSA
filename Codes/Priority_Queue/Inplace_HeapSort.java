package Priority_Queue;

import java.util.Scanner;

public class Inplace_HeapSort {
	
//-- Heap Sort function ----------------------------------------------
	public static void heapSort(int[] input) {
		//Building heap from input array:
		int n = input.length;	
		for(int i = (n/2)-1; i>=0 ; i-- ) {
			downHeapify(input , i , n);
		}
		// Remove elements from staring one by one and put them at respective last position:
		for(int i = n-1 ; i>=0 ; i--) {
			int temp = input[i];
			input[i] = input[0];
			input[0] = temp;
			downHeapify(input ,0 ,i);
		}
	}
	
//__downHeapify________________________________________________-	
	public static void downHeapify(int [] arr , int i , int n) {

		int parentIndex = i ;
		int leftChildIndex = 2* parentIndex + 1;
		int rightchildIndex = 2* parentIndex + 2;

		while(leftChildIndex < n) {
			int minIndex = parentIndex;
			if(arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			if(rightchildIndex < n && arr[rightchildIndex] < arr[minIndex]) {
				minIndex = rightchildIndex;
			}
			if(minIndex == parentIndex) {
				return ;
			}
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp ;
			parentIndex = minIndex;
			leftChildIndex = 2* parentIndex +1 ;
			rightchildIndex = 2* parentIndex +2 ;
		}

	}
//-- Main Method -------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[]= new int[n];

		for(int i = 0; i<n; i++){
			arr[i]=s.nextInt();
		}
		
		heapSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
