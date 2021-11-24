package BST;

import BinaryTree.BinaryTreeNode;

public class IsBSTorNot {

//---------------------------------------------------------------------------------------
	//-- Is Tree BST improved Using Class And Object:  O(n); worst case;

	public static isBSTReturn isBST2(BinaryTreeNode<Integer>root) {

		if(root==null) {
			isBSTReturn ans = new isBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		isBSTReturn leftAns = isBST2(root.left);
		isBSTReturn rightAns = isBST2(root.right);
		

		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		boolean isBST = true;
		
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		
		if(rightAns.min <root.data) {
			isBST = false;
		}
		
		if(! leftAns.isBST) {
			isBST = false;
		}
		
		if(! rightAns.isBST) {
			isBST = false;
		}
		
		isBSTReturn ans = new isBSTReturn(min , max , isBST);
		return ans;
	}

//---------------------------------------------------------------------------------------
	//-- Is Tree BST or Not: O(n*n);worst case or O(nlogn);
	
	public static boolean isBST(BinaryTreeNode<Integer>root) {
	
		if(root == null) {
			return true;
		}
		
		int leftMax = maximum(root.left);

		if(leftMax >= root.data){
			return false;
		}
		
		int rightMin = minimum(root.right);
		
		if(rightMin < root.data) {
			return false;
		}
		
		boolean isLeftBST =  isBST(root.left);
		boolean isRightBST = isBST(root.right);

		return isLeftBST && isRightBST;
	}

	//--Maximum function:
	public static int maximum(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return -1;
		}
		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);

		return Math.max(root.data, Math.max(leftMax, rightMax));
	}

	//--Minimum function:
	private static int minimum(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		return Math.min(root.data, Math.min(leftMin, rightMin));

	}

//------------------------------------------------------------------------------------
	//-- Main Method:
	public static void main(String[] args) {

		Tree_Input_Print input = new Tree_Input_Print();
	
		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		System.out.print(isBST(root));
	}	
}
