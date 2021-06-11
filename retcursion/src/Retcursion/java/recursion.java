package Retcursion.java;

public class recursion {
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static String boiso(int n) {
		if (n == 0)
			return "la boi so cua 7";
		if (n < 0)
			return "khong phai boi so cua 7";
		return boiso(n - 7);
	}

	public static int Tong(int n) {
		if (n == 1)
			return 1;
		return n + Tong(n - 1);
	}

	public static int tongLe(int n) {
		if (n == 1)
			return 1;
		if (n % 2 == 0)
			return tongLe(n - 1);
		return n + tongLe(n - 2);
	}

//2^n
	public static int mu(int n) {
		if (n == 0)
			return 1;
		return mu(n - 1) + mu(n - 1);
	}

//ucln
	public static int ucln(int x, int y) {
		if (x == 0 || y == 0)
			return x + y;
		if (x >= y)
			return ucln(x - y, y);
		return ucln(x, y - x);
	}

//chia
	// cach 1 chia:
	public static int chia(int a, int b) {
		if (a == 0 || a < b)
			return 0;
		return 1 + chia(a - b, b);
	}

	// cach 2 chia:
	public static int quotient(int a, int b) {
		if (a == b)
			return 1;
		if (a > b)
			return 1 + quotient(a - b, b);
		return 0;
	}

//chia du
	public static int chiaDu(int a, int b) {
		if (a < b)
			return a;
		return chiaDu(a - b, b);
	}

	public static void convert(int n, int k)
	{ 
		if(n>0)
		{ convert(n/k,k);
		if(n%k>10) 
			System.out.println(n%k);
		else System.out.println( (char) ((n%k)+55)); 
		}
	}

	public static void main(String args[]) {
//		System.out.println(factorial(5));
//		System.out.println("Kiem tra boi so: ");
//		System.out.println(boiso(28));
//		System.out.println(Tong(5));
//		System.out.println(tongLe(5));
//		System.out.println(mu(5));
//		System.out.println(ucln(6, 3));
//		System.out.println(chia(28,7));
		// System.out.println(chiaDu(10,3));
		convert(2,10);
	}
}
