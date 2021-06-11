package array_list;

import array_of_rectangle.Rectangle;
import array_of_fraction.Fraction;
import java.util.*;

public class TextMyArrayList {
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	//. Tạo một lớp ArrayListTest1 bao gồm các thuộc tính và phương thức sau:
	//Thuộc tính: khai báo một đối tượng ArrayList chứa các số nguyên 
	//Các phương thức
	//a.	Tạo n số nguyên ngẫu nhiên cho đối tượng ArrayList, với n nhập từ bàn phím.
	//b.	Tính tổng các phần tử trong đối tượng ArrayList
	//c.	Đếm trong đối tượng ArrayList có bao nhiêu giá trị chẵn
	//d.	In ra các giá trị chia hết cho 2 hoặc 5 trong đối tượng ArrayList
	//e.	Tính trung bình cộng các số nguyên tố trong đối tượng ArrayList
	//f.	Xóa các giá trị âm trong đối tượng ArrayList
	//g.	Xóa các phần tử trùng nhau (giữ lại duy nhất 1 phần tử) trong đối tượng ArrayList
	//h.	Sắp xếp đối tượng ArrayList tăng (giảm) dần
	//i.	Giả sử đối tượng ArrayList đã tăng (giảm) dần. Hãy chèn một phần tử element vào đối tượng ArrayList sao cho đối tượng ArrayList vẫn tăng (giảm) dần
	//j.	Đưa các số chẳn về trước và các số lẽ về sau trong đối tượng ArrayList
	//k.	Tìm dãy con tăng dần dài nhất trong đối tượng ArrayList
	//l.	Tìm tổng lớn nhất của 2 phần tử liên tiếp cuối cùng trong đối tượng ArrayList
//nhap so bat ki
	public void input1() {
		int n ;
		System.out.println("Please Enter Number ");
		Scanner kb = new Scanner(System.in);
		n = (new Scanner(System.in)).nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number "+i);
			arr.add(kb.nextInt());
		}
	}
	public void input() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n:");
		n = sc.nextInt();
		for (int i = 0; i < n; i++)
			arr.add((int) (-20 + Math.random() * 100));
		System.out.println(arr);
	}

//tinh tong
	public void tinhTong() {
		long s = 0;
		System.out.print("Tong gia tri:");
		for (int i = 0; i < arr.size(); i++)
			s += arr.get(i);
		System.out.println(s);
	}

//dem so chan 
	public void demSoChan() {
		System.out.print("Dem so chan:");
		int dem = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 0)
				dem++;
		}
		System.out.print(dem);
	}

//so chia het cho 2 hoac 5
	public void soChiaHetCho2Or5() {
		System.out.print("\nSo chia het cho 2 hoac 5 la: ");
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 0 || arr.get(i) % 5 == 0)
				System.out.print(arr.get(i) + " ");
		}
	}

//kiem tra so nguyen to
	public int ktnt(int n) {
		if (n < 2)
			return 0;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return 0;
		return 1;
	}

//tinh trung binh cong so nguyen to
	public void tbcSnt() {
		int dem = 0;
		float tb = 0;
		float tong = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (ktnt(arr.get(i)) == 1) {
				dem++;
				tb += arr.get(i);
			}
		}
		tong = tb / dem;
		System.out.print("\nTrung binh cong so nguyen to: " + tong);
	}

//xoa so am
	public void xoaAm() {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < 0) {
				arr.remove(i);
				i--;
			}

		}
		System.out.print("\nXoa am:");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}

//xoa phan tu trung nhau
	public void xoaPhanTuTrungNhau() {
		System.out.println("Xoa phan tu trung nhau:");
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j)) {
					arr.remove(j);
					j--;
				}
			}
		}
		for (int i = 0; i < arr.size(); i++)
			System.out.print(arr.get(i) + " ");
	}

//sap xep tang dan
	public void sapXepTang() {
		System.out.println("\nSau khi sap xep tang dan: ");
		arr.sort(Comparator.comparingInt(o -> o));
		System.out.println(arr);
	}

//sap xep giam dan
	public void sapXepGiam() {
		System.out.println("Sau khi sap xep giam dan: ");
		arr.sort((a, b) -> a - b);
		System.out.println(arr);
	}

//them vi tri bat ki
	public void add(int x, int index) {
		System.out.println("\nThem vi tri bat ki: ");
		arr.add(index, x);
		System.out.println(arr);
	}

	public void hoanVi(int a, int b) {

		int temp1 = arr.get(a);
		int temp2 = arr.get(b);
		arr.set(b, temp1);
		arr.set(a, temp2);
	}

	public void doiSoChanLe() {
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 0) {
				hoanVi(i, index);
				index++;
			}
		}
		System.out.print("\nSau khi doi:");
		System.out.print(arr);
	}

	public void timTongMax() {
		int tongMax = 0;
		arr.sort((o1, o2) -> o2 - o1);
		tongMax = arr.get(0) + arr.get(1);
		System.out.print("\nTong lon nhat cua 2 ptu lien tiep cuoi cung: " + tongMax);
	}

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
//		MyArrayList<Fraction> arr2 = new MyArrayList<Fraction>();
//		arr2.add(new Fraction(1,2));
//		arr2.add(new Fraction(3,3));
//		arr2.add(new Fraction(6,4));
//		arr2.add(new Fraction(7,5));
//		for(int i=0;i<arr2.size();i++) {
//			System.out.print(arr2.get(i)+" ");
//		}
//		System.out.print("\nCong 2 ps:");	
//			System.out.print(arr2.get(0).plus(new Fraction(3,4))+" ");

		TextMyArrayList arr1 = new TextMyArrayList();
		// nhap so san co
		arr1.arr.add(1);
		arr1.arr.add(-3);
		arr1.arr.add(-2);
		arr1.arr.add(9);
		arr1.arr.add(-4);
		arr1.arr.add(6);
//		 nhap so ngau nhien
//		arr1.input();
//		arr1.tinhTong();
//		arr1.demSoChan();
//		arr1.soChiaHetCho2Or5();
//		arr1.tbcSnt();
//		arr1.xoaAm();
//		arr1.add(300, 1);
//		arr1.sapXepTang();
//		arr1.sapXepGiam();
//		arr1.xoaPhanTuTrungNhau();
//		arr1.doiSoChanLe();
//		arr1.timTongMax();

	}
}