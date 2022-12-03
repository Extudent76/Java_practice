package practic_14.Num_7;

import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*_)(?=.*[a-z])(?=.*\\d)\\w{8,}$");
		System.out.println(pattern.matcher("F032_assword").matches());
		System.out.println(pattern.matcher("TrySpydas12").matches());
		System.out.println(pattern.matcher("smart_pass").matches());
		System.out.println(pattern.matcher("A007").matches());
	}
}
