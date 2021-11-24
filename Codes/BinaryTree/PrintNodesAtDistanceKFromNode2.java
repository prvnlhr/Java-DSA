package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintNodesAtDistanceKFromNode2 {

//-- Main Print Node at k from given node function:
	public static void printnode(BinaryTreeNode<Integer> root , int node , int k) {
		
		if(root == null ) {
				return ;
			}
		if(root.data == node) {
			printDown(root , k);
		}
		printnode(root.left , node  , k);
		printnode(root.right, node, k);
		}
	//.........................................................................
// this function prints the node which are present only in downward subtree:
	public static void printDown(BinaryTreeNode<Integer>root , int k  ) {
		
			if(root == null) {
				return;
			}
			if(k == 0) {
				System.out.println(root.data);
			}
			printDown(root.left , k-1);
			printDown(root.right ,k-1);
		}
// this function print Nodes in different subtree and above it :
	
	
	
	
	
	
	
	
	
	
	
	
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
			printnode(root , node , k);
			
		}

}
