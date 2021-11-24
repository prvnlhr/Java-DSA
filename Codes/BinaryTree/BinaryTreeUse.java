package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {

//--------------------------------------------------------------
//--Print Nodes without siblings
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}

		if(root.left==null || root.right==null) {
			if(root.left!= null) {
			System.out.println(root.left.data);
		} 
			if(root.right!=null) {
				System.out.println(root.right.data);
			}
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}
	}
//-----------------------------------------------------------------------------------------------
//--If x is present in Tree or Not
	
	static boolean present = false;
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
		 
		if(root==null) {
			return false;
		}
		if(root.data == x) {
			present  = true;
		}
		isNodePresent(root.left, x);
		isNodePresent(root.right, x);
		return present;
	}

//-----------------------------------------------------------------------------------------
//--Replace root.data = depth
	public static void replaceDepth(BinaryTreeNode<Integer>root) {

		int k = 0;
		replaceNode(root , k);
		printInOrder(root);
	}

	public static void replaceNode(BinaryTreeNode<Integer>root , int k){

		if(root == null) {
			return;
		}
		root.data = k;
		replaceNode(root.left , k++);
		replaceNode(root.right , k++);
	}
	public static void printInOrder(BinaryTreeNode<Integer>root) {
	    if (root== null)  
            return;  
        printInOrder(root.left);  
        System.out.println(root.data);  
        printInOrder(root.right);  
    }
	

//------------------------------------------------------------------------------------
//-- Print Nodes At height k
	
	public static void printAtK(BinaryTreeNode<Integer>root , int k) {
		
		if(root == null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
		}
		printAtK(root.left , k-1);
		printAtK(root.right ,k-1);
	}
	
//----------------------------------------------------------------------------------
//--Num of Leaves
	
	static int leavescount = 0;
	
	public static int numLeaves(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return leavescount;
		}
		if(root.left==null && root.right==null) {
				leavescount++;
		}
		numLeaves(root.left);
		numLeaves(root.right);
		return leavescount;
		
	}
	
//-------------------------------------------------------------------------------------------
//--Height of tree
	
	static int height = 0;
	public static int height(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return height; 
		}
		int leftheight = 1 + height(root.left);
		int rightheight = 1 + height(root.right);
		int height = Math.max(leftheight, rightheight);
		return height;
		}
	
//------------------------------------------------------------------------------------------
//--GreaterThenX
		
	static int count =0;
	public static int numNodesGreaterX(BinaryTreeNode<Integer>root , int x) {
		
		if(root == null) {
			return count ;
		}
		if(root.data > x) {
			count++;
		}
		numNodesGreaterX(root.left,x);
		numNodesGreaterX(root.right,x);
		return count;
	}
	
//------------------------------------------------------------------------------------------------------
//--Largest Number in Node
	
	public static int largest(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return -1;
		}
		int largestleft = largest(root.left);
		int largestright = largest(root.right);
		return Math.max(root.data, Math.max(largestleft, largestright));
	}
	
//-------------------------------------------------------------------------------------------------	
//-- Sum of All nodes of Tree 
	
	public static  int sum(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return 0;
		}
		int leftsum = sum(root.left);
		int rightsum = sum(root.right);
		return root.data + leftsum + rightsum;
	}
//------------------------------------------------------------------------------------------------------------
//-- Number of Nodes of Tree 
	
	public static int numNodes(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return 0;
		}
		int numOfLeftNode = numNodes(root.left);
		int numOfRightNodes = numNodes(root.right);
		
		return 1 + numOfLeftNode + numOfRightNodes;
	}
	
//------------------------------------------------------------------------------------
//-- Printing Preorder And PostOrder 
	
	public static void postOrder(BinaryTreeNode<Integer>root) {
		
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		}

//------------------------------------------------------------------------
	public static void preOrder(BinaryTreeNode<Integer>root) {
		
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
		}

	
//--------------------------------------------------------------------------	
//-- Printing without stating details of right and left 
	
	public static void printTree(BinaryTreeNode<Integer>root) {

		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
//----------------------------------------------------------------------------------------------	
//-- Printing in detailed manner stating L and R for left , right
	public static void PrintDetailed(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			 return ;
		 }
		System.out.print(root.data+": ");
		if(root.left != null) {
			System.out.print("L"+root.left.data+","+20);
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		
		PrintDetailed(root.left);
		PrintDetailed(root.right);
	}

//-----------------------------------------------------------------------------------------------
//-- Function to take input from  user and creating Node
	
	public static BinaryTreeNode<Integer> takeInput(){
		
		 System.out.println("Enter rootData");
		Scanner s = new Scanner(System.in);
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
	
//---------------------------------------------------------------------------------------------------------------------------------------	
//-- Improvement if Input : this function ask what to input--> leftchild or rightchild 	
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot , int parentdata , boolean isLeft){
		
		if(isRoot) {
			System.out.println("Enter rootData");
		}
		else {
			if(isLeft) {
			System.out.println("Enter Left Child "+parentdata);
		}
			else{
				System.out.println("Enter Right Child "+ parentdata);
			}
				
			}
		
		Scanner s = new Scanner(System.in);
		int rootdata = s.nextInt();
		
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftchild = takeInputBetter(false , rootdata , true);
		BinaryTreeNode<Integer> rightchild = takeInputBetter(false , rootdata , false);
		root.left = leftchild;
		root.right = rightchild;
		 return root;
	}
//-----------------------------------------------------------------------------------------------------------------------	
//-- Main Method --------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
// conventionally Creating Node and giving input //
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1); // creating root
//		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2); //creating root left
//		BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer>(3); // creating root right
//		root.left = rootleft;    //making connections to left 
//		root.right= rootright;   //making connections to right
//
//		BinaryTreeNode<Integer> tworight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeleft = new BinaryTreeNode<Integer>(5);
//		rootleft.right = tworight;
//		rootright.left = threeleft;
		
// Taking Input from User and Creating Node //
		
//		BinaryTreeNode<Integer> root = takeInput();
		BinaryTreeNode<Integer> root = takeInputBetter(true , 0 , true);
		
		//printTree(root);
	
//		PrintDetailed(root);
//		preOrder(root);
//		System.out.println();
//		postOrder(root);
//		System.out.print("Largest: "+largest(root));
//--------------------------------------------------------------
//		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();
//		int count = numNodesGreaterX(root , x);
//		System.out.println(count);
//----------------------------------------------------------------------
//		height(root);
//		System.out.println(height(root));
//		printAtK(root , 2);
		replaceDepth(root);
//		printTree(root);
//		System.out.println(isNodePresent(root, 2));
//		printNodesWithoutSibling(root);
	
//		System.out.println("Number of Nodes of Tree : "+numNodes(root));
		
//		System.out.println("Sum of All Nodes : "+sum(root));
		
	}
}
	
