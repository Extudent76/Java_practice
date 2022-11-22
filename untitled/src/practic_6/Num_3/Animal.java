package practic_6.Num_3;

public class Animal implements Nameable{
	String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
