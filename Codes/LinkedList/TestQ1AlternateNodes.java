package LinkedList;

import java.util.Scanner;

public class TestQ1AlternateNodes {

	public static Node<Integer> alternateNode(Node<Integer>head){

		while(head.next != null) {

			if(head.next.next != null) {
				head.next = head.next.next;
				head = head.next;
			}
			else {
				head.next=null;
			}
		}
		return head;
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
		alternateNode(head);
		print(head);


	}

}


