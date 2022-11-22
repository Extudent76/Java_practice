package practic_4_1.Num_5;

import static java.lang.Math.PI;

public class Circle extends Shape{
	protected double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * this.radius * PI;
	}

	@Override
	public double getArea() {
		return this.radius * this.radius * PI;
	}

	@Override
	public String toString() {
		return super.toString() +  getClass().getSimpleName() + "{" + " radius " + radius +
				", area=" + getArea() +
				", perimeter=" + getPerimeter() +
				'}';
	}
}

