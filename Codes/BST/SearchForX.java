package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class SearchForX {
	
//------------------------------------------------------------------------------------------------
//-- Find Element In BST:
	public static BinaryTreeNode<Integer> searchX(BinaryTreeNode<Integer> root , int x) {

		if(root == null) {
			return null;
		}
		if(root.data == x) {
			return root ;
		}
		else if(root.data >x ) 
			return searchX(root.left , x);

		else {
			return searchX(root.right , x);
		}
	}
//------------------------------------------------------------------------------------------------------------
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
		int x = s.nextInt();
		System.out.println(searchX(root , x));
	}
}
