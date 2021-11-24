package BST;

import java.util.ArrayList;
import java.util.Scanner;

import BinaryTree.BinaryTreeNode;

public class findXandReturnPath {
	
//-------------------------------------------------------------------------------------------------
//-- find X and Return the path function:
	   
	public static ArrayList<Integer> node_to_root_Path(BinaryTreeNode<Integer>root , int x){
		
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftoutput = node_to_root_Path(root.left, x);
		
		if(leftoutput != null) {
			leftoutput.add(root.data);
			return leftoutput;
		}
		ArrayList<Integer> rightoutput = node_to_root_Path(root.right, x);
		
		if(rightoutput !=null) {
			rightoutput.add(root.data);
			return rightoutput;
		}
			return null;
		}

//-----------------------------------------------------------------------------------------
	//-- Main Method:
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Tree_Input_Print input = new Tree_Input_Print();

		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		int x  = s.nextInt();
		ArrayList<Integer> path = node_to_root_Path(root, x);
		
		
		for(int i : path) {
			System.out.print(i+" ");
		}

	}
}
