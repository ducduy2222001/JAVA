package array_of_circle;

public class ArrayOfCircle {
	// khai bao thuoc tinh cua class
	private Circle[] a;
	private int n;

	// ham khoi tao khong doi so
	public ArrayOfCircle() {
		a = new Circle[3];
		n = 0;
	}

	// ham khoi tao 1 doi so
	public ArrayOfCircle(int capacity) {
		a = new Circle[capacity];// capacity = suc chua
		n = 0;
	}

	// method: them mot phan tu element vaof cuoi mang a gom n phan tu
	public void add(Circle x) {
		// xet truong hop mang day`, de chuyen mang day thanh chua day
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			Circle[] b = new Circle[a.length * 2];
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
	public Circle get(int index) {
		if (index < 0 || index >= n) {
			System.out.println("Invalid index");
			return null;
		} else
			return a[index];
	}

	// thay doi hoac truyen gia tri
	public void set(int index, Circle x) {
		if (index < 0 || index >= n)
			System.out.println("invalid index");
		else {
			a[index] = x;
			for (int i = 0; i < n; i++) {
				System.out.print(a[i].area() + " ");
			}
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
	public boolean contain(Circle x) {
		for (int i = 0; i < n; i++)
			if (x == a[i])
				return true;
		return false;
	}

	// them 1 gia tri x vao vi tri index trong mang a gom n ptu
	public void add(Circle x, int index) {
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

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung dau tien
	// trong mang, neu khong tra ve -1
	public int indexOf(Circle x) {
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	// tim vi tri x trong mang khong. neu co tra ve vi tri x dang dung cuoi cung
	// trong mang, neu khong tra ve -1
	public int lastIndexOf(Circle x) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	public int size() {
		return n;
	}

	// hamtoString tra ve 1 String chua noi cua mang
	public String toString() {
		String s = "";
		for (int i = 0; i < n; i++)
			s = s + a[i] + " ";
		return s;
	}

	// ham main
	public static void main(String[] args) {
		// khai bao (xin) va cap phat 1 doi tuong mang arr
//		ArrayOfCircle arr = new ArrayOfCircle();// goi ham khoi tao khong doi so
//		Circle cir0 = new Circle();
//		System.out.println("\nBan kinh hinh Tron 1: ");
//		cir0.input();
//		cir0.output();
//		arr.add(cir0);
//		Circle cir1 = new Circle();
//		System.out.println("\nBan kinh hinh Tron 2: ");
//		cir1.input();
//		cir1.output();
//		arr.add(cir1);
//		Circle cir2 = new Circle();
//		System.out.println("\nBan kinh hinh Tron 3: ");
//		cir2.input();
//		cir2.output();
//		arr.add(cir2);
//		Circle cir3 = new Circle();
//		System.out.println("\nBan kinh hinh Tron 4: ");
//		cir3.input();
//		cir3.output();
//		arr.add(cir3);
//		System.out.println();
//		System.out.println("Lay gia tri bat ki: ");
//		System.out.print(arr.get(0));
//		System.out.println("In gia tri bat ki: ");
//		arr.set(1, cir0);
//		System.out.println("Them gia tri bat ki: ");
//		arr.add(cir2, 2);
//		System.out.println("Xoa gia tri bat ki: ");
//		arr.remove(2);
//		System.out.println("Tim gia tri bat ki: ");
//		System.out.println(arr.contain(cir0));
//		System.out.println("Tim gia tri bat ki o vi tri dau tien: ");
//		System.out.println(arr.indexOf(cir1));
//		System.out.println("Tim gia tri bat ki o vi tri cuoi cung: ");
//		System.out.println( + arr.lastIndexOf(cir1));
		ArrayOfCircle cir0 = new ArrayOfCircle();
		cir0.add(new Circle(3));
		cir0.add(new Circle(4));
		cir0.add(new Circle(6));
		cir0.add(new Circle(1));
		cir0.add(new Circle(2));
		cir0.add(new Circle(7));
		// xuat ra Dien Tich
		System.out.println("Dien tich:");
		for (int i = 0; i < cir0.size(); i++) {
			System.out.print(cir0.a[i].area() + " ");
		}
		// xuat ra Chu Vi
		System.out.println("\nChu vi:");
		for (int i = 0; i < cir0.size(); i++) {
			System.out.print(+cir0.a[i].perimeter() + " ");
		}
		System.out.println("\nLay gia tri dien tich bat ki: ");
		System.out.print(cir0.get(0).area());
		System.out.println("\nThay doi gia tri dien tich bat ki: ");
		cir0.set(1, new Circle(8));
		System.out.println("\nThem gia tri bat ki: ");
		cir0.add(new Circle(1), 3);
//		System.out.println("Xoa gia tri bat ki: ");
//		arr.remove(2);
//		System.out.println("Tim gia tri bat ki: ");
//		System.out.println(arr.contain(cir0));
//		System.out.println("Tim gia tri bat ki o vi tri dau tien: ");
//		System.out.println(arr.indexOf(cir1));
//		System.out.println("Tim gia tri bat ki o vi tri cuoi cung: ");
//		System.o
	}
}