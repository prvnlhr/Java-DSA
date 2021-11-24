package LinkedList;

import java.util.Scanner;

public class LinkedListRecursion {

//************** Taking Input  *********************************************************************************************************************	
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
//**************** Print Reverse *************************************************************************************************************
	      
	public static void printReverseR(Node<Integer>head) {
		
		if(head== null) {
			return;
		}
		printReverseR(head.next);
		System.out.print(head.data+" ");
	}
//**************  Insert Element Recursive  *****************************************************************************************************
	
	public static Node<Integer> InsertR(Node<Integer> head , int elem , int pos) {
		
	          if(head == null && pos >0) {	
	        	  return head;
	          }
	          if(pos==0) {
	        	  Node<Integer> newNode = new Node<>(elem);
	        	  newNode.next = head;
	        	  return newNode;
	          }
	          else {
	        	  head.next = InsertR(head.next, elem, pos-1);
	        	  return head;
	          }
	}
//*************   Delete Recursive *****************************************************************************************************
	
	public static Node<Integer> deleteR(Node<Integer> head  , int pos){
			
			if(head == null) {
				return head;
			}
			if(pos == 0) {
				return head.next;
			}
			else {
				head.next = deleteR(head.next , pos-1);
				return head;
			}
		}
//****************** Reverse Recursive  ***************************************************************************************************
	
	public static Node<Integer> reverse_R(Node<Integer> head) {

		//------------------O(n*n)--------------------
//		if(head == null ||head.next == null) {
//			return head;
//		}
//		Node<Integer> Reversehead  = reverse_R(head.next);
//		Node<Integer> tail = Reversehead;
//		while(tail.next != null) {
//			tail = tail.next;
//		}
//		tail.next = head;
//		head.next = null;
//		return Reversehead;
		
//----------------------O(n)------------------------------------	
		
		if(head == null ||head.next == null) {
			return head;
		}
		Node<Integer> Reversehead  = reverse_R(head.next);
		head.next.next = head;
		head.next = null;
		return Reversehead;
	}
//**************** Print Middle Element ***************************************************************************************
	
	public static int PrintMiddle(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
	while(fast.next != null && fast.next.next !=null) {
		slow = slow.next;
		fast = fast.next.next;
	}
	return slow.data;
	}
//****************** Merger two Sorted LL  ****************************************************
	
	public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
			
		Node<Integer> head = null;
		Node<Integer> tail = null;
	// Initially making the smaller of two LL = tail
		if (head1.data < head2.data) { 
			head = head1;     // head = head1 or head2 , because we eventually has to return head
			                  // so initially we are making a head == tail.
			                 // so all the changes to tail we reflect in tail.
			tail = head1; 
			head1 = head1.next; 
			} else { 
				head = head2; 
				tail = head2; 
				head2 = head2.next; 
			} 
		// check every element of LL and pointing tail
		while (head1 != null && head2 != null) { 
			if (head1.data < head2.data) { 
				tail.next = head1; 
				tail = tail.next; 
				head2 = head2.next; 
			} 
		} 
		// if any of the LL is remaining join to tail.next
		if (head1 != null) { 
			tail.next = head1; 
		} 
		if (head2 != null) { 
			tail.next = head2; 
		} 
		return tail; 
	}

//*************** MergeSort **********************************************************************************************************************
	 
	public static Node<Integer> mergeSort(Node<Integer> head) {
			
			if( head == null || head.next == null) {
				return head ;
			}
			Node<Integer> mid = Middle(head);
		
			Node<Integer> head1 = head;
			Node<Integer> head2 = mid.next;
			
			mid.next =null;
	
			head1 = mergeSort(head1);
			head2 = mergeSort(head2);
	
			Node<Integer> answer = merge((head1) , (head2));
			return head;
		}
//------------------------------------------------------------------------------	
		public static Node<Integer> Middle(Node<Integer> head) {
			
			if(head == null) {
				return head ;
			}
			Node<Integer> slow = head;
			Node<Integer> fast = head.next;
			
		while(fast != null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow ;
		}
	
//-------------------------------------------------------------------------------------
		public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
			
			Node<Integer> head = null;
			Node<Integer> tail = null;
		// Initially making the smaller of two LL = tail
			if (head1.data < head2.data) { 
				head = head1;     // head = head1 or head2 , because we eventually has to return head
				                  // so initially we are making a head == tail.
				                 // so all the changes to tail we reflect in tail.
				tail = head1; 
				head1 = head1.next; 
				} else { 
					head = head2; 
					tail = head2; 
					head2 = head2.next; 
				} 
			// check every element of LL and pointing tail
			while (head1 != null && head2 != null) { 
				if (head1.data < head2.data) { 
					tail.next = head1; 
					tail = tail.next; 
					head1 = head1.next; 
				} 
				else {
					tail.next = head2;
					tail = tail.next;
					head2 = head2.next;
				}
			} 
			// if any of the LL is remaining join to tail.next
			if (head1 != null) { 
				tail.next = head1; 
			} 
			if (head2 != null) { 
				tail.next = head2; 
			} 
			return head; 
		}

//---------------------------------------------------------------------
//		public static Node<Integer> newList2(Node<Integer> temp, int mid , int Mid) {
//			Node<Integer> newNode = temp;
//			int count = 1;
//			while(count != mid) {
//				count++;
//				temp = temp.next;
//			}
//			 temp.next = null;
//			
//		return newNode;
//		}
//
//		public static Node<Integer> newList1(Node<Integer> temp , int mid , int Mid){
//
//			Node<Integer> newNode = null;
//			
//			if(Mid%2 != 0) {
//				mid = mid+1;
//			}
//			int count1 = 1;
//			while(count1 != mid){
//				count1++;
//			temp = temp.next;
//				
//			}
//			newNode = temp.next;
//			return newNode;
//		}

//************** Print function**********************************************************************************************************
	
	public static void printR(Node<Integer> head) {

		if(head == null) {
			return ;
		}
		System.out.print(head.data+" ");
		printR(head.next);
	}
	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

//***************  Main function   *************************************************************************************************************
	
	public static void main(String[] args) {
		
		
		
		
		

		
		
		
	}
}


