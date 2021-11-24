package BST;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputAndPrint;
import LinkedList.LinkedListNode;

public class BSTtoLL {
//-----------------------------------------------------------------------------------------------------------------------------------
//-- Convert BST to LL:
	
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		
		LinkedListNode<Integer> node = new LinkedListNode<Integer>(2);
		if(root == null) {
			return null; 
		}
		
		return node;
		
		
	}

	
	
//---------------------------------------------------------------------------------------------------------------------------------
//-- Main Method:
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Tree_Input_Print input = new Tree_Input_Print();
		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		

	}

}
