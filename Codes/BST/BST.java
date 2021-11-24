package BST;

import BinaryTree.BinaryTreeNode;

public class BST {
	
	BinaryTreeNode<Integer> root;
	private int size;
	
//--Tree functions:
//----------------------------------------------------------------------
//-- element present or not:
	
	public static boolean isPresentHelper(BinaryTreeNode<Integer>node , int x) {

		if(node == null) {
			return false;
		}
		if(node.data ==x) {
			return true;
		}
		if(x < node.data ) {
			return isPresentHelper(node.left, x);
		}
		else{
			return isPresentHelper(node.right, x);
		}
	}

	public boolean search(int x) {
		return isPresentHelper(root, x) ;
	}
	
//-----------------------------------------------------------
//-- Insert x in tree:
	public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node , int x) {
		
		if(node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
			}
	
		if(x >= node.data) {
			node.right = insertHelper(node.right, x);
		}
		else {
			node.left  = insertHelper(node.left, x);
		}
		return node;
	}
	
	public void insert(int x) {
	
		root = insertHelper(root, x);
		size++;
		
	}
	
//--------------------------------------------------------
//-- delete an element form tree:
	public static deleteReturn deletehelper(BinaryTreeNode<Integer>root , int x) {
	
		if(root==null) {
			return new deleteReturn(null , false);
		}
		if(root.data < x) {
			deleteReturn outputright = deletehelper(root.right, x);
			root.right = outputright.root;
			outputright.root = root;
			return outputright;
			}
		
		if(root.data >x) {
			deleteReturn outputleft = deletehelper(root.left, x);
			root.left = outputleft.root;
			outputleft.root = root;
			return outputleft;
		}
		if(root.left == null && root.left == null) {
			return new deleteReturn(null, true);
		}
		if(root.left == null && root.right !=null) {
			return new deleteReturn(root.left, true);
		}
		int rightmin = minimum(root.right);
		root.data = rightmin;
		deleteReturn outputright = deletehelper(root.right,rightmin);
		root.right = outputright.root;
		return new deleteReturn(root, true);
	}
	
	public static int minimum(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return -1;
		}
		int minleft = minimum(root.left);
		int minright = minimum(root.right);
		return Math.min(root.data, Math.min(minleft, minright));
	}
		
	public boolean delete(int x) {
		deleteReturn output = deletehelper(root, x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
//--------------------------------------------------------------
	//--size of tree:
	public int size() {
		return size;
	}
	
//---------------------------------------------------------------
	//-- Print Tree:

	public void printHelper(BinaryTreeNode<Integer>node) {

		if(node == null) {
			return ;
		}
		System.out.print(node.data+": ");
		if(node.left != null) {
			System.out.print("L"+node.left.data+",");
		}
		if(node.right != null) {
			System.out.print("R"+node.right.data);
		}
		System.out.println();

		printHelper(node.left);
		printHelper(node.right);
	}
//------------	
	public void printTree() {
		printHelper(root);
	}
}
