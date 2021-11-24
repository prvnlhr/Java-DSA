package BinaryTree;

import java.util.Scanner;

public class DiameterOfTree {

//----------------------------------------------------------------------------------------------------------
//-- Diameter 
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return 0;
		}
		int h = height(root.left)+ height(root.right);
		int d1 = diameterOfBinaryTree(root.left);
		int d2 = diameterOfBinaryTree(root.right);
		return Math.max(h	, Math.max(d1, d2));
		}
	
		static int height = 0;
		public static int height(BinaryTreeNode<Integer>root) {
			
			if(root == null) {
				return height; 
			}
			
			int leftheight = 1 + height(root.left);
			int rightheight = 1 + height(root.right);
			int height = Math.max(leftheight, rightheight);
			return height;
			}
	
//------------------------------------------------------------------------------------------------------
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
				
			}
		}