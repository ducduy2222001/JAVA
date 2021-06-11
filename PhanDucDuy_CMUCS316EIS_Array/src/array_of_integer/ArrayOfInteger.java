package array_of_integer;

public class ArrayOfInteger {

	// khai bao thuoc tinh cua class
	private int a[];
	private int n;

	// ham khoi tao mac dinh khong doi so
	public ArrayOfInteger() {
		a = new int[3];
		n = 0;
	}

//	ham khoi tao 1 doi so
	public ArrayOfInteger(int capacity) {
		a = new int[capacity];
		n = 0;
	}

	// method: them mot phan tu element vao cuoi mang a gom n phan tu
	public void add(int element) {
		// xet truong hop mang day, de chuyen mang day thanh chua day
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			int b[] = new int[a.length * 2];
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
	public Integer get(int index) {
		if (index < 0 || index >= n) {
			System.out.print("invalid index");
			return null;
		} else
			return a[index];
	}

// hàm này thay đổi giá trị trong mảng
	public void set(int index, int x) {
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
	public boolean contain(int x) {
		for (int i = 0; i < n; i++)
			if (a[i] == x)
				return true;
		return false;
	}

// tìm x có trong mảng hay không.Nếu có thì trả về vị trí mà x đang đứng đầu tiên trong mảng
	public int indexOf(int x) {
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

// tìm x có trong mảng hay không.Nếu có thì trả về vị trí mà x đang đứng cuối cùng trong mảng
	public int lastIndexOf(int x) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

// chèn giá trị vào mảng 
	public void add(int x, int index) {
		// nếu index bé hơn 0 or nhỏ hơn bằng n thì sai
		if (index < 0 || index >= n) {
			System.out.print("invalid index");
		}
		if (n == a.length) {
			// khai bao va xin cap phat mang b
			int b[] = new int[a.length * 2];
			// chuyen cac phan tu o mang cu sang mang moi
			for (int i = 0; i < n; i++)
				b[i] = a[i];
			// gan dia chi cua b qua a;
			a = b;
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

	public String toString() {
		String s = "";
		for (int i = 0; i < n; i++)
			s = s + a[i] + " ";
		return s;
	}

	// ham main
	public static void main(String[] args) {
		// khai bao (xin) va cap phat 1 doi tuong mang arr
		ArrayOfInteger arr = new ArrayOfInteger();// goi ham khoi tao khong doi so
		arr.add(8);
		arr.add(1);
		arr.add(9);
		arr.add(2);
		arr.add(7);
		arr.add(4);
		arr.add(1);
		arr.output();
		System.out.print("\n");
//		arr.set(5, 10);
//		System.out.println("\n" + arr.get(2));
//		arr.remove(2);
//		System.out.println("\n" + arr.contain(9));
//		System.out.println(arr.indexOf(1));
		System.out.println(arr.lastIndexOf(1));
//		System.out.print("==>Sau khi chen: ");
//		arr.add(100, 4);
//		 System.out.println("\n" + arr);

	}
}
