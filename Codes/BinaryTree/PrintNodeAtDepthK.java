package BinaryTree;

import java.util.Scanner;

public class PrintNodeAtDepthK {
	
	public static void printAtK(BinaryTreeNode<Integer>root , int k) {
		
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
		}
		printAtK(root.left , k-1);
		printAtK(root.right ,k-1);
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
		int k = s.nextInt();
		printAtK(root, k);
//		printTree(root);
	}
}


