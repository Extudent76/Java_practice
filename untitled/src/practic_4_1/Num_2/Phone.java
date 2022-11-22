package practic_4_1.Num_2;

public class Phone {
	private final int number;
	private final String model;
	private double weight;

	Phone(int number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	Phone(int number, String model) {
		this.number = number;
		this.model = model;
	}

	Phone() {
		this.number = 666;
		this.model = "xiaomi";
		this.weight = 11.4;
	}

	public void receiveCall(String name) {
		System.out.println("звонит " + name);
	}

	public void receiveCall(String name, int number) {
		System.out.println("звонит " + name + "с номера " + number);
	}

	public int getNumber() {
		return number;
	}

	public void sendMessage(int... numbers) {
		for (int number : numbers) {
			System.out.println("Сообщение отправлено на номер " + number);
		}
	}

	@Override
	public String toString() {
		return "Phone{" +
				"number=" + number +
				", model='" + model + '\'' +
				", weight=" + weight +
				'}';
	}
}
