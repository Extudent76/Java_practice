package practic_3.program_2;
import practic_2.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class tester {
	private circle[] arr;
	private int size;

	public tester() {
		System.out.println("Введите размер массива");
		Scanner scan = new Scanner(System.in);
		this.size = scan.nextInt();
		arr = new circle[size];
		System.out.println("Введите x и y");
		for (int i = 0; i < size; i++) {
			arr[i] = new circle(scan.nextInt(), scan.nextInt());
		}
	}
	void sort ()
	{
		Arrays.sort(arr, Comparator.comparing(circle::getL));
	}
		String getMin(){
		double min=0;
			for (int i = 0; i < size; i++) {
				if (i==0) min = arr[i].getL();
				if (min > arr[i].getL()) min = arr[i].getL();
			}
			for (int i = 0; i < size; i++) {
				if (min == arr[i].getL()) return "Минимальный круг: " + arr[i].toString();
			}
			return " ";
		}
		String getMax() {
			double max=0;
			for (int i = 0; i < size; i++) {
				if (i==0) max = arr[i].getL();
				if (max < arr[i].getL()) max = arr[i].getL();
			}
			for (int i = 0; i < size; i++) {
				if (max == arr[i].getL()) return "Максимальный круг: " + arr[i].toString();
			}
			return " ";
		}
		 void sout() {
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i].toString()); ;
			}
		}
}

