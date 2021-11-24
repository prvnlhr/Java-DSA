package BinaryTree;

import java.util.Scanner;

public class NodesCount {

	public static int numNodes(BinaryTreeNode<Integer>root) {

		if(root == null) {
			return 0;
		}
		int numOfLeftNode = numNodes(root.left);
		int numOfRightNodes = numNodes(root.right);

		return 1 + numOfLeftNode + numOfRightNodes;
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
		numNodes(root);
		printTree(root);
	}
}

