package BinaryTree;

public class PrintTreeFromPreInOrder {

//-------------------------------------------------------------------------------------------------------------------------
//-- Build tree Function

	public static BinaryTreeNode<Integer> BuildTree(int[] pre , int [] in){
		
		BinaryTreeNode<Integer> root = BuildHelper(pre , in ,  0, pre.length-1, 0 , in.length-1);
		return root;
	}
//------------------------
//-- Build tree helper:
	
	public static BinaryTreeNode<Integer> BuildHelper(int[] pre , int[] in , int preS , int preE , int inS , int  inE ){

		if(inS > inE) {
			return null ;
		}
		
		int rootdata = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		
		int i = inS;

		while( i <= inE) {

			if(in[i]== rootdata) {
				break;
			}
			i++;
		}

		int leftInStart = inS;
		int leftInEnd = i-1;
		int rightInStart = i+1;
		int rightInEnd = inE;
		
		int leftPreStart = preS +1;
		int rightPreEnd = preE;

		int leftLength = leftInEnd - leftInStart + 1;
		int leftPreEnd = leftPreStart + leftLength - 1;
		int rightPreStart = leftPreEnd + 1;

		BinaryTreeNode<Integer> left = BuildHelper(pre, in, leftPreStart, leftPreEnd, leftInStart, leftInEnd);
		BinaryTreeNode<Integer> right = BuildHelper(pre, in, rightPreStart, rightPreEnd, rightInStart, rightInEnd);
		root.left = left ;
		root.right = right ;
		return root;
	}
//----------------------------------------------------------------------------------------------------------------------------
//-- Print Function
	
	public static void PrintDetailed(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return ;
		}
		System.out.print(root.data+": ");
		if(root.left != null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();

		PrintDetailed(root.left);
		PrintDetailed(root.right);
	}

	
//-------------------------------------------------------------------------------------------------------------------------------------
//-- Main Method
	public static void main(String[] args) {
		int [] in  = { 4 ,2 , 5 , 1 , 3 };
		int [] pre = { 1 , 2 , 4 , 5, 3 };
		BinaryTreeNode<Integer> root = BuildTree(pre, in);
		PrintDetailed(root);
	}
}



