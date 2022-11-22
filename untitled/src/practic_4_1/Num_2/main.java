package practic_4_1.Num_2;

public class main {
	public static void main(String[] args) {
		Phone phone1 = new Phone(999, "iphone", 123.4);
		Phone phone2 = new Phone(888, "samsung", 432.1);
		Phone phone3 = new Phone();
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		phone1.receiveCall("А ");
		phone2.receiveCall("Б ");
		phone3.receiveCall("В ");
		phone1.receiveCall("Г ", 1111);
		phone2.receiveCall("Д ", 2222);
		phone3.receiveCall("И ", 3333);
		phone1.sendMessage(6123, 817, 7821, 812, 8123, 1512, 18237);
	}
}
