package BST;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;

public class LCAInBST {

//----------------------------------------------------------------------------
//-- Function to find LCA in  BST:
	
	public static int lcaInBST(BinaryTreeNode<Integer>root , int a , int b) {
		
		if(root==null) {
			return -1;
		}
		if(root.data > a && root.data > b) {
			return lcaInBST(root.left, a, b);
		}
		if(root.data < a && root.data < b) {
			return lcaInBST(root.right, a, b);
		}
		return root.data;
	}

//---------------------------------------------------------------------------
//-- Main Method:
	
	public static void main(String[] args) {
		
		Tree_Input_Print input = new Tree_Input_Print();
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer>root = input.takeInputLevelWise();
		int a = s.nextInt();
		int b = s.nextInt();
		lcaInBST(root , a , b);
		System.out.println(lcaInBST(root, a, b));
		
	}
	

}
