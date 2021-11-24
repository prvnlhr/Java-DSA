package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BinaryTreeNode;
import LinkedList.Node;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class Levelwise_LL_of_BST {
//---------------------------------------------------------------------------------
//-- LevelWise LL form BST:

	public static ArrayList<Node<BinaryTreeNode<Integer>>> levelwiseLL(BinaryTreeNode<Integer>root) {

		// Base condition if root is null we need to return null.
		if(root==null) {
			return null ;
		}
           
		// We created Two Queues Primary and Secondary :
		QueueUsingLL<BinaryTreeNode<Integer>>primary = new QueueUsingLL<>();    
		QueueUsingLL<BinaryTreeNode<Integer>> secondary = new QueueUsingLL<>();

		// Adding root to primary queue:
		primary.enqueue(root);

		// Now Creating Two head and tail pointer and a newnode in LL:
		Node<BinaryTreeNode<Integer>> head = null ;
		Node<BinaryTreeNode<Integer>> tail = null; 
		Node<BinaryTreeNode<Integer>> newnode;

		// creating ArrayList of type LL node of type binarytree nodes:
		ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<>();

		// Applying loop for Iterating in primary queue:
		while(! primary.isEmpty()) {

//STEP 1: ------------------------------------------------------------------------------------------------
			// Taking reference to first element of queue as front;
			BinaryTreeNode<Integer> front;

			try {
				front =  primary.dequeue();  

				newnode = new Node<BinaryTreeNode<Integer>>(front); // adding value of front to newnode of LL

// STEP 2: ------------------------------------------------------------------------------------------------
				// head and tail are null it means that LL is empty so we need to create new head:
				if(head == null) {
					head = newnode;
					tail = newnode;
				}
				// other wise is LL is not null then insert tail to head:
				else {
					tail.next = newnode;
					tail = newnode;
				}
				
// STEP 3: ------------------------------------------------------------------------------------------------		
				// after creating newnode of LL , if front element in  the tree has left and right child we add them to secondary queue:
				if(front.left != null) {
					secondary.enqueue(front.left);
				}
				if(front.right != null) {
					secondary.enqueue(front.right);
				}
				// now if the primary queue is empty it means we are done with one level,
				// so we make head and tail null so that we can create new LL for next level.
 // STEP 4;	------------------------------------------------------------------------------------------------		
				if(primary.isEmpty()) {
					output.add(head); // as one level is completed we add this head of LL to ArrayLIst.
					head = null;
					tail = null;
					// we swap primary and secondary queues for every level using temp.
					QueueUsingLL<BinaryTreeNode<Integer>> temp = primary;
					primary = secondary;
					secondary = temp;
				}
			}
			catch (QueueEmptyException e) {
				//	e.printStackTrace();
			}
		}
		return output;
	}
//------------------------------------------------------------------------------
//-- Main Method:
	public static void main(String[] args) {
	
		Tree_Input_Print input = new  Tree_Input_Print();
		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		ArrayList<Node<BinaryTreeNode<Integer>>> output = levelwiseLL(root);

		for(Node<BinaryTreeNode<Integer>> head : output){
			Node<BinaryTreeNode<Integer>> temp = head;
			while(temp != null){
				System.out.print(temp.data.data + " ") ;
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

