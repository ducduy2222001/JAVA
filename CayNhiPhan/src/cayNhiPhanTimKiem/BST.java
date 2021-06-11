package cayNhiPhanTimKiem;

public class BST<E> {
	private class Node<E> {
		private E info;
		private Node left, right;

		public Node(E info) {
			this.info = info;
			this.left = this.right = null;
		}

		public Node(E info, Node l, Node r) {
			this.info = info;
			this.left = l;
			this.right = r;
		}
	}

	private Node root = null;

	private void inOrDer(Node r) {
		if (r != null) {
			System.out.print(r.info + " ");
			inOrDer(r.left);
			inOrDer(r.right);
		}
	}

	public void inOrDer() {
		inOrDer(root);
	}

	// duyet trung tu<TGP>
	private void mixorder(Node r) {
		if (r != null) {
			mixorder(r.left);
			System.out.print(r.info + " ");
			mixorder(r.right);
		}
	}

	public void mixorder() {
		mixorder(root);
	}  

	// duyet hau tu<TPG>
	private void postorder(Node r) {
		if (r != null) {
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.info + " ");
		}
	}

	public void postorder() {
		postorder(root);
	}

//them cay vao cay nhi phan
	private Node add(Comparable<E> x, Node r) {
		if (r != null) {
			if (x.compareTo((E) r.info) < 0) {
				r.left = add(x, r.left);
				return r;
			} else if (x.compareTo((E) r.info) > 0) {
				r.right = add(x, r.right);
				return r;
			} else {
				System.out.println("x is exit");
				return r;
			}
		} else {
			r = new Node(x);
			return r;
		}
	}

	public void add(Comparable<E> x) {
		root = add(x, root);
	}
	
	
	public static void main(String[] args) {
		BST<Integer> b = new BST<Integer>();
		b.add(3);
		b.add(1);
		b.add(2);
		b.add(2);
		b.add(7);
		b.add(9);
		b.add(5);
		b.inOrDer();
	}

}
