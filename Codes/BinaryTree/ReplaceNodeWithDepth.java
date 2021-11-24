package BinaryTree;

import java.util.Scanner;

public class ReplaceNodeWithDepth {
	
	public static void replaceDepth(BinaryTreeNode<Integer>root) {

		int k = 0;
		replaceNode(root , k);
		printInOrder(root);
	}

	public static void replaceNode(BinaryTreeNode<Integer>root , int k){

		if(root == null) {
			return;
		}
		root.data = k;
		replaceNode(root.left , k++);
		replaceNode(root.right , k++);
	}
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
		replaceDepth(root);
	}
}
