package practic_30.Model.Menu;

public class Dish extends MenuItem implements Item{
	public Dish(double price, String name, String description) {
		super(name, price, description);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
