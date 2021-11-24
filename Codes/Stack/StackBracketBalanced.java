package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackBracketBalanced {

	public static boolean checkBalanced(String str) {

		Stack<Character> stack = new Stack<>();

		for(int i  = 0; i<str.length(); i++) {

			if(str.charAt(i)=='[' || str.charAt(i)=='{'|| str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)==']' || str.charAt(i)=='}'|| str.charAt(i)==')') {
				if(stack.isEmpty()) {
					return false;
				}
				char ch = stack.pop();
				if(ch == '(' && str.charAt(i)==')') {
					continue;
				}
				if(ch =='[' && str.charAt(i)==']') {
					continue;
				}
				if(ch == '{' &&  str.charAt(i)=='}') {
					continue;
				}
				else {
					return false;
				}
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str  = s.nextLine();
		checkBalanced(str);
		System.out.println(checkBalanced(str));
	}
}

