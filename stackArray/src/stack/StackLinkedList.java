package stack;

import java.util.*;

public class StackLinkedList<E> {
	public class Node {
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

	private Node top;
	private int size;

	public StackLinkedList() {
		top = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	public E peek() {
		if (size == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		return top.info;
	}

	public E pop() {
		if (size == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		E tmp = top.info;
		top.info = null;
		top = top.next;
		size--;
		return tmp;
	}

	public E push(E e) {
		Node p = new Node(e);
		if (size == 0) {
			top = p;
		} else {
			p.next = top;
			top = p;
		}
		size++;
		return top.info;
	}

	public String toString() {
		Node p =top;
		String s = "";
		while (p != null) {
			s += p.info + " ";
			p = p.next;
		}
		return s;
	}

	public static void main(String args[]) {
		StackLinkedList<Integer> lis = new StackLinkedList<Integer>();
		lis.push(2);
		lis.push(3);
		lis.push(6);
		lis.push(1);
		lis.push(7);
		System.out.println(lis);
		System.out.println(lis.isEmpty());
		System.out.println(lis.peek());
		System.out.println(lis.pop());
		System.out.println(lis);
	}
	
}
