package practic_3;
import java.util.Scanner;
public class OnlineShop {
	public static void main(String[] args) {
		Converter_2 converter = new Converter_2();
		Scanner scan = new Scanner(System.in);
		int flag = 1;
		double cost =0;
		while (flag!=0)
		{
			System.out.println("Выберите вещь");
			System.out.println("1 - Штаны - 3000 руб");
			System.out.println("2 - Футболка - 1500 руб");
			System.out.println("3 - Куртка - 6000 руб");
			System.out.println("0 - выход из программы");
			int p, m = scan.nextInt();
			switch (m) {
				case 1:
					cost = 3000;
					System.out.println("Выберите какой валютой оплатить");
					System.out.println("1 - Рубли");
					System.out.println("2 - Доллары");
					System.out.println("3 - Евро");
					System.out.println("4 - Фунты");
					switch (p=scan.nextInt())
					{
						case 1:
							System.out.println("С вас " + cost + "руб");
							break;
						case 2:
							System.out.println("С вас "+ converter.ConvertToDol(cost));
							break;
						case 3:
							System.out.println("С вас "+converter.ConvertToEur(cost));
							break;
						case 4:
							System.out.println("С вас "+converter.ConvertToGbp(cost));
							break;
					}
					break;
				case 2:
					cost = 1500;
					System.out.println("Выберите какой валютой оплатить");
					System.out.println("1 - Рубли");
					System.out.println("2 - Доллары");
					System.out.println("3 - Евро");
					System.out.println("4 - Фунты");
					switch (p = scan.nextInt())
					{
						case 1:
							System.out.println("С вас " + cost + " руб");
							break;
						case 2:
							System.out.println("С вас "+ converter.ConvertToDol(cost));
							break;
						case 3:
							System.out.println("С вас "+converter.ConvertToEur(cost));
							break;
						case 4:
							System.out.println("С вас "+converter.ConvertToGbp(cost));
							break;
					}
					break;
				case 3:
					cost = 6000;
					System.out.println("Выберите какой валютой оплатить");
					System.out.println("1 - Рубли");
					System.out.println("2 - Доллары");
					System.out.println("3 - Евро");
					System.out.println("4 - Фунты");
					switch (p = scan.nextInt())
					{
						case 1:
							System.out.println("С вас " + cost + "руб");
							break;
						case 2:
							System.out.println("С вас "+ converter.ConvertToDol(cost));
							break;
						case 3:
							System.out.println("С вас "+converter.ConvertToEur(cost));
							break;
						case 4:
							System.out.println("С вас "+converter.ConvertToGbp(cost));
							break;
					}
					break;
				case 0:	flag = 0;
					break;
			}
		}
	}
}
