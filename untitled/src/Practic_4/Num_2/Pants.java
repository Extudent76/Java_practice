package Practic_4.Num_2;

public class Pants extends Clothes implements MenClothing, WomenClothing {

	public Pants(Size size, double cost, String color) {
		super(size, cost, color);
	}

	@Override
	public void dressMan(Clothes[] clothes) {
		System.out.println("Одеть мужчину");
	}

	@Override
	public void dressWomen(Clothes[] clothes) {
		System.out.println("Одеть женщину");
	}
}
