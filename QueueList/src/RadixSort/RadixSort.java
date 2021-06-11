package RadixSort;

import java.util.Scanner;
import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;

public class RadixSort {
	private int[] a = new int[5];

	public void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + (i + 1) + "]= ");
			a[i] = sc.nextInt();
		}
	}
	
	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		a = new int[sc.nextInt()];
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(1000) - 500;
		}
	}

	public void output() {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public void Radix_Sort_Duong() {
		Queue<Integer> Q = new LinkedList<Integer>();
		Queue[] QQ = new LinkedList[10];
		for (int i = 0; i <= 9; i++)
			QQ[i] = new LinkedList();
		int x, vt, d = 1, max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			Q.add(a[i]);
		}
		int k = ("" + max).length();
		for (int i = 1; i <= k; i++) {
			while (!Q.isEmpty()) {
				x = (int) Q.remove();
				vt = (x / d) % 10;
				QQ[vt].add(x);
			}
			for (int j = 0; j <= 9; j++)
				while (!QQ[j].isEmpty()) {
					x = (int) QQ[j].remove();
					Q.add(x);
				}
			d = d * 10;
		}
		for (int i = 0; i < a.length; i++)
			a[i] = (int) Q.remove();

	}

	public void Radix_Sort_AmDuong() {
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++)
			q.add(a[i]);
		Queue[] qq = new LinkedList[20];
		for (int i = 0; i < 20; i++)
			qq[i] = new LinkedList();
		int index, d = 1, max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		int k = ("" + max).length();
		for (int i = 1; i <= k; i++) {
			while (!q.isEmpty()) {
				index = (Math.abs(q.element() / d) % 10);
				if (q.element() > 0)
					index += 10;
				qq[index].add((int) q.remove());
			}
			for (int j = 9; j>=0; j--)
				while (!qq[j].isEmpty())
					q.add((int) qq[j].remove());
			for (int j = 10; j <= 19; j++)
				while (!qq[j].isEmpty())
					q.add((int) qq[j].remove());
			d = d * 10;
		}
		int i = 0;
		while (i < a.length)
			a[i++] = q.remove();
	}

	public static void main(String[] args) {
		RadixSort r = new RadixSort();

		r.input1();
		r.output();
		r.Radix_Sort_AmDuong();;
		System.out.println("\nSau khi sap xep:");
		r.output();

	}

}
//==>THUAT TOAN SAP XEP RADIX SORT
//Bước 1: Tạo hàng đợi Q rỗng và cho các phần tử của dãy A vào Q.
//Tạo 10 hàng đợi QQ rỗng, đánh số từ QQ[0] đến QQ[9]
//k= số chữ số của số lớn nhất, d=1;
//Bước 2: Lặp từ 1 đến k
//- Lấy lần lượt các phần tử x trong Q, tính vt= (x/d)%10, sau đó
//cho x vào hàng đợi thứ QQ[vt];
//- Lặp i từ 0 đến 9, lấy tất cả các phần tử ở QQ[i] cho lại vào Q.
//- d= d*10;
//Bước 3: Lấy lần lượt các phần tử ở Q cho lại vào dãy A.
