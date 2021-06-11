package array_of_fraction;

import java.util.Scanner;

import array_of_rectangle.Rectangle;

public class Fraction {
	// khai bao thuoc tinh
	private int tuSo;
	private int mauSo;

	// ham khoi tao mac dinh
	public Fraction() {
		tuSo = 0;
		mauSo = 1;
	}

	// ham khoi tao co tham so
	public Fraction(int tu, int mau) {
		tuSo = tu;
		mauSo = mau;
	}

	public void input() {
		int n;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter tu so:");
		tuSo = kb.nextInt();
		// neu mauSo = 0 thi nhap lai
		do {
			System.out.println("Enter mau so:");
			mauSo = kb.nextInt();
		} while (mauSo == 0);

	}

	public void output() {
		if (tuSo == 0 || mauSo == 0) {
			System.out.println(0);
		} else
			System.out.println(tuSo + "/" + mauSo + " ");
	}
//in ra man hình
	public String toString() {
		return tuSo + "/" + mauSo + " ";
	}
//ham cong 2 ps
	public Fraction plus(Fraction ps) {
		if (ps.tuSo == 0 || ps.mauSo == 0) {
			int Tu = tuSo;
			int Mau = mauSo;
			Fraction pss = new Fraction(Tu, Mau);
			return pss;
		} else {
			int Tu = tuSo * ps.mauSo + ps.tuSo * mauSo;
			int Mau = mauSo * ps.mauSo;
			return new Fraction(Tu, Mau);
		}
	}
//ham tru 2 ps
	public Fraction minus(Fraction ps) {
		if (ps.tuSo == 0 || ps.mauSo == 0) {
			int Tu = -tuSo;
			int Mau = mauSo;
			return new Fraction(Tu, Mau);
		} else {
			int Tu = tuSo * ps.mauSo - ps.tuSo * mauSo;
			int Mau = mauSo * ps.mauSo;
			return new Fraction(Tu, Mau);
		}
	}
//ham nhan 2 ps
	public Fraction multiply(Fraction ps) {
		if (mauSo == 0 || ps.mauSo == 0) {
			int Tu = 0;
			int Mau = 0;
			return new Fraction(Tu, Mau);
		} else {
			int Tu = tuSo * ps.tuSo;
			int Mau = mauSo * ps.mauSo;
			return new Fraction(Tu, Mau);
		}
	}
//ham chia 2 ps
	public Fraction divide(Fraction ps) {
		if (ps.mauSo == 0) {
			System.out.println("Khong tinh duoc!!");
			return null;
		} else {
			int Tu = tuSo * ps.mauSo;
			int Mau = mauSo * ps.tuSo;
			return new Fraction(Tu, Mau);
		}
	}
// ham tra ve ps kieu double
	public double divide() {
		if (mauSo == 0) {
			System.out.println("Khong tinh duoc!!");
			return  0;
		} else {
			return (double) this.tuSo / (double) this.mauSo;
		}
	}

	public static void main(String[] args) {
		//khai bao doi tuong ps1
		Fraction ps1 = new Fraction();
		System.out.println("Phan so thu 1: ");
		ps1.input();
		ps1.output();
		//khai bao doi tuong ps2
		Fraction ps2 = new Fraction(3, 4);
		System.out.println("Phan so thu 2: ");
		ps2.output();
		//ps1 tro toi ham cong 2 ps, ps2 se gan vao tham so cua ham cong
		//ham plus tra ve fraction va se gan dia chi vao pTong
		Fraction psTong = ps1.plus(ps2);
		System.out.println("Tong hai phan so:" + psTong.toString());
		Fraction psHieu = ps1.minus(ps2);
		System.out.println("Hieu hai phan so:" + psHieu.toString());
		Fraction psTich = ps1.multiply(ps2);
		System.out.println("Tich hai phan so:" + psTich.toString());
		Fraction psThuong = ps1.divide(ps2);
		System.out.println("Thuong hai phan so (co tham so):" + psThuong);
		System.out.println("Thuong hai phan so (khong co tham so):" +  ps1.divide()/ps2.divide());
	}
}
