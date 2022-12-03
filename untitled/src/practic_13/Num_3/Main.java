package practic_13.Num_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String address = new Scanner(System.in).nextLine();
		Address addressClass = new Address();
		addressClass.Tokenizer(address);
		System.out.println(addressClass);
		addressClass.Split(address);
		System.out.println(addressClass);
	}
}
