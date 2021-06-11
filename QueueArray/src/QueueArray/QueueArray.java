package QueueArray;

public class QueueArray<E> {
	private E a[];
	private int head, tail, size;

	public QueueArray() {
		head = tail = size = 0;
		a = (E[]) new Object[10];
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public E element() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return null;
		}
		return a[head];
	}

	public E remove() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return null;
		}
		E tmp = a[head];
		a[head++] = null;
		size--;
		head = head % a.length;

		return tmp;
	}

	public boolean add(E e) {
		if (size == a.length)
			return false;
		a[tail++] = e;
		tail = tail % a.length;
		size++;
		return true;
	}

	public String toString() {
		String s = "";
		  int i = head;
		while (a[i] != null) {
			s += a[i++] + " ";
			i = i % a.length;
		}
		return s;
	}

	public static void main(String args[]) {
		QueueArray<Integer> Q = new QueueArray<Integer>();
		Q.add(8);
		Q.add(2);
		Q.add(1);
		Q.add(3);
		Q.add(7);
		Q.add(10);
		Q.add(8);
		Q.add(4);
		Q.add(5);
		Q.add(-11);
		Q.remove();
		Q.remove();
		Q.remove();
		Q.remove();
		Q.remove();
		Q.add(-12);
		Q.add(-13);
//		Q.remove();
//		Q.remove();
		Q.remove();
		Q.remove();
		Q.remove();
		System.out.println(Q);
	}
}
