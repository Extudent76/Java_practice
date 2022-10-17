package Practic_4.Num_2;

abstract class Clothes {
	private final Size size;
	private final double cost;
	private final String color;

	public Clothes(Size size, double cost, String color) {
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" + "size=" + size + ", cost=" + cost + ", color='" + color + '\'' + '}';
	}
}
