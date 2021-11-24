package BinaryTree;

import java.util.Scanner;

public class TreeBalancedOrNot {
	
//--------------------------------------------------------------------
// for a tree to be balanced, at every node the left and right height should
// have difference 1 or smaller then 1(<=1),
// i.e (left sub tree height - right subtree height <=1) ; at [every node]
// program steps--
// root left and right height  difference is <=1 then only check for root left side and then right side
//----------------------------------------------------------------------------------------------------------
//-- Balanced or Not O(n*n);
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return true;
		}
		
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		
		if(Math.abs( leftheight - rightheight) > 1) {
			return false;
			
		}
		boolean isLeftbalanced = isBalanced(root.left);
		boolean isRightbalance = isBalanced(root.right);
		return isLeftbalanced && isRightbalance;
	}
	
	static int height = 0;
	public static int height(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return height; 
		}
		
		int leftheight = 1 + height(root.left);
		int rightheight = 1 + height(root.right);
		int height = Math.max(leftheight, rightheight);
		return height;
		}
//----------------------------------------------------------------------------------
	
//-- Tree Balanced Improved Using Class and Object O(n); 

		public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer>root) {
			
			if(root == null) {
				int height = 0;
				boolean isBal = true;
				BalancedTreeReturn ans = new BalancedTreeReturn();
				ans.height = height;
				ans.isbalanced = isBal;
				return ans;
			}
			BalancedTreeReturn leftOutput = isBalancedBetter(root.left);          
			BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
			
			boolean isBal = true;                                                  
			int height = 1 + Math.max(leftOutput.height , rightOutput.height);     
																					
			if(Math.abs(leftOutput.height - rightOutput.height)>1) {				
				isBal  = false;														
			}
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isbalanced = isBal;
			return ans;
			}
		
		
//-------------------------------------------------------------------------------------------------------
	//-- TakeInput

				static Scanner s = new Scanner(System.in);
				public static BinaryTreeNode<Integer> takeInput(){

					int rootdata = s.nextInt();

					if(rootdata == -1) {
						return null;
					}
					BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
					BinaryTreeNode<Integer> leftchild = takeInput();
					BinaryTreeNode<Integer> rightchild = takeInput();
					root.left = leftchild;
					root.right = rightchild;
					return root;
				}
	//----------------------------------------------------------------------------------------------------------
	//-- Print Function

				public static void printTree(BinaryTreeNode<Integer>root) {

					if(root == null) {
						return ;
					}
					System.out.println(root.data);
					printTree(root.left);
					printTree(root.right);
				}

	//-----------------------------------------------------------------------------------------------------
	//-- Main Method

				public static void main(String[] args) {

					BinaryTreeNode<Integer> root = takeInput();
//					System.out.println(isBalanced(root));
					System.out.println(isBalancedBetter(root).isbalanced);
					
				}
			}
	

