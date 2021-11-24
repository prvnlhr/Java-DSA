package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputAndPrint;

public class Height_of_largest_BST {

//--------------------------------------------------------------------------------
//-- Largest BST height:
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		largestBSTReturn s = new largestBSTReturn();
		s = largestbsthelper(root);
		return s.height;
	}
//-- Helper function:
	public static largestBSTReturn largestbsthelper(BinaryTreeNode<Integer>root){

		if(root == null){
			largestBSTReturn ans = new largestBSTReturn();
			ans.isBst = true;
			ans.max = Integer.MIN_VALUE;
			ans.min = Integer.MAX_VALUE;
			ans.height = 0;
			return ans;
		}

		largestBSTReturn left = largestbsthelper(root.left);
		largestBSTReturn right = largestbsthelper(root.right);
		largestBSTReturn ans = new largestBSTReturn();

		if(left.isBst    &&   root.data > left.max   &&   root.data <= right.min){
			ans.isBst = true;
		}
		else{
			ans.isBst = false;
		}
		ans.max = Math.max(root.data,right.max);
		ans.min = Math.min(root.data,left.min);

		if(ans.isBst == true)
		{
			ans.height = Math.max(left.height,right.height) + 1 ;    
		}
		else {
			ans.height = Math.max(left.height,right.height);
		}
		return ans;
	}
//-----------------------------------------------------------------------------------------------
//-- Main Method:
	public static void main(String[] args) {
		
		Tree_Input_Print input = new Tree_Input_Print();
		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		largestBSTSubtree(root);
		System.out.println(largestBSTSubtree(root));
		
	}
}
