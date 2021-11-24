package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TestQ2AddOneToLL {

	public static LinkedListNode<Integer >nextLargeNumber(LinkedListNode<Integer> head) {

		int carry = addOne(head);

		if(carry>0) {
			LinkedListNode<Integer> newNode = newNode(carry);
			newNode.next = head ; 
			return newNode;
		}
		return head;

	}
//-----------------------------------------------------------
	public static int addOne(LinkedListNode<Integer> head) {

		if(head == null) {
			return 1;
		}
		//-----------------------------------------
		int res = head.data + addOne(head.next);
		head.data = res%10;
		res =  res/10;
		//-----------------------------------------
		return res;
	}
//-------------------------------------------------------------------
	public static LinkedListNode<Integer> newNode(int carry) {

		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(carry);
		newNode.data = carry ; 
		newNode.next =null;
		return newNode;

	}


//-------------------------------------------------------------------------------------------------------
	static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> takeInput(){

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		int data = s.nextInt();

		while(data != -1){
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data);

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
	public static void print(LinkedListNode<Integer>head) {

		if( head == null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
		System.out.println();
	}

	//---------------------------------------------------------------------------------------
	public static void main(String[] args) {

		LinkedListNode<Integer> head = takeInput();
		head = nextLargeNumber(head);
		print(head);


	}
}
