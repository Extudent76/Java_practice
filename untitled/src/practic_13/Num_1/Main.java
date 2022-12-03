package practic_13.Num_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.charAt(str.length() - 1));
		System.out.println(str.endsWith("!!!"));
		System.out.println(str.startsWith("I like"));
		System.out.println(str.contains("Java"));
		System.out.println(str.replace("a", "o"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

	}
}
