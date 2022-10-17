package Practic_4.Num_2;
public class Tshirt extends Clothes implements MenClothing, WomenClothing {
	public Tshirt( Size size, double cost, String color) {
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
