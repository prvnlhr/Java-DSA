package Stack;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {

		//  BuiltIn Stack classes and functions
		//  add , add at index , stack element at index , pop etc.

		Stack<Integer> stack = new Stack<>();  //creating a new stack

		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
	
		System.out.println(stack.peek()); //top element peek instead of top

		for(int i = 0 ; i <stack.size(); i++) {
			System.out.print(stack.elementAt(i)+" ");  
		}
		System.out.println();

		stack.pop();   //deletes top or peek element

		for(int i = 0 ; i <stack.size(); i++) {
			System.out.print(stack.elementAt(i)+" ");
		}
	}
}
