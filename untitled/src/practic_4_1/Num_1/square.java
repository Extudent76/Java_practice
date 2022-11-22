package practic_4_1.Num_1;

public class square extends shape{
	private final double side;

	public square(double side) {
		this.side = side;
		this.Type = "Квадрат";
	}
	@Override
	public void getArea() {
		this.Area = side * side;
	}

	@Override
	public void getPerimeter() {
		this.Perimeter = side * 4.;
	}
}
