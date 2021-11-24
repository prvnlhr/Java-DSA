package Queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class ReverseKelements {
	static int count = 0;
	static int f = 0;
	private static Queue<Integer> reversekQueue(Queue<Integer> input, int k) throws QueueEmptyException {

		if (input.isEmpty() == true || k > input.size()) {
			return input; 
		}
		if (k <= 0) { 
			return input;
		}

	Stack<Integer> stack = new Stack<Integer>(); 
		for (int i = 0; i < k; i++) { 
			stack.push(input.peek()); 
			input.remove(); 
		} 


	while (!stack.empty()) { 
			input.add(stack.peek()); 
			stack.pop(); 
		} 

	
	for (int i = 0; i < input.size() - k; i++) { 
			input.add(input.peek()); 
			input.remove(); 
		}
		return input; 
	} 

	private static void print(Queue<Integer> q  ) throws QueueEmptyException {

		int a = q.size();
		for(int  i = 0; i < a; i++) {
			System.out.print(q.peek()+" ");
			q.poll();
		}
	}

	public static void main(String[] args) throws QueueEmptyException {

		Queue<Integer> q = new LinkedList<Integer>();

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		for(int i=0; i<size; i++) {
			int a = s.nextInt();
			q.add(a);
		}
		int k = s.nextInt();
		q = reversekQueue(q , k);//--------reverse function call
		print (q);//--------------print function call
	}
}




