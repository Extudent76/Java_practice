package practic_2;

import java.util.Scanner;

public class TestShop {
	public static void main(String[] args) {
		Shop x = new Shop();
		Scanner scan = new Scanner(System.in);
		String pc;
		boolean f =true;
		while (f) {
			System.out.println("Введите команду:");
			System.out.println("1 - Добавить компьютер");
			System.out.println("2 - Найти компьютер");
			System.out.println("3 - Удалить компьютер");
			System.out.println("4 - Вывести список компьютеров ");
			System.out.println("0 - Для выхода из программы ");
			int n, c = scan.nextInt();
			switch (c) {
				case 0:
					System.out.println("Конец программы");
					f = false;
					break;
				case 1:
					System.out.println("Введите имя пользователя компьютера");
					x.addPC(pc = scan.next());
					break;
				case 2:
					System.out.println("Введите имя пользователя компьютера");
					n = x.searchPC(pc = scan.next());
					n++;
					System.out.println("Это кмпьютер под номером" + (n + 1));
					break;
				case 3:
					System.out.println("Введите имя пользователя, чей компьбтер хотите удалить");
					n = x.searchPC(pc = scan.next());
					x.errasePC(n);
					break;
				case 4:
					x.output();
			}
		}
	}
}
