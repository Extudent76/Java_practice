package practic_6.Num_10;

public enum ComputerMark {
	MARK1("HP"),
	MARK2("APPLE"),
	MARK3("ASUS");

	private final String name;

	ComputerMark(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "ComputerMark{" +
				"name='" + name + '\'' +
				'}';
	}
}
