package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseTheQueue {
//----------------------------------------------------Reverse function
	public static void reverseQueue(QueueUsingLL<Integer> q) throws QueueEmptyException {

		if (q.isEmpty()) {
			return ;
		}
		else {
			int a = q.dequeue();
			reverseQueue(q);
			q.enqueue(a);
		}
	}
//----------------------------------------------------Print function
	
	public static void print(QueueUsingLL<Integer> q) throws QueueEmptyException {
		int a = q.size();
		for(int  i = 0; i < a; i++) {
			System.out.print(q.front()+" ");
			q.dequeue();
		}

	}
//-----------------------------------------------------Main 
	
	public static void main(String[] args) throws QueueEmptyException {

		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		for(int i = 0; i<size; i++) {
			int a = s.nextInt();
			q.enqueue(a);
		}
		reverseQueue(q);//--------reverse function call
		print (q);//--------------print function call
	}
}
