package practic_11.Num_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите месяц, число, час и минуту начала выполненения работы ");
			Dateclass Date = new Dateclass();
		    Date.display(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
	}
}
