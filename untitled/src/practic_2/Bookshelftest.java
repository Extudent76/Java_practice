package practic_2;

import java.util.Scanner;
public class Bookshelftest {
	public static void main(String[] args) {
		int c;
		Scanner scan = new Scanner(System.in);
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.createArr();
		bookshelf.sout();
		bookshelf.sort();
		bookshelf.sout();
		System.out.println(bookshelf.getMax());
		System.out.println(bookshelf.getMin());
	}
}
