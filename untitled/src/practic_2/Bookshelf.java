package practic_2;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Bookshelf {
	Book[] array;
	int size;
	public void createArr ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество книг на полке");
		this.size = scan.nextInt();
		 array = new Book[size];
		String name,Author;
		int year;
		for (int i = 0; i < size; i++)
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
	 void sort ()
	{
		Arrays.sort(array, Comparator.comparing(Book::getYear));
	}
	 String getMax() {
		 double max=0;
		 for (int i = 0; i < size; i++) {
			 if (i==0) max = array[i].getYear();
			 if (max < array[i].getYear()) max = array[i].getYear();
		 }
		 for (int i = 0; i < size; i++) {
			 if (max == array[i].getYear()) return "Максимальный год: " + array[i].toString();
		 }
		 return " ";
	}

	 String getMin() {
		 double min=0;
		 for (int i = 0; i < size; i++) {
			 if (i==0) min = array[i].getYear();
			 if (min > array[i].getYear()) min = array[i].getYear();
		 }
		 for (int i = 0; i < size; i++) {
			 if (min == array[i].getYear()) return "Минимальный год: " + array[i].toString();
		 }
		 return " ";

	}

	void sout() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i].toString()); ;
		}
	}
}
