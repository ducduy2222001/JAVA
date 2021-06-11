package array_list;

import java.util.*;

public class ArrayListTest2 {
	private ArrayList<Integer> arr;

	public ArrayListTest2() {
		arr = new ArrayList<Integer>();
	}

	public ArrayListTest2(int arr) {
		arr = arr;
	}
	//nhap so lieu bang tay
	public void input() {
		int n ;
		System.out.println("Please Enter Number ");
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number "+i);
			arr.add(kb.nextInt());
		}
	}
	public void output() {
		for (int i = 0; i < arr.size(); i++)
			System.out.print(arr.get(i) + " ");
	}

//Tinh ham F(x0)
	public void daThucFx() {
		Scanner sc = new Scanner(System.in);
		int x,n;
		System.out.print("\nNhap gia tri x: ");
		x = sc.nextInt();
		System.out.print("Nhap gia tri n: ");
		n = sc.nextInt();
		long s = 0;
		for (int i = n - 1; i >= 0; i--) {
			s = s + (long) (arr.get(i) * Math.pow(x, i));
			n--;
		}
		System.out.print("Ham F(x0): " + s);
	}

//Tinh ham F'(x0)
	public void daThucFxx() {
		Scanner sc = new Scanner(System.in);
		int x, n;
		System.out.print("\nNhap gia tri x: ");
		x = sc.nextInt();
		System.out.print("Nhap gia tri n: ");
		n = sc.nextInt();
		long s = 0;
		for (int i = n - 1; i >= 0; i--) {
			s = s + (long) (arr.get(i) * i * Math.pow(x, i - 1));
			n--;
		}
		System.out.print("Ham F'(x0): " + s);
	}

	public static void main(String[] args) {
		ArrayListTest2 arr1 = new ArrayListTest2();
//		arr1.arr.add(1);
//		arr1.arr.add(2);
//		arr1.arr.add(3);
		arr1.input();
		arr1.output();
		arr1.daThucFx();
		arr1.daThucFxx();
	}
}
