package array_of_rectangle;

import java.util.Scanner;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle() {
		length = width = 0;
	}

	public Rectangle(double l, double w) {
		width = w;
		length = l;
	}

	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length:");
		length = kb.nextDouble();
		System.out.println("Enter width:");
		width = kb.nextDouble();
	}

	public void output() {
		System.out.println("the length:" + length + ",the width:" + width+" ");
	}

	public String toString() {
		return "the length:" + length + "," + "the width:" + width+" ";
	}
 
	public double area() {
		return length * width;
	}

	public double perimeter() {
		return (length + width) * 2;
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(6, 7);
		rec.output();
		System.out.println(rec);
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
	}

}
