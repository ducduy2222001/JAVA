package array_of_rectangle;
import array_of_rectangle.Rectangle;
public class TestArrayOfRectangle {
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
		for (int i = 0; i < arr1.size(); i++)
			System.out.println(arr1.get(i).area());
		System.out.println("Chu vi:");
		for (int i = 0; i < arr1.size(); i++)
			System.out.println(arr1.get(i).perimeter());
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
