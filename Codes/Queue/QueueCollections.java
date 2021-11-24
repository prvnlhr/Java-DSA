package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
	
		
		
	}

}
