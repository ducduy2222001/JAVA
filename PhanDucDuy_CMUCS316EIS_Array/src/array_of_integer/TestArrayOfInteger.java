package array_of_integer;

public class TestArrayOfInteger {
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
		arr.set(5, 10);
		System.out.println("\n" + arr.get(2));
		arr.remove(2);
		System.out.println("\n" + arr.contain(9));
		System.out.println(arr.indexOf(1));
		System.out.println(arr.lastIndexOf(1));
		System.out.print("==>Sau khi chen: ");
		arr.add(100, 4);
	}
}
