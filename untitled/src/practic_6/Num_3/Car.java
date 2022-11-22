package practic_6.Num_3;

public class Car implements  Nameable{
	private final String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
