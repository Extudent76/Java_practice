package practic_14.Num_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		System.out.println(Pattern.compile("\\d+\\s*\\++\\d").matcher(new Scanner(System.in).nextLine()).matches());
	}
	//(1+8)–9/4
	//6/5–2*9
}
