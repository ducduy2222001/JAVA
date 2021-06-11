package stack;

import java.util.*;

public class StackArray<E> {
	private E a[];
	private int size, top;

	public StackArray() {
		a = (E[]) new Object[10];
		size = 0;
		top = -1;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	public E peek() {
		if (size == 0) {
			System.out.println("Stack is empty");
			return null;
		}
		return a[top];
	}

	public E pop() {
		if (size == 0) {
			System.out.println("Stack is empty");
			return null;
		}
		E tmp = a[top];
		a[top] = null;
		top--;
		size--;
		return tmp;
	}

	public E push(E e) {
		if (size == a.length) {
			System.out.println("Stack is full");
			return null;
		}
		top++;
		a[top] = e;
		size++;
		return e;
	}

	public String toString() {
		String s = " ";
		for (int i = 0; i < size; i++) {
			s += a[i] + " ";
		}
		return s;
	}

	public static void main(String args[]) {
		StackArray<Integer> lis = new StackArray<Integer>();
		lis.push(2);
		lis.push(3);
		lis.push(1);
		lis.push(4);
		lis.push(10);
		lis.push(12);
		lis.push(13);
		lis.push(11);
		lis.push(6);
		System.out.println(lis);
//		System.out.println(lis.isEmpty());
//		System.out.println(lis.peek());
//		System.out.println(lis.pop());

	}
}
