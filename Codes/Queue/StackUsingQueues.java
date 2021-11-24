package Queue;

import java.util.LinkedList;
import java.util.Queue;

import Stack.StackEmptyException;

public class StackUsingQueues<T> {
	
	

	static Queue<Integer> q1 = new LinkedList<Integer>(); 
	static Queue<Integer> q2 = new LinkedList<Integer>(); 

	// To maintain current number of 
	// elements 
	static int curr_size; 

	public StackUsingQueues() { 
		curr_size = 0; 
	} 

	static void push(int x) 
	{ 
		curr_size++; 

		// Push x first in empty q2 
		q2.add(x); 

		// Push all the remaining 
		// elements in q1 to q2. 
		while (!q1.isEmpty()) { 
			q2.add(q1.peek()); 
			q1.remove(); 
		} 

		// swap the names of two queues 
		Queue<Integer> q = q1; 
		q1 = q2; 
		q2 = q; 
	} 

	static int  pop(){ 

		// if no elements are there in q1 
		if (q1.isEmpty()) {
			return 0; 
		}
		else {
			curr_size--; 
		return q1.remove(); 
		}
	} 

	static int top() 
	{ 
		if (q1.isEmpty()) 
			return -1; 
		return q1.peek(); 
	} 

	static int getSize() 
	{ 
		return curr_size; 
	}

	public Queue<Integer> getQueue() {
	
		return reverseQueue(q1);
	} 
	static Queue<Integer> reverseQueue(Queue<Integer> q1) { 
	    // Base case 
	    if (q1.isEmpty()) 
	        return q1; 
	  
	    // Dequeue current item (from front)   
	    int data = q1.peek(); 
	    q1.remove(); 
	  
	    // Reverse remaining queue   
	    q1 = reverseQueue(q1); 
	  
	    // Enqueue current item (to rear)   
	    q1.add(data); 
	          
	    return q1; 
	} 
}


//	Queue<T> q;
//
//	Queue<T> tmp ;

//	public StackUsingQueues(){
//		 Queue<Integer> q = new LinkedList<>();
//		 Queue<Integer> tmp = new LinkedList<>();
//	}    
//
//
//	public void push(T data){
//
//	        if (q.size() == 0){
//	        	q.add(data);
//		}
//
//		else{
//			int l = q.size();
//
//			for (int i = 0; i < l; i++) {
//
//				tmp.add(q.remove());                
//				q.add(data);        
//			}
//			for (int i = 0; i < l; i++){
//				q.add(tmp.remove());
//			}
//
//		}
//
//	}    
//
//	public T pop() throws StackEmptyException{
//
//		if (q.size() == 0) {
//			throw new StackEmptyException();
//		}
//		return q.remove();
//	}    
//
//	public T top() throws StackEmptyException{
//
//		if (q.size() == 0) {
//			throw new StackEmptyException();
//		}
//		return q.peek();
//	}        
//
//	public boolean isEmpty(){
//
//		return q.size() == 0 ;
//	}
//	 public int getSize() {
//	        return q.size();
//	    } 
//	 public Queue<T> getQueue(){
//		 return q;
//	 }
//
//
