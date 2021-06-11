package cayNhiPhan;

public class MyBinaryTree {
	private class Node {
		private int data;
		private Node left;
		private Node right;

		// khoi tao cay rong
		public Node() {
			this.data = 0;
			this.left = this.right = null;
		}

		public Node(int Data) {
			this.data = Data;
			this.left = null;
			this.right = null;
		}
	}

	private Node root;

	public MyBinaryTree() {
		this.root = null;
	}
	public Node insertRec(Node newkey, int key) { 
		if (root == null) { 
	          root = new Node(key); 
	          return root; 
	      }  
		if (key < root.data) 
	           root.left = insertRec(root.left, key); 
	       else if (key > root.data) 
	           root.right = insertRec(root.right, key);
		return root;
	}
	public void inorderRec(Node root) { 
	     if (root != null) { 
	         inorderRec(root.left); 
	         System.out.println(root.data); 
	         inorderRec(root.right); 
	     } 
	 } 

	public static void main(String args[]) {
		MyBinaryTree Tr = new MyBinaryTree();
		Tr.insertRec(null, 5);
		Tr.insertRec(null, 6);
		Tr.insertRec(null, 1);
		Tr.insertRec(null, 3);
		
	}
}
