package LinkedList;

import java.util.Scanner;

public class LinkedListUse {

	//**********************************************************************************	

	public static Node<Integer> createlinkedList(){
		//node Creating Syntax:
		//Node<Type> node_name = new Node<>(element);

		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);

		//Linking one node to other and so on:
		//node_name.next = node_name2;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
	}

	//**********************************************************************************	

	public static void increment(Node<Integer>head) {
		Node<Integer> temp = head;     
		while(temp!=null) {
			temp.data++;
			temp = temp.next;
		}
	}

	//**********************************************************************************	

	public static void printElementAtIndex(Node<Integer> head , int i) {

		if(head==null) {
			return;
		}

		Node<Integer> temp1 = head;     
		int count=0;
		while(temp1!=null && count <i) { 
			temp1=temp1.next;
			count++;
		}
		if(temp1!=null) {
			System.out.print("Element at:"+"i="+i +" is "+temp1.data);
		}
	}
	//**********************************************************************************	

	public static int length(Node<Integer>head) {
		Node<Integer> temp = head;     
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	//**********************************************************************************	

	//taking input from user : complexity O(n*n)
	//	public static Node<Integer> takeInput(){
	//
	//		Scanner s = new Scanner(System.in);
	//		int data = s.nextInt();
	//		Node<Integer>head = null;
	//
	//		while(data != -1) {
	//
	//			Node<Integer>currentNode = new Node<Integer>(data);
	//
	//			if(head == null) {
	//				//make this node as head
	//				head = currentNode;
	//			}
	//			else{
	//				Node<Integer> tail = head;
	//
	//				while(tail.next!= null) {
	//					tail = tail.next;
	//				}
	//				//now tail will refer to last node
	//				//connect current node after last node
	//				tail.next = currentNode;
	//			}
	//			data = s.nextInt();
	//		}
	//		return head;
	//	}

	//complexity O(n)__________________________________
	
	static Scanner s = new Scanner(System.in);

	public static Node<Integer> takeInput(){

		int data = s.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;

		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);

			if(head==null) {
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


	//**********************************************************************************	
	public static void print(Node<Integer>head) {

		Node<Integer> temp1 = head; //creating new variable
		//instead of using head = head.next, because we should not
		//directly make changes to head. so we created temp = head
		//made change to temp=temp.next

		while(temp1 !=null) {
			System.out.print(temp1.data+" ");
			temp1 = temp1.next;
		}
		System.out.println();
	}

	//**********************************************************************************	

	public static Node<Integer> insert(Node<Integer> head, int data, int pos){

		Node<Integer> newNode = new Node<Integer>(data);
		Node<Integer> temp = head;
		int count = 0;

		if(pos==0) {
			newNode.next = head;
			head = newNode;
			return head;
		}

		else {
			while( count < pos-1 && temp!= null)  {
				temp = temp.next;
				count++;
			}
			if(temp == null) {
				return head;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return head;
		}
	}
	//************************************************************************************************************	
	public static Node<Integer> deleteIthNode(Node<Integer> head, int i){

		Node<Integer> temp = head;
		int count = 0;

		if(i==0) {
			head = head.next;
			return head;
		}
		else {
			
			while( count < i-1 && temp!=null){
				count++;
				temp = temp.next;
			}
			if(temp.next==null) {
				return head;
			}
			temp.next = temp.next.next;
			return head;
		}
	}
	//***********************************************************************************************************	
	public static int indexOfNIter(Node<Integer> head, int n) {


		Node<Integer> temp2 = head;
		int index = 0;


		while( temp2 != null) {
			if(temp2.data == n) {
				return index;
			}
			else {
				temp2 = temp2.next;
				index++;
			}
		}
		return -1;
	}
	//***********************************************************************************************************

	public static Node<Integer> removeDuplicates(Node<Integer> head) {

		Node<Integer> temp = head;
		//		Node<Integer> next = head.next;

		if(temp == null) {
			return null;
		}

		while(temp.next != null) {

			if(temp.data == temp.next.data) {
				temp.next=temp.next.next;

			}
			else {
				temp = temp.next;
			}
		}
		return head;
	}

	//************************  Print Reverse Recursive  ***********************************************************************************	
	public static void printReverseRecursive(Node<Integer> head) {

		if(head == null) {
			return ;		     
		}
		printReverseRecursive(head.next);
		System.out.println(head.data);
	}

	//***********************************************************************************************************
	//---------------- Palindrome Main function ------------------------------------------------------------	

	public static boolean isPalindrome_2(Node<Integer> head) {

		Node<Integer> temp = head;

		int Mid = Mid(temp);
		int mid = Mid/2;

		Node<Integer>h1 = newList1(temp , mid ,Mid);
		Node<Integer>h2 = newList2(temp , mid , Mid);
		Node<Integer>h1rev = reverse(h1);
		boolean result  = isPalindrome(h1rev , h2);
		return result;

	}
	//------------------Checking Palindrome---------------------------------------------------------	

	public static boolean isPalindrome(Node<Integer> h1rev, Node<Integer> h2) {
		boolean res = true;

		while(h2 != null) {

			if(h1rev.data != h2.data) {
				res = false;
				return res;
			}
			if(h1rev.data == h2.data) {
				h1rev = h1rev.next;
				h2 = h2.next;
				res = true;
			}
		}
		return res;

	}
	//------------------Reversing list 1--------------------------------------------------------------------

	public static Node<Integer> reverse(Node<Integer> h1) {

		Node<Integer> current = h1;
		Node<Integer> prev= null;
		Node<Integer> next = null;

		while(current != null) {

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		h1 = prev;
		//print(h1);
		return h1;

	}
	//---------------------Creating  two new Lists--------------------------------------------------------- 
	public static Node<Integer> newList2(Node<Integer> temp, int mid , int Mid) {
		Node<Integer> newNode = temp;
		int count = 1;
		while(count != mid) {
			count++;
			temp = temp.next;
		}
		temp.next = null;

		return newNode;
	}

	public static Node<Integer> newList1(Node<Integer> temp , int mid , int Mid){

		Node<Integer> newNode = null;
		
		if(Mid % 2 != 0) { 
			mid = mid + 1;
		}
		int count1 = 1;
		while(count1 != mid){
			count1++;
			temp = temp.next;

		}
		newNode = temp.next;
		return newNode;
	}

	//----------------------------finding Mid---------------------------------------------------------
	static  int count=0;
	public static int Mid(Node<Integer> temp) {

		if(temp == null) {
			return count;
		}
		count++;
		Mid(temp.next);
		return count;
	}


	//*************************** Append ****************************************************************************

	public static Node<Integer> append(Node<Integer> head, int n) {

		List1(head , n);
		List2(head , n);
		return head;
	}

	public static void List2(Node<Integer> head, int n) {
		Node<Integer> temp1 = head;
		Node<Integer> newNode2 = temp1;
	}

	public static Node<Integer> List1(Node<Integer> head , int n) {
		Node<Integer> temp = head;
		Node<Integer> newNode1 = null;

		while(temp.data != n) {
			temp = temp.next;
		}
		//			System.out.println(temp.data);
		newNode1 = temp;
		print(newNode1);
		return temp;
	}

	//***************************** Main *****************************************************************************

	public static void main(String[] args) {
		//		Node<Integer> head = createlinkedList ();
		Node<Integer> head = takeInput();
		//		int i = s.nextInt();
		int n = s.nextInt();
		//		head = insert(head, n, i);
		//		head = deleteIthNode(head , i );
		//		int index = indexOfNIter(head, n);
		//		System.out.println("index "+index+" ");
		//		head = removeDuplicates(head);
		//				boolean isp = isPalindrome_2(head);
		//				System.out.println(isp);
		//		        append(head , n);
		//		printReverseRecursive(head);
		//		print(head);
		//print(head);
		//if want to print one more time we have to call print one more time

		//		increment(head);
		//		print(head); //after increment
		//		length(head);
		//		System.out.println(length(head));
		//		printElementAtIndex(head , 2);

	}
}
