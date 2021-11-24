package BST;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import BinaryTree.BinaryTreeNode;

public class Pair_sum {
//-----------------------------------------------------------------------------------------
//-- Function to find Pair sum:
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		
		Stack<Integer> InOrder  = new Stack<Integer>();
		printSumPair_helper(root , InOrder);
		for(int i : InOrder) {
			System.out.print(i+" ");
		}
	}
	
	public static void printSumPair_helper(BinaryTreeNode<Integer>root , Stack<Integer>InOrder) {
		if(root==null) {
			return;
		}
		Stack<Integer> RevInOrder = new Stack<Integer>();
		
		printSumPair_helper(root.left , InOrder);
		InOrder.add(root.data);
		printSumPair_helper(root.right, InOrder);
//		RevInOrder.add(root.data);
		
//		for(int j: RevInOrder) {
//			System.out.print(j+" ");
//		}
		}
	
//-----------------------------------------------------------------------------------------
//-- Main Method:
	public static void main(String[] args) {
		Tree_Input_Print input = new Tree_Input_Print();
		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		printNodesSumToS(root , sum);
	}

}
