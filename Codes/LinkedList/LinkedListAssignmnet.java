package LinkedList;

import java.util.Scanner;

public class LinkedListAssignmnet {

		static int index = 0;
		static int res  = index;
		public static int index(Node<Integer> head , int n) {
	
			if(head == null ) {
				res = -1;
				return -1;
			}
	
			if(head.data == n) {
				res = index; 
				return index;
			}
			
			index++;
			head = head.next;
			index(head , n);
			
			return res;
	}


	//-------------------------------------------------------------------------------------------------------
	static Scanner s = new Scanner(System.in);

	public static Node<Integer> takeInput(){

		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data = s.nextInt();

		while(data != -1){
			Node<Integer> currentNode = new Node<Integer>(data);

			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}
			else {

				tail.next = currentNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
//--------------------------------------------------------------------------------------------------
	public static void print(Node<Integer>head) {

		if( head == null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}
//---------------------------------------------------------------------------------------
	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		int n = s.nextInt();
	int Index = index(head , n);
		System.out.println(Index);
		print(head);


	}

}
