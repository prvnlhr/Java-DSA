package BinaryTree;

import java.util.Scanner;

public class LevelOfANode {
	
	
		public static int findlevel(BinaryTreeNode<Integer>root , int M) {
		
			int ans = level(root , M	 , 0);
			return ans;
			
		}
		
		public static int level(BinaryTreeNode<Integer>root , int m , int level) {
			
			if(root == null) {
				return 0;
			}
			if(root.data == m) {
				return level;
			}
			
			int result = level(root.left , m , level+1);
			
			if(result !=0) {
				return result; 
			}
			result = level(root.right , m , level+1);
			
			return result;
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
			int m = s.nextInt();
			int ans = findlevel(root , m);
			System.out.println(ans);
		}
	}



