package array_of_rectangle;

import array_of_integer.ArrayOfInteger;
import array_of_rectangle.Rectangle;

public class ArrayOfRectangle {
	// khai bao thuoc tinh cua class
	private Rectangle[] a;
	private int n;

	// ham khoi tao khong doi so
	public ArrayOfRectangle() {
		a = new Rectangle[3];
		n = 0;
	}

	// ham khoi tao 1 doi so
	public ArrayOfRectangle(int capacity) {
		a = new Rectangle[capacity];// capacity = suc chua
		n = 0;
	}

	// method: them mot phan tu element vaof cuoi mang a gom n phan tu
	public void add(Rectangle x) {
		// xet truong hop mang day`, de chuyen mang day thanh chua day
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			Rectangle[] b = new Rectangle[a.length * 2];
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
	public void add(Rectangle x, int index) {
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
					System.out.print(a[j].area() + " ");
				}
			}
	}

	// lay gia tri
	public Rectangle get(int index) {
		if (index < 0 || index >= n) {
			System.out.println("Invalid index");
			return null;
		} else
			return a[index];
	}

	// thay doi hoac truyen gia tri
	public void set(int index, Rectangle x) {
		if (index < 0 || index >= n)
			System.out.println("invalid index");
		else {
			a[index] = x;
			for (int i = 0; i < n; i++)
				System.out.print(a[i].area() + " ");
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
				System.out.print(a[i].area() + " ");
		}
	}

	// kiem tra gia tri co trong mang khong
	public boolean contain(Rectangle x) {
		for (int i = 0; i < n; i++)
			if (x.area() == a[i].area())
				return true;
		return false;
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung dau tien
	// trong mang, neu khong tra ve -1
	public int indexOf(Rectangle x) {
		for (int i = 0; i < n; i++) {
			if (a[i].area() == x.area())
				return i;
		}
		return -1;
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung cuoi cung
	// trong mang, neu khong tra ve -1
	public int lastIndexOf(Rectangle x) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i].area() == x.area())
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
		// Cach 1:
		// khai bao (xin) va cap phat 1 doi tuong mang arr
//			ArrayOfRectangle arr = new ArrayOfRectangle();// goi ham khoi tao khong doi so
//			Rectangle rec = new Rectangle();
//			rec.input();
//			rec.output();
//			arr.add(rec);
//			Rectangle rec1 = new Rectangle();
//			rec1.input();
//			rec1.output();
//			arr.add(rec1);
//			Rectangle rec2 = new Rectangle();
//			rec2.input();
//			rec2.output();
//			arr.add(rec2);
//			Rectangle rec3 = new Rectangle();
//			rec3.input();
//			rec3.output();
//			arr.add(rec3);
//			System.out.println(arr.get(0));
//			arr.set(1, rec);
//			arr.add(rec2, 2);
//			arr.remove(2);
//			System.out.println( arr.contain(rec));
//			System.out.println( arr.indexOf(rec1));
//			System.out.println( arr.lastIndexOf(rec2));
//			System.out.println( arr );// goi khong tuong minh
//		Rectangle rec1 = new Rectangle(6, 7);// r1=@1
//		rec1.output();
//		System.out.println(rec1);
//		System.out.println(rec1.area());
//		System.out.println(rec1.perimeter());
//
//		Rectangle rec2 = new Rectangle(16, 7);// r2=@2
//		rec2.output();
//		System.out.println(rec2);
//		System.out.println(rec2.area());
//		System.out.println(rec2.perimeter());
//		Rectangle rec3 = new Rectangle(6, 5);
//		rec3.output();
//		System.out.println(rec3);
//		System.out.println(rec3.area());
//		System.out.println(rec3.perimeter());
//		Rectangle rec4 = new Rectangle(6, 7);
//		rec4.output();
//		System.out.println(rec4);
//		System.out.println(rec4.area());
//		System.out.println(rec4.perimeter());
//		ArrayOfRectangle arr = new ArrayOfRectangle();
//		arr.add(rec1);
//		arr.add(rec2);
//		arr.add(rec3);
//		arr.add(rec4);
//		System.out.println();
//		System.out.println(arr.toString());//mac dinh goi arr.toString cua lop ArrayOfRectangle

//	Cach 2: gon hon
		ArrayOfRectangle arr1 = new ArrayOfRectangle();
		arr1.add(new Rectangle(1, 2));
		arr1.add(new Rectangle(3, 4));
		arr1.add(new Rectangle(1, 2));
		arr1.add(new Rectangle(7, 8));
		System.out.println();
		System.out.println(arr1.toString());
		System.out.println("Dien tich");
		for (int i = 0; i < arr1.n; i++)
			System.out.println(arr1.a[i].area());
		System.out.println("Chu vi:");
		for (int i = 0; i < arr1.n; i++)
			System.out.println(arr1.a[i].perimeter());
		System.out.println("Lay gia tri dien tich bat ki:");
		System.out.println(arr1.get(0).area());
		System.out.println("thay doi gia tri");
		arr1.set(1, new Rectangle(4, 4));
		System.out.println("\nThem gia tri bat ki: ");
		arr1.add(new Rectangle(4, 4), 2);
		System.out.println("\nxoa gia tri");
		arr1.remove(2);
		System.out.println("\nTim gia tri");
		System.out.print(arr1.contain(new Rectangle(1, 2)));
		System.out.println("\nTim gia tri x tra ve vi tri dau tien");
		System.out.print(arr1.indexOf(new Rectangle(1, 2)));
		System.out.println("\nTim gia tri x tra ve vi tri cuoi cung");
		System.out.print(arr1.lastIndexOf(new Rectangle(1, 2)));
	}
}
