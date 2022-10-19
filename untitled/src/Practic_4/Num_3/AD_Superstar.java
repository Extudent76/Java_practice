package Practic_4.Num_3;
public class AD_Superstar extends Sneakers implements Adidas {
	AD_Superstar(String name, double cost, String color, Size size) {
		super(name, cost, color, size);
	}
	@Override
	public void Adidas (Sneakers[] sneakers) {
		System.out.println("Кроссовки Adidas");
	}
}
