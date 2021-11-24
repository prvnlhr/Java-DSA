package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BinaryTree.BinaryTreeNode;

public class Tree_Input_Print {
	
//------------------------------------------------------------------------------------------------------------
		//-- Input LevelWise:

		static Scanner s = new Scanner(System.in);
		public BinaryTreeNode<Integer> takeInputLevelWise(){

			System.out.println("Enter root data");
			int rootdata = s.nextInt();

			if(rootdata == -1) { 
				return null;
			}

			BinaryTreeNode<Integer> root  = new BinaryTreeNode<Integer>(rootdata);                   // creating root node
			Queue<BinaryTreeNode<Integer>> pendingchild = new LinkedList<BinaryTreeNode<Integer>>(); // creating queue
			pendingchild.add(root);                                                                  // inserting root to queue


			while(!pendingchild.isEmpty()) {
				BinaryTreeNode<Integer> front = pendingchild.poll();
	//-------------
		// for left child
				System.out.println("Enter left child of "+front.data);
				int left = s.nextInt();
				if(left != -1) {
					BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(left);
					front.left = leftchild;
					pendingchild.add(leftchild);
				}
	//-------------
		// for right child
				System.out.println("Enter right child of "+front.data);
				int right = s.nextInt();
				if(right != -1) {
					BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>(right);
					front.right = rightchild;
					pendingchild.add(rightchild);
				}
			}
			return root;
		}
//------------------------------------------------------------------------------------------------
		//-- Print LevelWise:
			
			public static void printlevelwise(BinaryTreeNode<Integer>root) {
				 
				 Queue<BinaryTreeNode<Integer>> a = new LinkedList<BinaryTreeNode<Integer>>();
				 a.add(root);
			
				 while(!a.isEmpty()) {
					 BinaryTreeNode<Integer> front = a.poll();
					 System.out.print(front.data);
		//- Left child
					 if(front.left != null) {
//						 System.out.print("L:"+front.left.data+",");	
						 a.add(front.left);
					 }
//					 else {
//						 System.out.print("L:"+-1+",");
//					 }

		//- Right child
					 if(front.right !=null) {
//						 System.out.print("R:"+front.right.data);
						 a.add(front.right);
					 }
//					 else {
//						 System.out.print("R:"+-1);
//					 }
					 System.out.println();
				 }
			 }
}
