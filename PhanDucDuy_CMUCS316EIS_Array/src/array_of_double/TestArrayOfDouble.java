package array_of_double;

public class TestArrayOfDouble {

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
		System.out.println(arr.indexOf(1.3));
//		System.out.println(arr.lastIndexOf(1));
		System.out.print("==>Sau khi chen: ");
		arr.add(100, 4);

	}
}
