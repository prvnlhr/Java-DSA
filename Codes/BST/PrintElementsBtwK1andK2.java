package BST;
import java.util.Scanner;
import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class PrintElementsBtwK1andK2 {

//--------------------------------------------------------------------------------------------------------
	//-- Search Between k1 and k2:
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){

		if(root == null) {
			return ;
		}
		if(root.data >= k1 && root.data <= k2 ) {

			printNodeFromK1ToK2(root.left , k1 , k2);
			System.out.print(root.data+" ");
			printNodeFromK1ToK2(root.right, k1, k2);
		}
		if(root.data < k1) {
			printNodeFromK1ToK2(root.right, k1, k2);
		}
		if(root.data > k2) {
			printNodeFromK1ToK2(root.left, k1, k2);
		}


		//			8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
		//			6 10///////
	}


//------------------------------------------------------------------------------------------------------
	//-- Main Method:
	public static void main(String[] args) {

		TakeInputLevelWise input = new TakeInputLevelWise();

		BinaryTreeNode<Integer> root = input.takeInputLevelWise();
		Scanner s = new Scanner(System.in);
		int k1 = s.nextInt();
		int k2 = s.nextInt();
		printNodeFromK1ToK2(root , k1 , k2);
	}
}
