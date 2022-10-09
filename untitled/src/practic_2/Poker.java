package practic_2;

import java.util.Scanner;

public class Poker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество пользователей");
		int n = scan.nextInt();
		String[] arr1 = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
		String[] arr2 = new String[]{"Пик", "Бубен", "Червь", "Треф"};
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 5; j++)
				System.out.print(arr1[(int) (Math.random() * 12)] + " "
						+ arr2[(int) (Math.random() * 3)] + " | ");
			System.out.println("\n");

		}
	}
}
