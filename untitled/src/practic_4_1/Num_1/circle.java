package practic_4_1.Num_1;

public class circle extends shape{
	private final double radius;

	public circle(double radius) {
		this.radius = radius;
		this.Type = "окружность";
	}
	@Override
	public void getArea() {
		this.Area = Math.PI * radius * radius;
	}

	@Override
	public void getPerimeter() {
		this.Perimeter = 2 * Math.PI * radius;
	}
}
