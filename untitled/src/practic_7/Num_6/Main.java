package practic_7.Num_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringOperations stringOperations = new ProcessStrings();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(stringOperations.getOddString(str));
		System.out.println(stringOperations.reverse(str));
		System.out.println(stringOperations.getLength(str));
	}
}
