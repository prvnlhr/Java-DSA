package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackUsingEmptyStack {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size()<=1) {
			System.out.println("0");
			return;
		}
		int last = s1.pop();
		System.out.println("1"+ "last"+ last);
		reverseStack(s1, s2);

		while(!s1.isEmpty()) {
			System.out.println("2");
			int a = s1.pop();
			System.out.println("a"+a);
			s2.push(a);
		}

		System.out.println("3"+"last"+last);
		s1.push(last);
			
		while(!s2.isEmpty()) {
			System.out.println("4");
			int b = s2.pop();
			System.out.println("b"+b);
			s1.push(b);
		}
	}


	public static void main(String[] args) throws StackEmptyException {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		Stack<Integer> s1 = new Stack<Integer>();

		for(int i=0; i<size ; i++) {
			s1.push(s.nextInt());
		}
		Stack<Integer> s2 = new Stack<Integer>();
		reverseStack(s1, s2);

//
//		for(int i = 0; i<size; i++) {
//			System.out.print(s1.pop());
//		}
	}

}
