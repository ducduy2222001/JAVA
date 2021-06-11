package array_of_circle;

import java.util.*;

import array_of_rectangle.Rectangle;

public class Circle {
	private double radius;
	final double PI = 3.14;

	public Circle() {
		radius = 0;
	}

	public Circle(double r) {
		radius = r;
	}

	public void input() {

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = kb.nextDouble();
	}

	public void output() {
		System.out.print("the radius: " + radius+" ");

	}

	public String toString() {
		return "the radius: " + radius+" ";
	}

	public double area() {
		return radius * radius * PI;
	}

	public double perimeter() {
		return radius * 2 * 3.14;
	}

	public static void main(String[] args) {
		Circle rec = new Circle(3);
		rec.output();
		System.out.println(rec);
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
	}

}
