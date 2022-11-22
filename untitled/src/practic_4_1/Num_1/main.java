package practic_4_1.Num_1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите значения:");
		double num = scan.nextDouble();
		double num1 = scan.nextDouble();
		circle circle = new circle(num);
		rectangle rectangle = new rectangle(num, num1);
		square square = new square(num);
		circle.getArea();
		circle.getPerimeter();
		System.out.println(circle);
		rectangle.getArea();
		rectangle.getPerimeter();
		System.out.println(rectangle);
		square.getArea();
		square.getPerimeter();
		System.out.println(square);
	}
}
