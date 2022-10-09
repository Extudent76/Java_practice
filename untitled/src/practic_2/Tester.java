package practic_2;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество элементов в массиве");
		c = scan.nextInt();
		Circle[] x2 = new Circle[c];
		double centrx1, centry1;
		System.out.println("Введите координаты цента круга");
		centrx1 = scan.nextDouble();
		centry1 = scan.nextDouble();
		x2[0]= new Circle();
		x2[0].setCentreXY(centrx1, centry1);
        for (int i = 1; i < c; i++) {
			x2[i]= new Circle();
			System.out.println("Введите координаты точек круга");
            centrx1 = scan.nextDouble();
            centry1 = scan.nextDouble();
            x2[i].setPointXY(centrx1,centry1);
        }
		for (int i = 1; i < c; i++) {
			if (i == 1) {
				System.out.println(x2[0].toString1());
			}
			System.out.println(x2[i].toString2());
		}
	}
}
