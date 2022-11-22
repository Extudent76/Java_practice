package practic_7.Num_8;

public interface Printable {
	static void print(Printable[] printables) {
		for (Printable printable : printables) {
			System.out.println(printable);
		}
	}
}
