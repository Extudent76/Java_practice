package Practic_4.Num_3;

abstract class Sneakers {
	private final Size size;
	private final double cost;
	private final String color;

	private final String name;

	public Sneakers( String name,double cost,String color , Size size ) {
		this.size = size;
		this.cost = cost;
		this.color = color;
		this.name = name;
	}
	@Override
	public String toString() {
		return  name + " Размер - " + size + ", Цена - " + cost + ", Цвет - " + color + '\'' + '}';
	}
}
