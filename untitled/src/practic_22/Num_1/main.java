package practic_22.Num_1;

public class main {
	public static void main(String[] args) {
		try {
			System.out.println(PolishNotation.calculate("2 3 +"));
			System.out.println(PolishNotation.calculate("2 3 * 4 5 * +"));
			System.out.println(PolishNotation.calculate("2 3 4 5 6 * + - /"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
