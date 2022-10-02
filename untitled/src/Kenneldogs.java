import java.util.Scanner;
public class Kenneldogs {
	public static void main(String[] args) {
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество собак в питомнике");
		c = scan.nextInt();
		Dog[] x = new Dog[c];
		for (int i = 0; i < c; i++) {
			x[i]= new Dog();
			System.out.println("Введите Кличку собаки");
			String name = scan.next();
			x[i].setName(name);;
			System.out.println("Введите возраст собаки");
			int age = scan.nextInt();
			x[i].changeAge(age);
		}
		for (int i = 0; i < c; i++) {
			System.out.println(x[i].toString());
		}
	}
}
