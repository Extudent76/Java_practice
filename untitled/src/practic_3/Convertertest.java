package practic_3;
import java.util.Scanner;
public class Convertertest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество рублей");
		double n = scan.nextDouble();
		Converter_1 converter = new Converter_1();
		int flag = 1;
		while (flag !=0) {
			System.out.println("Выберите действие");
			System.out.println("1 - перевести в доллары");
			System.out.println("2 - перевести в евро");
			System.out.println("3 - перевести в фунты");
			System.out.println("0 - выход из программы");
			int m = scan.nextInt();
			switch (m) {
				case 1:
					System.out.println(converter.ConvertToDol(n));
					break;
				case 2:
					System.out.println(converter.ConvertToEur(n));
					break;
				case 3:
					System.out.println(converter.ConvertToGbp(n));
					break;
				case 0:	flag = 0;
				break;
			}
		}
	}
}
