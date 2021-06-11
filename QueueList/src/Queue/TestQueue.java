//package Queue;
//import java.util.Queue;
//import java.util.*;
//public class TestQueue {
//	public static void isSymetic(String str) {
//		String tmp = "";
//		Stack queue = new Stack();
//		for (int i = 0; i < str.length(); i++) {
//			queue.add(str.charAt(i));// lấy từng chữ cái trong chuỗi vào stack
//		}
//		while (queue.isEmpty() == false) {// nếu như trong stack còn phần tử
//			tmp += queue.remove();// lấy từng phần tử ra rồi cộng vào tmp
//		}
//		if (str.equals(tmp)) {// kiểm tra đối xứng sử dụng equals
//			System.out.println("Doi xung");
//		} else
//			System.out.println("Khong doi xung");
//	}
//}
