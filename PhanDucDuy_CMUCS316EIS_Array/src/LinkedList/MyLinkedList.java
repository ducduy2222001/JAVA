package LinkedList;

import java.util.Comparator;

public class MyLinkedList<E> {
	private class Node {
		private E info;
		private Node next;

		public Node(E info) {
			this.info = info;
			this.next = null;
		}

		public Node(E info, Node next) {
			this.info = info;
			this.next = next;
		}
	}

	private int size;
	private Node head, tail;

	public MyLinkedList() {
		this.size = 0;
		this.head = this.tail = null;
	}

	public void addFirst(E element) {
		Node p = new Node(element);
		if (size == 0)
			head = tail = p;
		else {
			p.next = head;
			head = p;
		}
		size++;
	}

	public void addLast(E element) {
		Node p = new Node(element);
		if (size == 0) {
			head = tail = p;
			tail.next = null;
		} else {
			tail.next = p;
			tail = p;
			tail.next = null;
		}
		size++;
	}

	public void add(int index, E x) {
		if (index < 0 || index > size) {
			System.out.println("invalid index!");
			return;
		}
		if (index == 0) {
			addFirst(x);
			return;
		}
		if (index == size) {
			addLast(x);
			return;
		}
		Node q = head;
		for (int i = 0; i < index; i++)
			q = q.next;
		Node r = head;
		while (r.next != q)
			r = r.next;
		Node p = new Node(x);
		r.next = p;
		p.next = q;
		size++;
	}

	public void removeFirst() {
		if (head == null)
			System.out.println("can not delete !");
		if (head == tail)
			head = tail = null;
		Node p = head.next;
		head.next = null;
		head = p;
		size--;
	}

	public void removeLast() {
		if (head == null)
			System.out.println("can not delete !");
		if (head == tail)
			head = tail = null;
		Node q = head;
		while (q.next != tail)
			q = q.next;
		q.next = null;
		tail = q;
		size--;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			System.out.println("invalid index");
			return;
		}
		if (index == 0) {
			removeFirst();
			return;
		}
		if (index == size - 1) {
			removeLast();
			return;
		}
		Node q = head;
		for (int i = 1; i < index; i++)
			q = q.next;
		Node r = head;
		while (r.next != q)
			r = r.next;
		r.next = q.next;
		q.next = null;
		size--;
	}

	public String toString() {
		Node q = head;
		String s = " ";
		while (q != null) {
			s += q.info + " ";
			q = q.next;
		}
		return s;
	}

	public E get(int index) {
		if (index < 0 || index >= size) {
			System.out.println("invalid index");
			return null;
		}
		Node q = head;
		for (int i = 1; i <= index; i++)
			q = q.next;
		return q.info;

	}

	public void set(int index, E x) {
		if (index < 0 || index >= size) {
			System.out.println("invalid index");
			return;
		}
		Node q = head;
		for (int i = 1; i <= index; i++)
			q = q.next;
		q.info = x;
	}

	public boolean contain(E x) {
		Node q = head;
		while (q != null) {
			if (q.info == x)
				return true;
			q = q.next;
		}
		return false;

	}

	public int indexOf(E x) {
		Node q = head;
		int i = 0;
		while (q != null) {
			if (q.info == x) {
				i++;
				return i;
			}
			q = q.next;
		}
		return -1;
	}

	public int LastIndexOf(E x) {
		Node q = head;
		for (int i = size - 1; i >= 0; i--) {
			if (q.info == x) {
				return i;
			}
			q = q.next;
		}
		return -1;
	}

	public void sortAscen() {
		E[] arr = (E[]) new Object[size];
		int i = 0;
		for (Node p = head; p != null; p = p.next) {
			arr[i++] = p.info;
		}
		for (int j = 0; j < size - 1; j++) {
			for (int k = j + 1; k < size; k++) {
				if ((int) arr[j] > (int) arr[k]) {
					E temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
		}
		i = 0;
		for (Node p = head; p != null; p = p.next) {
			p.info = arr[i++];
		}
	}

	public void insertAcs(E x) {
		Node q = new Node(x);
		if ((int) x <= (int) head.info) {
			addFirst(x);
			return;
		}
		if ((int) x >= (int) tail.info) {
			addLast(x);
			return;
		}
		for (Node p = head; p != null; p = p.next) {
			if ((int) p.info <= (int) x && (int) x < (int) p.next.info) {
				q.next = p.next;
				p.next = q;
				size++;
				break;
			}
		}
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.addFirst(8);
		list.addFirst(1);
		list.addFirst(4);
		list.addFirst(2);
		list.addFirst(7);
		
		System.out.print(list);
//		System.out.println("\n" + list.contain(5));
//		System.out.println(list.indexOf(5));
//		System.out.println("\n"+list.LastIndexOf(2));
//		System.out.println("\n" + list);
//		System.out.print("\n" + list.get(0));
//		list.set(2, 20);
//		System.out.println("\n" + list);
//		list.add(4, 10);
//		System.out.println("\n" + list);
//		list.removeFirst();
//		System.out.println("\n" + list);
//		list.removeLast();
//		System.out.println(list);
//		list.remove(6);
//		System.out.println("\n"+list);
//		list.sortAscen();
//		list.insertAcs(4);
//		System.out.println("\n" + list);
	}

}
