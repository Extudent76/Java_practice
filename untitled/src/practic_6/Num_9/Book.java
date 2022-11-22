package practic_6.Num_9;

public class Book implements Printable {
	private final String name;

	Book(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
