package Practic_4.Num_2;

public class Tie extends Clothes implements MenClothing{
	public Tie(Size size, double cost, String color) {
		super(size, cost, color);
	}
	@Override
	public void dressMan(Clothes[] clothes) {
		System.out.println("Одеть мужчину");
	}
}
