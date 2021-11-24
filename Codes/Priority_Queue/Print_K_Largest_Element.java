package Priority_Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Print_K_Largest_Element {
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer>ans = new ArrayList<Integer>();
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
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
		ArrayList<Integer> output = kLargest(arr, 5);
		for(int i: output) {
			System.out.println(i);
		}
	}
}


