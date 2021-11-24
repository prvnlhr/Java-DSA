package BinaryTree;

import java.util.Scanner;

public class MirrroTree {
	
//----------------------------------------------------------------------------------------------------------
//-- Mirror Tree
		
		public static void mirror(BinaryTreeNode<Integer>root) {
			
			if(root == null) {
				return;
			}
			if(root.left != null || root.right !=null) {
				BinaryTreeNode<Integer> left = root.left;
				BinaryTreeNode<Integer> right = root.right;
				root.left = right;
				root.right = left;
			}
			mirror(root.left);
			mirror(root.right);
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
					mirror(root);
					printTree(root);
			}
		}


