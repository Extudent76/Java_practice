import java.util.Scanner;
public class Bookshelftest {
	public static void main(String[] args) {
		int c;
		Scanner scan = new Scanner(System.in);
		Bookshelf bookshelf = new Bookshelf();
		System.out.println("Введите количество книг на полке");
		bookshelf.createArr(c = scan.nextInt());
		System.out.println(bookshelf.toString());
		bookshelf.sort();
		System.out.println(bookshelf.toString());
		System.out.println(bookshelf.getMax());
		System.out.println(bookshelf.getMin());
	}
}
