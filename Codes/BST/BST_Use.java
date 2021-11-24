package BST;

import BinaryTree.BinaryTreeNode;

public class BST_Use {

	public static void main(String[] args) {

		BST b = new BST();

		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);

		b.printTree();
		System.out.println("size = "+b.size());
		System.out.println(b.search(3));
		b.delete(6);
		b.printTree();
	}
}
