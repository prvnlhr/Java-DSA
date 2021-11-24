package Priority_Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Print_only_Kth_Largest_Element {
	
	public static int kLargest(int input[], int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		int n = input.length ;
		for(int i = 0 ; i < n; i++) {
			pq.add(input[i]);
//			if(pq.size()>k) {
//				pq.poll();
//			}
		}
		for(int i: pq) {
			System.out.print(i+" ");
		}
		int ans = pq.poll();
		System.out.println();
		return ans;
	}

//-- Main Method -------------------------------------------------
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in) ;
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		int output = kLargest(arr, k);
		System.out.println(output);
	}
}


