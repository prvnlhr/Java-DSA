package BinaryTree;

import java.util.Scanner;

public class LargestNodeInTree {

//----------------------------------------------------------------------
//-- Function to find largest:
	public static int largest(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return -1;
		}
		int largestleft = largest(root.left);
		int largestright = largest(root.right);
		return Math.max(root.data, Math.max(largestleft, largestright));
	}
//-------------------------------------------------------------------------------------------------------
	//-- TakeInput
	
	static Scanner s = new Scanner(System.in);
	public static BinaryTreeNode<Integer> takeInput(){

		int rootdata = s.nextInt();

		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftchild = takeInput();
		BinaryTreeNode<Integer> rightchild = takeInput();
		root.left = leftchild;
		root.right = rightchild;
		return root;
	}
//----------------------------------------------------------------------------------------------------------
	//-- Print Function

	public static void printTree(BinaryTreeNode<Integer>root) {

		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

//-----------------------------------------------------------------------------------------------------
	//-- Main Method
		
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeInput();
		int x =s.nextInt();
		largest(root);
		printTree(root);
	}
}

