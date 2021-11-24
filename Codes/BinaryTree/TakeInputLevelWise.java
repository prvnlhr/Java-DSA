package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {
	
// To take input level wise , the important concept is to maintain a queue
// because every time we print a node we then have to print its left then right
// so we need to keep track of a current node whose left and right has to be printed and we also have to
// update current node. so we add node or root element to queue and once their left and right child are printed we remove it front queue
// so next time we get next node at root or front
	
//-----------------------------------------------------------------------------------------------------------------------------
//-- Print LevelWise
	
	 public static void printlevelwise(BinaryTreeNode<Integer>root) {
		 
		 Queue<BinaryTreeNode<Integer>> a = new LinkedList<BinaryTreeNode<Integer>>();
		 a.add(root);
	
		 while(!a.isEmpty()) {

			 BinaryTreeNode<Integer> front = a.poll();
			 System.out.print(front.data+":");
//- Left child
			 if(front.left != null) {
				 System.out.print("L:"+front.left.data+",");	
				 a.add(front.left);
			 }
			 else {
				 System.out.print("L:"+-1+",");
			 }

//- Right child
			 if(front.right !=null) {
				 System.out.print("R:"+front.right.data);
				 a.add(front.right);
			 }
			 else {
				 System.out.print("R:"+-1);
			 }
			 System.out.println();
		 }
	 }

//-----------------------------------------------------------------------------------------------------------------------------
	//-- Input LevelWise:

	public static BinaryTreeNode<Integer> takeInputLevelWise(){

		Scanner s = new Scanner(System.in);
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

//---------------------------------------------------------------------------------------------------------------------
	//-- Print Function

	public static void PrintDetailed(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return ;
		}
		System.out.print(root.data+": ");
		if(root.left != null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();

		PrintDetailed(root.left);
		PrintDetailed(root.right);
	}

//----------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		PrintDetailed(root);
		printlevelwise(root);
	}
}
