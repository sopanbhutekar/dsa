package heap.BST;

public class ImplementationOfBST {

	public static void main(String[] args) {
		
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(10);
		tree.insert(20);		
		System.out.println("In Order Traversal:");
		tree.inOrder();	
		tree.insert(5);
		tree.insert(21);
		tree.insert(9);
		tree.insert(30);
		System.out.println("\nIn Order Traversal:");
		tree.inOrder();
		System.out.println("\nPre Order Traversal:");
		tree.preOrder();
		System.out.println("\nPost Order Traversal:");
		tree.postOrder();
	}

}
