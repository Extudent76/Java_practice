import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Bookshelf {
	Book[] array;
	public void createArr (int c)
	{
		Scanner scan = new Scanner(System.in);
		 array = new Book[c];
		String name,Author;
		int year;
		for (int i = 0; i < c; i++)
		{
			array[i]= new Book();
			System.out.println("Введите данные по книге");
			System.out.println("Введите Название");
			array[i].setName(name =  scan.next());
			System.out.println("Введите Автора");
			array[i].setAuthor(Author =  scan.next());
			System.out.println("Введите год");
			array[i].setYear(year =  scan.nextInt());
		}
	}
	public void sort ()
	{
		Arrays.sort(array, Comparator.comparing(Book::getYear));
	}
	public String getMax() {
		return Arrays.stream(array).max(Comparator.comparing(Book::getYear)).toString();
	}

	public String getMin() {
		return Arrays.stream(array).min(Comparator.comparing(Book::getYear)).toString();
	}

	@Override
	public String toString() {
		return Arrays.toString(array).toString();
	}
}
