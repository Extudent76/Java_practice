package practic_18.Num_4;

import java.util.Scanner;

public class Exception2 {
	public void exceptionDemo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer ");
		String intString = myScanner.next();
		try {
			int i = Integer.parseInt(intString);
			System.out.println(2 / i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block for exception");
		}
	}
}
