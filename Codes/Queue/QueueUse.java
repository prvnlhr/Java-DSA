package Queue;

import java.util.Scanner;

public class QueueUse {
	public static void main(String[] args) throws QueueFullException {
	
//		QueueUsingArray q = new QueueUsingArray();
		QueueUsingLL<Integer> q = new  QueueUsingLL<Integer>();
		  
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
//		System.out.print(q.isEmpty());
		
	      //		q.enqueue(20);
//		q.enqueue(30);
//		q.size();
//		System.out.println(q.size());
//		System.out.println(q.isEmpty());
//		System.out.println(q.front());
//		q.print();
//		try {
//			q.dequeue();
//		} catch (QueueEmptyException e) {
//			// TODO Auto-generated catch block
//		}
//		q.print();
//		 
//		
	}

}
