package BinaryTree;

import java.util.Scanner;

public class PrintPreOrderPostOrderInOrder {

	//-- Printing  PostOrder 

	public static void printPostOrder(BinaryTreeNode<Integer>root) {

		if(root==null) {
			return;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data+" ");
	}

	//-- Printing Preorder
	public static void printPreOrder(BinaryTreeNode<Integer>root) {

		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);

	}
	//-- Printing Inorder
	public static void printInOrder(BinaryTreeNode<Integer>root) {
		if (root== null)  
			return;  
		printInOrder(root.left);  
		System.out.println(root.data);  
		printInOrder(root.right);  
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
		printInOrder(root);
		printPreOrder(root);
		printPostOrder(root);		
	}
}

