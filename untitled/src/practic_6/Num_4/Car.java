package practic_6.Num_4;

public class Car implements Priceable{

	private double price;

	public Car(double price) {
		this.price= price;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
