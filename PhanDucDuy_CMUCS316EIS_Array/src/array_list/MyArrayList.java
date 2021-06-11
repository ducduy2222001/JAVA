package array_list;

import java.util.*;
import java.util.ArrayList;

import array_of_rectangle.Rectangle;
import array_of_fraction.Fraction;
public class MyArrayList<E> {
	// khai bao thuoc tinh cua class
	private E a[];
	private int n;

	// ham khoi tao khong doi so
	public MyArrayList() {
		a = (E[]) new Object[3];
		n = 0;
	}

	// ham khoi tao 1 doi so
	public MyArrayList(int capacity) {
		if (capacity < 0)
			a = (E[]) new Object[10];
		else
			a = (E[]) new Object[capacity];
	}

	// method: them mot phan tu element vaof cuoi mang a gom n phan tu
	public void add(E x) {
		// xet truong hop mang day`, de chuyen mang day thanh chua day
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			E b[] = (E[]) new Object[a.length * 2];
			// chuyen cac phan tu o mang cu sang mang moi
			for (int i = 0; i < n; i++)
				b[i] = a[i];
			// gan dia chi cua b qua a;
			a = b;
		}
		// chen element vao cuoi
		a[n] = x;
		n++;
	}

	// method: in ra man hinh cac phan tu cua mang a gom n phan tu
	public void output() {
		// System.out.println();
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	// them 1 gia tri x vao vi tri index trong mang a gom n ptu
	public void add(E x, int index) {
		if (index < 0 || index >= n) {
			System.out.println("Not add");
		}
		// tim i=index neu co thi tip tuc
		for (int i = n - 1; i >= 0; i--)
			if (i == index) {
				// them phan tu
				for (int j = n; j > index; j--) {
					a[j] = a[j - 1];
				}
				a[index] = x;
				n++;
				for (int j = 0; j < n; j++) {
					System.out.print(a[j] + " ");
				}
			}
	}

	// lay gia tri
	public E get(int index) {
		if (index < 0 || index >= n) {
			System.out.println("Invalid index");
			return null;
		} else
			return a[index];
	}

	// thay doi hoac truyen gia tri
	public void set(int index, E x) {
		if (index < 0 || index >= n)
			System.out.println("invalid index");
		else {
			a[index] = x;
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}
	}

	// ham xoa
	public void remove(int index) {
		if (index < 0 || index >= n) {
			System.out.println("invalid index");
		} else {
			for (int i = index; i < n; i++) {
				a[i] = a[i + 1];
			}
			n--;
			// output();// in ra mang sau khi xoa 1 phan thu
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}
	}

	// kiem tra gia tri co trong mang khong
	public boolean contain(E x) {
		for (int i = 0; i < n; i++)
			if (x == a[i])
				return true;
		return false;
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung dau tien
	// trong mang, neu khong tra ve -1
	public int indexOf(E x) {
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung cuoi cung
	// trong mang, neu khong tra ve -1
	public int lastIndexOf(E x) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	// hamtoString tra ve 1 String chua noi cua mang
	public String toString() {
		String s = "";
		for (int i = 0; i < n; i++)
			s = s + a[i].toString() + " ";
		return s;
	}

	public int size() {
		return n;
	}

	// ham main
	public static void main(String[] args) {
//		MyArrayList<Integer> arr = new MyArrayList<Integer>();
//		arr.add(new Integer(1));
//		arr.add(new Integer(3));
//		arr.add(new Integer(6));
//		arr.add(new Integer(7));
//		arr.output();
//
//		MyArrayList<Rectangle> arr1 = new MyArrayList<Rectangle>();
//		arr1.add(new Rectangle(1,2));
//		arr1.add(new Rectangle(3,3));
//		arr1.add(new Rectangle(6,4));
//		arr1.add(new Rectangle(7,5));
//		for(int i=0;i<arr1.size();i++) {
//			System.out.print(arr1.get(i).area()+" ");
//		}
		MyArrayList<Fraction> arr2 = new MyArrayList<Fraction>();
		arr2.add(new Fraction(1,2));
		arr2.add(new Fraction(3,3));
		arr2.add(new Fraction(6,4));
		arr2.add(new Fraction(7,5));
		for(int i=0;i<arr2.size();i++) {
			System.out.print(arr2.get(i)+" ");
		}
		System.out.print("\nCong 2 ps:");	
			System.out.print(arr2.get(0).plus(new Fraction(3,4))+" ");
		
	}
		
}
