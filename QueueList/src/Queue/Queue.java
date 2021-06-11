package Queue;

public class Queue<E> {
	private class Node {
		private E info;
		private Node next;

		public Node(E info) {
			this.info = info;
			this.next = next;
		}

		public Node(E info, Node next) {
			this.info = info;
			this.next = next;
		}
	}

	private int size;
	private Node head, tail;

	public Queue() {
		size = 0;
		head = tail = null;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	public E element() {
		if (size == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		return head.info;
	}

	public E remove() {
		if (head == null) {
			System.out.println("Queue rong");
			return null;
		}
		if (head == tail)
			head = tail = null;
		Node q = head;
		E tmp = q.info;
		q = head.next;
		head = q;
		size--;
		return tmp;
	}

//	public E add(E e) {
//		Node p = new Node(e);
//		if (size == 0) {
//			head = tail = p;
//			tail.next = null;
//		} else {
//			tail.next = p;
//			tail = p;
//			tail.next = null;
//		}
//		size++;
//		return p.info;
//	}

	public boolean add(E e) {
		int tmp = size;
		Node p = new Node(e);
		if (size == 0)
			head = tail = p;
		else {
			tail.next = p;
			tail = p;
		}
		size++;
		return tmp == size;
	}

	public String toString() {
		Node p = head;
		String s = "";
		while (p != null) {
			s += p.info + " ";
			p = p.next;
		}
		return s;
	}

	public static void main(String args[]) {
		Queue<Integer> list = new Queue<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(8);
		list.add(10);
		list.add(31);
		list.add(15);
		// list.remove();
		System.out.println(list);
		// System.out.println(list.element());
		// System.out.println(list.remove());
		// System.out.println(list);
	}
}
