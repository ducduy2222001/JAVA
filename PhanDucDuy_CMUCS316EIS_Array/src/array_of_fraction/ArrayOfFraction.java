package array_of_fraction;

import array_of_fraction.Fraction;

public class ArrayOfFraction {
	// khai bao thuoc tinh cua class
	private Fraction[] a;
	private int n;

	// ham khoi tao khong doi so
	public ArrayOfFraction() {
		a = new Fraction[3];
		n = 0;
	}

	// ham khoi tao 1 doi so
	public ArrayOfFraction(int capacity) {
		a = new Fraction[capacity];// capacity = suc chua
		n = 0;
	}

	// method: them mot phan tu element vaof cuoi mang a gom n phan tu
	public void add(Fraction x) {
		// xet truong hop mang day`, de chuyen mang day thanh chua day
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			Fraction[] b = new Fraction[a.length * 2];
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

	// lay gia tri
	public Fraction get(int index) {
		if (index < 0 || index >= n) {
			System.out.println("Invalid index");
			return null;
		} else
			return a[index];
	}

	// thay doi hoac truyen gia tri
	public void set(int index, Fraction x) {
		if (index < 0 || index >= n)
			System.out.println("invalid index");
		else {
			a[index] = x;
			output();
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
			output();// in ra mang sau khi xoa 1 phan thu
		}
	}

	// kiem tra gia tri co trong mang khong
	public boolean contain(Fraction x) {
		for (int i = 0; i < n; i++)
			if (x.divide()== a[i].divide())
				return true;
		return false;
	}

	// them 1 gia tri x vao vi tri index trong mang a gom n ptu
	public void add(Fraction x, int index) {
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
				output();
			}
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung dau tien
	// trong mang, neu khong tra ve -1
	public int indexOf(Fraction x) {
		for (int i = 0; i < n; i++) {
			if (a[i].divide() == x.divide())
				return i;
		}
		return -1;
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung cuoi cung
	// trong mang, neu khong tra ve -1
	public int lastIndexOf(Fraction x) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i].divide() == x.divide())
				return i;
		}
		return -1;
	}

	// hamtoString tra ve 1 String chua noi cua mang
	public String toString() {
		String s = "";
		for (int i = 0; i < n; i++)
			s = s + a[i] + " ";
		return s;
	}

	public int size() {
		return n;
	}

	// ham main
	public static void main(String[] args) {
		// khai bao (xin) va cap phat 1 doi tuong mang arr
//		ArrayOfFraction arr = new ArrayOfFraction();// goi ham khoi tao khong doi so
//		Fraction Frac0 = new Fraction();
//		System.out.println("Phan so 1: ");
//		Frac0.input();
//		Frac0.output();
//		arr.add(Frac0);
//		Fraction Frac1 = new Fraction();
//		System.out.println("Phan so 2: ");
//		Frac1.input();
//		Frac1.output();
//		arr.add(Frac1);
//		Fraction Frac2 = new Fraction();
//		System.out.println("Phan so 3: ");
//		Frac2.input();
//		Frac2.output();
//		arr.add(Frac2);
//		Fraction Frac3 = new Fraction();
//		System.out.println("Phan so 4: ");
//		Frac3.input();
//		Frac3.output();
//		arr.add(Frac3);
//		System.out.println("In gia tri bat ki: ");
//		System.out.println(arr.get(0));
//		System.out.println("Thay doi gia tri bat ki: ");
//		arr.set(1, Frac0);
//		System.out.println("Them gia tri bat ki: ");
//		arr.add(Frac2, 2);
//		System.out.println("Xoa gia tri bat ki: ");
//		arr.remove(2);
//		System.out.println("Tim gia tri bat ki: ");
//		System.out.println(arr.contain(Frac0));
//		System.out.println("Tim gia tri bat ki o vi tri dau tien: ");
//		System.out.println(arr.indexOf(Frac2));
//		System.out.println("Tim gia tri bat ki o vi tri cuoi cung: ");
//		System.out.println(arr.lastIndexOf(Frac2));
//Cach 2: 
		ArrayOfFraction arr1 = new ArrayOfFraction();
		arr1.add(new Fraction(3, 4));
		arr1.add(new Fraction(1, 2));
		arr1.add(new Fraction(5, 6));
		arr1.add(new Fraction(7, 8));
		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.a[i] + " ");
		}
		System.out.println("\nCong 2 phan so trong mang: ");
		System.out.print(arr1.get(0).plus(new Fraction(1, 2)) + " ");
		System.out.println("\nTru 2 phan so trong mang: ");
		System.out.print(arr1.get(0).minus(new Fraction(1,2)) + " ");
		System.out.println("\nNhan 2 phan so trong mang: ");
		System.out.print(arr1.get(0).multiply(new Fraction(1,2)) + " ");
		System.out.println("\nChia 2 phan so trong mang: ");
		System.out.print(arr1.get(0).divide(new Fraction(1, 2)) + " ");
		System.out.println("\nIn gia tri bat ki: ");
		System.out.print(arr1.get(0));
		System.out.println("\nThay doi gia tri bat ki: ");
		arr1.set(1, new Fraction(100,200));
		System.out.println("Them gia tri bat ki: ");
		arr1.add(new Fraction(101,500), 2);
		System.out.println("Xoa gia tri bat ki: ");
		arr1.remove(3);
		System.out.println("Tim gia tri bat ki: ");
		System.out.println(arr1.contain(new Fraction(101,500)));
		System.out.println("Tim gia tri bat ki o vi tri dau tien: ");
		System.out.println(arr1.indexOf(new Fraction(3,4)));
		System.out.println("Tim gia tri bat ki o vi tri cuoi cung: ");
		System.out.println(arr1.lastIndexOf(new Fraction(101,500)));

		
	}

}
