package Practic_4.Num_2;

public class Skirt extends Clothes implements  WomenClothing {


	public Skirt(Size size, double cost, String color) {
		super(size, cost, color);
	}
	@Override
	public void dressWomen(Clothes[] clothes) {
		System.out.println("Одеть женщину");
	}
}
