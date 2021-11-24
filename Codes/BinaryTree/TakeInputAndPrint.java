package BinaryTree;

import java.util.Scanner;

public class TakeInputAndPrint {

	//-- Printing without stating details of right and left 

	public static void printTree(BinaryTreeNode<Integer>root) {

		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	//----------------------------------------------------------------------------------------------	
	//-- Printing in detailed manner stating L and R for left , right
	public static void PrintDetailed(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return ;
		}
		System.out.print(root.data+": ");
		if(root.left != null) {
			System.out.print("L"+root.left.data+","+20);
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();

		PrintDetailed(root.left);
		PrintDetailed(root.right);
	}

	//-----------------------------------------------------------------------------------------------
	//-- Function to take input from  user and creating Node

	public static BinaryTreeNode<Integer> takeInput(){

		System.out.println("Enter rootData");
		Scanner s = new Scanner(System.in);
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

	//---------------------------------------------------------------------------------------------------------------------------------------	
	//-- Improvement if Input : this function ask what to input--> leftchild or rightchild 	

	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot , int parentdata , boolean isLeft){

		if(isRoot) {
			System.out.println("Enter rootData");
		}
		else {
			if(isLeft) {
				System.out.println("Enter Left Child "+parentdata);
			}
			else{
				System.out.println("Enter Right Child "+ parentdata);
			}

		}

		Scanner s = new Scanner(System.in);
		int rootdata = s.nextInt();

		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftchild = takeInputBetter(false , rootdata , true);
		BinaryTreeNode<Integer> rightchild = takeInputBetter(false , rootdata , false);
		root.left = leftchild;
		root.right = rightchild;
		return root;
	}
}
