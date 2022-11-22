package practic_6.Num_4;

public class Phone implements Priceable{
	double price;
	public Phone(double price) {
		this.price = price;
	}
	@Override
	public double getPrice() {
		return price;
	}
}
