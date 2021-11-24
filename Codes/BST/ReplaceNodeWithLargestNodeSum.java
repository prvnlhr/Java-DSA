package BST;

import BinaryTree.BinaryTreeNode;

public class ReplaceNodeWithLargestNodeSum {

//-------------------------------------------------------------------------------------------------------
//-- replace node function:
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		
		replaceSum(root ,0);
	}	
	public static int replaceSum(BinaryTreeNode<Integer> root , int sum) {
		if(root ==null) {
			return sum;
		}
		int rs = replaceSum(root.right,sum);
		
		root.data = root.data + rs;
		
		int ls = replaceSum(root.left,root.data);
		return ls;
	}
//---------------------------------------------------
	public static void main(String[] args) {
		
		Tree_Input_Print input = new Tree_Input_Print();
		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		replaceWithLargerNodesSum(root);
		input.printlevelwise(root);

	}
}
