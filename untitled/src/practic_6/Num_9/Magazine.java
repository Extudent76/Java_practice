package practic_6.Num_9;

public class Magazine implements Printable {
	private final String name;

	Magazine(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
