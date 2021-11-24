package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintNodesAtDistanceKFromNode {

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {

		printkdistanceNode(root, node, k);

	}

	public static void printkdistanceNodeDown(BinaryTreeNode<Integer>root  , int k)  
	{ 
		// Base Case 
		if (root == null || k < 0) 
			return; 

		// If we reach a k distant node, print it 
		if (k == 0)  
		{ 
			System.out.print(root.data); 
			System.out.println(""); 
			return; 
		} 

		// Recur for left and right subtrees 
		printkdistanceNodeDown(root.left, k - 1); 
		printkdistanceNodeDown(root.right, k - 1); 
	} 

	// Prints all nodes at distance k from a given target node. 
	// The k distant nodes may be upward or downward.This function 
	// Returns distance of root from target node, it returns -1 
	// if target node is not present in tree rooted with root. 
	
	
	public 	static int printkdistanceNode(BinaryTreeNode<Integer>root, int  target, int k)  
	{ 
		// Base Case 1: If tree is empty, return -1 
		if (root == null) 
			return -1; 

		// If target is same as root.  Use the downward function 
		// to print all nodes at distance k in subtree rooted with 
		// target or root 
		if (root.data == target)  
		{ 
			printkdistanceNodeDown(root, k); 
			return 0; 
		} 

		// Recur for left subtree 
		int dl = printkdistanceNode(root.left, target, k); 

		// Check if target node was found in left subtree 
		if (dl != -1)  
		{ 

			// If root is at distance k from target, print root 
			// Note that dl is Distance of root's left child from  
			// target 
			if (dl + 1 == k)  
			{ 
				System.out.print(root.data); 
				System.out.println(""); 
			} 

			// Else go to right subtree and print all k-dl-2 distant nodes 
			// Note that the right child is 2 edges away from left child 
			else
				printkdistanceNodeDown(root.right, k - dl - 2); 

			// Add 1 to the distance and return value for parent calls 
			return 1 + dl; 
		} 

		// MIRROR OF ABOVE CODE FOR RIGHT SUBTREE 
		// Note that we reach here only when node was not found in left  
		// subtree 
		int dr = printkdistanceNode(root.right, target, k); 
		if (dr != -1)  
		{

			if (dr + 1 == k)  
			{ 
				System.out.print(root.data); 
				System.out.println(""); 
			}  
			else 
				printkdistanceNodeDown(root.left, k - dr - 2); 
			return 1 + dr; 
		} 

		// If target was neither present in left nor in right subtree 
		return -1; 
	} 
//--------------------------------------------------------------------------------------------------		
		//-- Input LevelWise:

		static Scanner s = new Scanner(System.in);
		public static BinaryTreeNode<Integer> takeInputLevelWise(){

			System.out.println("Enter root data");
			int rootdata = s.nextInt();

			if(rootdata == -1) { 
				return null;
			}

			BinaryTreeNode<Integer> root  = new BinaryTreeNode<Integer>(rootdata);                   // creating root node
			Queue<BinaryTreeNode<Integer>> pendingchild = new LinkedList<BinaryTreeNode<Integer>>(); // creating queue
			pendingchild.add(root);                                                                  // inserting root to queue



			while(!pendingchild.isEmpty()) {
				BinaryTreeNode<Integer> front = pendingchild.poll();
	//-------------
		// for left child
				System.out.println("Enter left child of "+front.data);
				int left = s.nextInt();
				if(left != -1) {
					BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(left);
					front.left = leftchild;
					pendingchild.add(leftchild);
				}
	//-------------
		// for right child
				System.out.println("Enter right child of "+front.data);
				int right = s.nextInt();
				if(right != -1) {
					BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>(right);
					front.right = rightchild;
					pendingchild.add(rightchild);
				}
			}
			return root;
		}

//-------------------------------------------------------------------------------------------------------
		public static void main(String[] args) {
			
			BinaryTreeNode<Integer>root = takeInputLevelWise() ;
			
			int k = s.nextInt();
			int node = s.nextInt();
			nodesAtDistanceK(root , node , k);
			
		}

}
