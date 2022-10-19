package Practic_4.Num_3;

public class NK_Air_Force extends Sneakers implements Nike{
	public NK_Air_Force(String name, double cost, String color, Size size) {
		super(name, cost, color, size);
	}
	@Override
	public void Nike (Sneakers[] sneakers) {
		System.out.println("Кроссовки Nike");
	}
}
