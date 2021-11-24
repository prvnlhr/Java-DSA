package BinaryTree;

import java.util.Scanner;

public class xPresentOrNot {

	static boolean present = false;
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){

		if(root==null) {
			return false;
		}
		if(root.data == x) {
			present  = true;
		}
		isNodePresent(root.left, x);
		isNodePresent(root.right, x);
		return present;
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
		isNodePresent(root, x);
	}
}
