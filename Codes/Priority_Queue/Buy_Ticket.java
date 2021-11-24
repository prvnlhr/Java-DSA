package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Buy_Ticket {
	
//-- Buy Ticket function -------------------------------------------------------------------------------------------------------
	public static int buyTicket(int input[], int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int time = 0;	
		int me = input[k];
		int n = input.length;
		for(int i = 0 ; i<n ;i++) {
			pq.add(input[i]);
		}
		while(!pq.isEmpty()) {
			int a = pq.poll();
			time++;
			if(a==me) {
				return time;
			}
		}
		return time;
	}
//-- Main Method ----------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0 ; i<n ; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		int ans = buyTicket(input, k);
		System.out.println(ans);
	}
}
