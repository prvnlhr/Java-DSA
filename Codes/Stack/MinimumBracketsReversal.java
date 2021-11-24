package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketsReversal {

	public static int countBracketReversals(String input){
		int count =0;
		Stack<Character> s = new Stack<Character>();

		for(int i = 0; i<input.length(); i++){
			char ch = input.charAt(i);

			if(input.charAt(i)=='{') {
				System.out.println("i1"+i);
				s.add(ch);
			}
			else{
				if(!s.isEmpty() && input.charAt(i)=='}') {
					System.out.println("i2"+i);
					s.pop();
				}
			}
		}
		System.out.println(s.size());
		if(s.isEmpty()) {
			return 1;
		}
		if(s.size()%2==0) {
			count = s.size()/2;
		}
		if(s.size()%2 != 0) {
			count = -1;
		}
		return count;
	}







	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int res = countBracketReversals(input);
		System.out.println(res);


	}

}
