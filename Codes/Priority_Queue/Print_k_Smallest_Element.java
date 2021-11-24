package Priority_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Print_k_Smallest_Element {
	
	public static ArrayList<Integer> kSmallest(int[] input, int k) {
		ArrayList<Integer>ans = new ArrayList<Integer>();
		  PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int n = input.length ;
		for(int i = 0 ; i < n; i++) {
			pq.add(input[i]);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		for(int i: pq) {
			ans.add(i);
			}
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
		ArrayList<Integer> output = kSmallest(arr, k);
		for(int i: output) {
			System.out.println(i);
		}
	}
}


