package practic_4_1.Num_1;

public class rectangle extends shape{
	private final double width;
	private final double height;

	public rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.Type = "Прямоугольник";
	}
	@Override
	public void getArea() {
		this.Area = height * width;
	}

	@Override
	public void getPerimeter() {
		this.Perimeter = height * 2 + width * 2;
	}
}
