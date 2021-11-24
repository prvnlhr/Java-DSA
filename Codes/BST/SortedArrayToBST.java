package BST;

import java.util.Scanner;

import Arrays.TakinginputandprintingArray;
import BinaryTree.BinaryTreeNode;
import BinaryTree.PrintNodeLevelWise;

public class SortedArrayToBST {
//-------------------------------------------------------------------------------------------------------------------
	//-- Build BST from sorted Array:

	public static BinaryTreeNode<Integer> BuildBST(int [] arr){

		return BuildBST(arr , 0 , arr.length-1);
	}
//-- Helper Function:
	public static BinaryTreeNode<Integer> BuildBST(int [] arr , int si , int ei){

		if( si > ei) {
			return null;
		}
		int mid = (si + ei)/2;    
		int rootdata = arr[mid];

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);

		root.left = BuildBST(arr , si , mid-1);
		root.right = BuildBST(arr , mid+1 , ei );
		return root;
	}

//-----------------------------------------------------------------------------------------------------------------	
	//-- Main Method:

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		TakinginputandprintingArray input = new TakinginputandprintingArray();
		int n = s.nextInt();
		int [] arr = input.takeInput(n);
		BinaryTreeNode<Integer> root = BuildBST(arr);
		PrintNodeLevelWise p = new PrintNodeLevelWise();
		p.printlevelwise(root);
	}
}
