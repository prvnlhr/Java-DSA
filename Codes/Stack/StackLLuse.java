package Stack;

public class StackLLuse {
	
	public static void main(String[] args) throws StackEmptyException {
		
		StackUsingLL<Integer> stack = new StackUsingLL<>();
//		int [] arr = { 5 , 10 , 20 , 30 , 40, 50 };
		stack.push(10);
		stack.push(20);
//		
//		for(int i = 0 ; i<arr.length ; i++) {
//			stack.push(arr[i]);
//		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
			}

		
	}

}
