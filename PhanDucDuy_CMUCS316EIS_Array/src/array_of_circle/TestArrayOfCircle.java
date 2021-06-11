package array_of_circle;

import array_of_circle.ArrayOfCircle;

public class TestArrayOfCircle {
	public static void main(String[] args) {
		//Cach 1:
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
//		//Cach 2:
		ArrayOfCircle cir0 = new ArrayOfCircle();
		cir0.add(new Circle(9));
		cir0.add(new Circle(4));
		cir0.add(new Circle(6));
		cir0.add(new Circle(1));
		cir0.add(new Circle(2));
		cir0.add(new Circle(3));
		// xuat ra Dien Tich
		System.out.println("Dien tich:");
		for (int i = 0; i < cir0.size(); i++) {
			System.out.print(cir0.get(i).area() + " ");
		}
		// xuat ra Chu Vi
		System.out.println("\nChu vi:");
		for (int i = 0; i < cir0.size(); i++) {
			System.out.print(+cir0.get(i).perimeter() + " ");
		}
		System.out.println("\nLay gia tri dien tich bat ki: ");
		System.out.print(cir0.get(0).area());
		System.out.println("\nThay doi gia tri dien tich bat ki: ");
		cir0.set(1, new Circle(8));
//		System.out.println("\nThem gia tri bat ki: ");
//		cir0.add(new Circle(3), 1);
//		System.out.println("Xoa gia tri bat ki: ");
//		cir0.remove(2);
//		System.out.println("Tim gia tri bat ki: ");
//		System.out.println(cir0.contain(cir0));
//		System.out.println("Tim gia tri bat ki o vi tri dau tien: ");
//		System.out.println(cir0.indexOf(cir1));
//		System.out.println("Tim gia tri bat ki o vi tri cuoi cung: ");
	}
}
