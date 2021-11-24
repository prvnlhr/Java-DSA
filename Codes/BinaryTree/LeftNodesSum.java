package BinaryTree;

import java.util.Scanner;

public class LeftNodesSum {
	
	static int sum = 0;
	
	public static int leftSum(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return 0;
		}
		
		if(root.left !=null) {
			sum = root.left.data+ leftSum(root.left);
		}
		if(root.right !=null) {
		leftSum(root.right);
		}
		return sum;
		
		
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
		
			int sum = leftSum(root);
			System.out.println(sum);
		}
	}


