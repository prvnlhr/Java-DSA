package BinaryTree;

import java.util.Scanner;

public class RemovesLeavesAndUpdateTree {

//----------------------------------------------------------------------------------------------------------------------
//-- Removes Leaf Node and update root
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		
			if(root == null) {
				return null;
			}
			if(root.left == null && root.right == null) {
				
				return null;
			}
			root.left = removeLeaves(root.left);
			root.right = removeLeaves(root.right);
			return root;
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
				removeLeaves(root);
				printTree(root);
			}
		}




