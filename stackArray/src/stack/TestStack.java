package stack;

import java.util.*;
import java.util.Stack;

public class TestStack {
	// kiem tra xem có đối xứng hay ko??
	public static void isSymetic(String str) {
		String tmp = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));// lấy từng chữ cái trong chuỗi vào stack
		}
		while (stack.isEmpty() == false) {// nếu như trong stack còn phần tử
			tmp += stack.pop();// lấy từng phần tử ra rồi cộng vào tmp
		}
		if (str.equals(tmp)) {// kiểm tra đối xứng sử dụng equals
			System.out.println("Doi xung");
		} else
			System.out.println("Khong doi xung");
	}

	// kiểm tra đúng sai đóng, mở ngoặc
	public static boolean dauNgoacDonGian(String str) {
		char ktr;
		Stack<Character> stack = new Stack<Character>();// string="(()"
		for (int i = 0; i < str.length(); i++) {
			ktr = str.charAt(i);// gán từng phần tử thứ i vào ktr
			if (ktr == '(') {// nếu như ktr bằng dấu "("
				stack.push(ktr);// thêm vào stack
			} else {
				if (ktr == ')') {// nếu như ktr bằng dấu ")"
					if (stack.isEmpty())// kiểm tra trong stack xem có còn phần tử k
						return false;// nếu đúng thì trả về false
					else
						stack.pop();// nếu còn dấu "(" trong stack thì lấy ra
				}
			}
		}
		if (stack.isEmpty())// nếu như trong stack rỗng thì đúng(đóng mở ngoặc đúng)
			return true;
		else
			return false;// nếu còn dấu thì sai
	}

	// kiểm tra nhiều dấu ngoặc { [ ( ) ] }
	public static boolean nhieuDauNgoac(String str) {
		char ktr;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			ktr = str.charAt(i);
			if (ktr == '(' || ktr == '[' || ktr == '{') {
				stack.push(ktr);
			} else {
				if (ktr == ')' && stack.peek() == '(' || ktr == ']' && stack.peek() == '['
						|| ktr == '}' && stack.peek() == '{') {
					if (stack.isEmpty())
						return false;
					else
						stack.pop();
				}
			}
		}
		if (stack.isEmpty())
			return true;
		return false;
	}

	// chuyển 1 số n từ hệ 10 sang hệ 2
	public static String fromH10ToH2(int n) {
		String tpm = "";
		Stack<Integer> stack = new Stack<Integer>();
		while (n > 0) {
			int sd = n % 2;// vd: 11%2=1
			n /= 2; // vd: 11/2=5
			stack.push(sd);// thêm cái dư 1 vô stack
		}
		while (stack.isEmpty() == false) {// kiểm tra xem trong stack có còn ptu không
			tpm += stack.pop();// có thì lấy ra
		}
//		System.out.printf("%06d",Integer.valueOf(tpm));
//		System.out.println();
//		 System.out.printf("%04d", Integer.valueOf(tpm));
		return tpm;
	}

	public static String FromH10ToH2(int n, int k) {
		String tpm = "";
		Stack<Integer> stack = new Stack<Integer>();
		while (n > 0) {
			int sd = n % k;// vd: 11%2=1
			n /= k; // vd: 11/2=5
			stack.push(sd);// thêm cái dư 1 vô stack
		}
		while (stack.isEmpty() == false) {// kiểm tra xem trong stack có còn ptu không
			if (stack.peek() < 10)
				tpm += stack.pop();
			else
				tpm += (char) (stack.pop() + 55);
		}
		return tpm;
	}

	public static void fib(int n) {
		String tmp = " ";
		Stack<Integer> stack = new Stack<Integer>();
		int f0 = 0, f1 = 1, fn = 0;
		for (int i = 0; i <= n; i++) {
			stack.push(fn);
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
		}
		while (stack.isEmpty() == false)
			tmp = stack.pop() + " " + tmp;
		System.out.println(tmp);
	}
	
	public static void main(String args[]) {
		System.out.println("Xet truong hop doi xung: ");
		isSymetic("12321");
//		isSymetic("abcba");
//		System.out.println("Kiem tra dau '(' , ')':");
//		System.out.println(dauNgoacDonGian("(()"));
//		System.out.println(dauNgoacDonGian("(())))"));
//		System.out.println(dauNgoacDonGian("()"));
//		System.out.println("Kiem tra dau '(' , '{' , '[' , ']' , '}' , ')':");
//		System.out.println(nhieuDauNgoac("[{]"));
//		System.out.println("Doi he so: ");
//		System.out.println(fromH10ToH2(11));
//		System.out.println(FromH10ToH2(161, 16));
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		fib(n);
	}
}
