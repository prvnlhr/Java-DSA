package BinaryTree;

import java.util.Scanner;

public class NumberOfLeavesInTree {

	static int leavescount = 0;
	
	public static int numLeaves(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return leavescount;
		}
		if(root.left==null && root.right==null) {
				leavescount++;
		}
		numLeaves(root.left);
		numLeaves(root.right);
		return leavescount;
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
		numLeaves(root);;
		printTree(root);
	}
}


