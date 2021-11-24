package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeMinMax {
	
	public static PairAns minMax(BinaryTreeNode<Integer>root) {
		
	return result(root , maxvalue , minvalue );
	
	}
	
	 static int maxvalue = Integer.MIN_VALUE;
	 static int minvalue  = Integer.MAX_VALUE;
	
	 public static PairAns result(BinaryTreeNode<Integer>root , int min , int max) { 
	
		if(root == null) {
			return null ;
		}
	
		if(root.data > maxvalue) {
			maxvalue = root.data;
			
		}
		if(root.data < minvalue) {
		
			minvalue = root.data;
		}
		result(root.left , minvalue , maxvalue);
		result(root.right ,minvalue, maxvalue);
		 
		PairAns a = new PairAns();
		a.max = maxvalue;
		a.min = minvalue;
	
		return a;
		
	 }

//---------------------------------------------------------------------------------------------------------------------------
//-- Take input
	
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
//-- Main Method
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		minMax(root);
//		System.out.println(minMax(root));
		PairAns ans = minMax(root);
		System.out.println(ans.max + " " + ans.min);

	}
}
