package array_of_double;

public class ArrayOfDouble {

	// khai bao thuoc tinh cua class
	private double[] a;
	private int n;

	// ham khoi tao mac dinh khong doi so
	public ArrayOfDouble() {
		a = new double[3];
		n = 0;
	}

//	ham khoi tao 1 doi so
	public ArrayOfDouble(int capacity) {
		a = new double[capacity];
		n = 0;
	}

	// method: them mot phan tu element vao cuoi mang a gom n phan tu
	public void add(double element) {
		// xet truong hop mang day, de chuyen mang day thanh chua day
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			double b[] = new double[a.length * 2];
			// chuyen cac phan tu o mang cu sang mang moi
			for (int i = 0; i < n; i++)
				b[i] = a[i];
			// gan dia chi cua b qua a;
			a = b;
		}
		// chen element vao cuoi
		a[n] = element;
		n++;
	}

	// method: in ra man hinh cac phan tu cua mang a gom n phan tu
	public void output() {
		System.out.println();
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

//lấy giá trị trong mảng rồi in ra ngoài
	public double get(int index) {
		if (index < 0 || index >= n) {
			System.out.print("invalid index");
			return (Double) null;
		} else
			return (int) a[index];
	}

// hàm này thay đổi giá trị trong mảng
	public void set(int index, double x) {
		if (index < 0 || index >= n) {
			System.out.print("invalid index");
		} else {
			a[index] = x;
			output();
		}
	}

// xoa giá trị bất kì trong mảng
	public void remove(int index) {
		if (index < 0 || index >= n) {
			System.out.print("invalid index");
		} else {
			for (int i = index; i < n; i++) {
				a[i] = a[i + 1];
			}
			n--;
			output();
		}
	}

// Tìm giá trị bất kì trong mảng 
	public boolean contain(double x) {
		for (int i = 0; i < n; i++)
			if (a[i] == x)
				return true;
		return false;
	}

// tìm x có trong mảng hay không.Nếu có thì trả về vị trí mà x đang đứng đầu tiên trong mảng
	public int indexOf(double x) {
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

// tìm x có trong mảng hay không.Nếu có thì trả về vị trí mà x đang đứng cuối cùng trong mảng
	public int lastIndexOf(double x) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	public String toString() {
		String s = " ";
		for (int i = 0; i < n; i++) {
			s = s + a[i] + " ";
		}
		return s;
	}

	public int size() {
		return n;
	}

// chèn giá trị vào mảng 
	public void add(double x, int index) {
		// nếu index bé hơn 0 or nhỏ hơn bằng n thì sai
		if (index < 0 || index >= n) {
			System.out.print("invalid index");
		}
		// tìm index trong mảng nếu có thì tiếp tục
		for (int i = n - 1; i >= 0; i--) {
			if (i == index) {
				for (int j = n; j > index; j--) {
					a[j] = a[j - 1];
				}
				a[index] = x;
				n++;
				output();
			}
		}
	}

	// ham main
	public static void main(String[] args) {
		// khai bao (xin) va cap phat 1 doi tuong mang arr
		ArrayOfDouble arr = new ArrayOfDouble();// goi ham khoi tao khong doi so
		arr.add(8.5);
		arr.add(1.4);
		arr.add(9.2);
		arr.add(-2.7);
		arr.add(7.2);
		arr.add(4.9);
		arr.add(1.3);
		arr.output();
		System.out.print("\n");
		arr.set(5, 10);
		System.out.println("\n" + arr.get(2));
		arr.remove(2);
		System.out.println("\n" + arr.contain(1.4));
//		System.out.println(arr.indexOf(1));
//		System.out.println(arr.lastIndexOf(1));
		System.out.print("==>Sau khi chen: ");
		arr.add(100, 4);

	}
}
