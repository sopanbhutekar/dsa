package heap.BST;

public class BinarySearchTree {

	 public class Node{
		 int data;
		 Node left;
		 Node right;
		 
		 Node(int key){
			 data=key;
			 left=right=null;
		 }
	 }
	 Node root;
	 
	 BinarySearchTree()
	 {
		 root=null;
	 }
	 
	public void insert(int key){
		
			 root=insertUtil(root,key);		 
	 }	
	
	public Node insertUtil(Node root, int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
	
			if(key<root.data){
				root.left=insertUtil(root.left,key);
			}else{
				root.right=insertUtil(root.right,key);
			}
		
		return root;
	}
	
	public void inOrder(){
		inOrderUtil(root);
	}
	
	public void preOrder(){
		preOrderUtil(root);
	}
	public void postOrder(){
		postOrderUtil(root);
	}
	
	public void preOrderUtil(Node root){
		if(null!=root){
		System.out.print(root.data+" ");
		preOrderUtil(root.left);
		preOrderUtil(root.right);
		}
	}
	
	public void postOrderUtil(Node root){
		if(null!=root){
		postOrderUtil(root.left);
		postOrderUtil(root.right);
		System.out.print(root.data+" ");
		
		}
	}
	public void inOrderUtil(Node root){
		if(null!=root){			
			inOrderUtil(root.left);
			System.out.print(root.data+" ");
			inOrderUtil(root.right);			
		}
		
	}
}
