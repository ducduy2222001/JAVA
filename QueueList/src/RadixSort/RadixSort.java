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
//B?????c 1: T???o h??ng ?????i Q r???ng v?? cho c??c ph???n t??? c???a d??y A v??o Q.
//T???o 10 h??ng ?????i QQ r???ng, ????nh s??? t??? QQ[0] ?????n QQ[9]
//k= s??? ch??? s??? c???a s??? l???n nh???t, d=1;
//B?????c 2: L???p t??? 1 ?????n k
//- L???y l???n l?????t c??c ph???n t??? x trong Q, t??nh vt= (x/d)%10, sau ????
//cho x v??o h??ng ?????i th??? QQ[vt];
//- L???p i t??? 0 ?????n 9, l???y t???t c??? c??c ph???n t??? ??? QQ[i] cho l???i v??o Q.
//- d= d*10;
//B?????c 3: L???y l???n l?????t c??c ph???n t??? ??? Q cho l???i v??o d??y A.
