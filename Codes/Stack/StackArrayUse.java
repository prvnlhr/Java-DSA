package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackArrayUse {

	public static void main(String[] args) throws StackExceptionfull, StackEmptyException {
		//------------ User defined stack size----------------			
		Scanner s = new Scanner(System.in);
		int stacksize = s.nextInt(); // user defined stack size of array
		StackUsingArray stack = new StackUsingArray(stacksize);

		for(int i = 0 ; i < stacksize ; i++) { //user inserted items;
			int elem = s.nextInt();
			stack.push(elem);
		}

//--------------------OR Taking a temporary constructor for 10 size array---------------------------------------------

// StackUsingArray stack = new StackUsingArray();

		//		stack.push(10);
		//		stack.push(20);
		//		stack.push(30);
		//		stack.push(40);

		//-----------------------------------------------		
		System.out.println(stack.size());
		System.out.println(stack.top());
		stack.print();
		stack.pop();
		stack.print();
		}
	
}