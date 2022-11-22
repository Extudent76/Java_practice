package practic_6.Num_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	private  final ArrayList<Computer> listcomp = new  ArrayList<>();

	public void build() {
		int flag =1;
		while (flag != 0){
			Scanner scan = new Scanner(System.in);
			System.out.println("""
					Введите 1 чтобы добавить новый PC
					Введите 2 чтобы удалить PC
					Введите 3 чтобы найти PC в списке
					Введите 4 чтобы вывести весь список PC
					Введите 0 чтобы выйти
					""");
			flag = scan.nextInt();
			if (flag == 1) {
				System.out.println("Введите имя, память, монитор, процессор, марку");

				System.out.println(addElement(scan.next(), scan.next(), scan.next(), scan.next(), ComputerMark.valueOf(scan.next())));
			}
			if (flag == 2) {
				System.out.println("Введите имя пк");
				System.out.println(removeElement(scan.next()));
			}
			if (flag == 3) {
				System.out.println("Введите имя PC");
				System.out.println(searchElement(scan.next()));
			}
			if (flag == 4) {
				System.out.println("Список PC");
				System.out.println(toString());
			}
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return listcomp.toString();
	}
	private String addElement(String name, String memory, String monitor, String processor, ComputerMark computerMark) {
		listcomp.add(new Computer(name, memory, monitor, processor, computerMark));
		return " ";
	}
	private String removeElement(String name) {
		for (int i = 0; i < listcomp.size(); i++) {
			if (name.equals( listcomp.get(i).getName())) {
				listcomp.remove(i);
				return "PC удалён из списка";
			}
		}
		return "PC не найден в списке";
	}
	private String searchElement(String name) {
		for (int i = 0; i < listcomp.size(); i++)
			if (name.equals( listcomp.get(i).getName()))
				return "Такой PC есть в списке";
		return "Такой PC нет в списке";
	}

}
