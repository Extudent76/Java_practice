package practic_7.Num_7;

public class Book implements Printable{
	private final String name;
	Book(String name) {
		this.name = name;
	}
	public void print(Printable[] printables) {
		for (Printable printable : printables) {
			if (printable instanceof Book) {
				System.out.println(printable);
			}
		}
	}
	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				'}';
	}
}
