package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathSumRootToLeaf {
//-----------------------------------------------------------------------------------------------------
//-- Path Sum From Root To Leaf

//-- Coding Ninja solution:
	
//	public static  void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
//		ArrayList<Integer> path = new ArrayList<Integer>();
//		printpath(root , path , k);
//	}
//	public static void printpath(BinaryTreeNode<Integer>root ,ArrayList<Integer>path ,  int k) {
//	
//--- check for null: base case
//		if(root ==null) {
//			return;
//		}
//	//-----------------------------------------------------//
//		k = k-root.data;
//		path.add(root.data);
//	
//--- If Leaf Node Found:
//		if(root.left == null && root.right== null) {
//			if(k ==0) {
//				for(int i : path) {
//					System.out.print(i +" ");
//				}
//				System.out.println();
//			}
//			path.remove(path.size()-1);
//			return;
//		}
//-- Recursive Call:
//		   printpath(root.left,path  , k);
//		   printpath(root.right,path , k);
//		   path.remove(path.size()-1);
//	}


//--------------------------------------------------------	
//-- Solution 2:
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

		rootToLeafPathsSumToK(root,k,"");
	}

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k , String path) {
		//---------------------------------------------------------

		//-- Base Case:
		if(root == null) {
			return;                              
		}

		//-- if Leaf Node found:		      
		if(root.right == null && root.left == null){
			if(k== root.data) {
				System.out.println( path+" "+ root.data);
			}
			return;
		}
		//-- Recursive Call:	
		if(path == "") {
			rootToLeafPathsSumToK(root.left , k-root.data, path + root.data);
		}
		else{ 
			rootToLeafPathsSumToK(root.left , k-root.data, path +" "+ root.data);
		}

		if(path == "") {
			rootToLeafPathsSumToK(root.right , k-root.data, path+root.data);
		}
		else{ 
			rootToLeafPathsSumToK(root.right , k-root.data, path+" "+root.data);
		}
	}




//-----------------------------------------------------------------------------------------------------------------------------
		//-- Input LevelWise:

		static	Scanner s = new Scanner(System.in);
		public static BinaryTreeNode<Integer> takeInputLevelWise(){

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

	//-------------------------------------------------------------------------------------------------------------------------------
	//-- Main Method
		
		public static void main(String[] args) {
			BinaryTreeNode<Integer>root = takeInputLevelWise();
			int k = s.nextInt();
			rootToLeafPathsSumToK(root , k);
			
		}


	}



