package CayNhiPhan.java;

public class Tree<E> {
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

	public Tree() {
		Node r8 = new Node(4);
		Node r3 = new Node(9, null, r8);
		Node r1 = new Node(7, r3, new Node(2));
		Node r6 = new Node(6, null, new Node(19));
		Node r5 = new Node(5, new Node(3), null);
		Node r2 = new Node(1, r5, r6);
		root = new Node(3, r1, r2);
	}

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

	// tinh tong cac node
	private int sumOrDer(Node r) {
		if (r == null) {
			return 0;
		}
		return (int) r.info + sumOrDer(r.left) + sumOrDer(r.right);
	}

	public int sumOrDer() {
		return sumOrDer(root);
	}

	// cout chẵn
	public int countEvenNumber(Node r) {
		if (r == null) {
			return 0;
		}
		if ((int) r.info % 2 == 0) {
			return 1 + countEvenNumber(r.left) + countEvenNumber(r.right);
		}
		return countEvenNumber(r.left) + countEvenNumber(r.right);
	}

	public int countEvenNumber() {
		return countEvenNumber(root);
	}

	// Dem node la
	private int LeafCount(Node r) {
		if (r == null)
			return 0;
		if (r.left == null && r.right == null)
			return 1;
		else
			return LeafCount(r.left) + LeafCount(r.right);
	}

	public int LeafCount() {
		return LeafCount(root);
	}

	// bac 1
	private int levelOneCount(Node r) {
		if (r == null) {
			return 0;
		}
		if ((r.left == null && r.right != null) || (r.left != null && r.right == null)) {
			return 1 + levelOneCount(r.left) + levelOneCount(r.right);
		} else
			return levelOneCount(r.left) + levelOneCount(r.right);
	}

	public int levelOneCount() {
		return levelOneCount(root);
	}

	// bac 2
	private int levelTwoCount(Node r) {
		if (r == null) {
			return 0;
		}
		if (r.left != null && r.right != null) {
			return 1 + levelTwoCount(r.left) + levelTwoCount(r.right);
		} else
			return levelTwoCount(r.left) + levelTwoCount(r.right);
	}

	public int levelTwoCount() {
		return levelTwoCount(root);
	}

	// Node noi
	private int SerialCount(Node r) {
		if (r == null)
			return 0;
		if (!(r.left == null && r.right == null) && r != root)
			return 1 + SerialCount(r.left) + SerialCount(r.right);
		else
			return SerialCount(r.left) + SerialCount(r.right);
	}

	public int SerialCount() {
		return SerialCount(root);
	}

	public boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 0; i < n / 2; i++)
			if (n % 2 == 0)
				return false;
		return true;
	}

	private int sumPrime(Node r) {
		if (r == null)
			return 0;
		if (isPrime((int) r.info))
			return (int) r.info + sumPrime(r.left) + sumPrime(r.right);
		return sumPrime(r.left) + sumPrime(r.right);
	}

	private int count(Node r) {
		if (r == null)
			return 0;
		if (isPrime((int) r.info))
			return 1 + count(r.left) + count(r.right);
		return count(r.left) + count(r.right);
	}
	public double averagerPrime()
	{
		return sumPrime(root)*1.0/count(root);
	}
	private boolean check(Node r, int x) {
		if (r == null)
			return false;
		if ((int) r.info == x)
			return true;
		return check(r.left, x) || check(r.right, x);
	}

	public void check(int x) {
		if (check(root, x) == true)
			System.out.println("\nX co trong cay");
		else
			System.out.println("\nX khong co trong cay");
	}
	
	
	public static void main(String[] args) {
		Tree<Integer> t = new Tree<Integer>();
		t.inOrDer();
		System.out.println();
		t.mixorder();
		System.out.println();
		t.postorder();
//		System.out.println();
//		System.out.println(t.countEvenNumber());
//		System.out.println(t.LeafCount());
//		System.out.println(t.SerialCount());
//		System.out.println(t.levelOneCount());
//		System.out.println(t.levelTwoCount());
//		System.out.println(t.sumOrDer());
		t.check(3);
	}

}
