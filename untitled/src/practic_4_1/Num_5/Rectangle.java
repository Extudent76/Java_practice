package practic_4_1.Num_5;

public class Rectangle extends Shape{
	protected double width;
	protected double length;

	public Rectangle(double width, double length,String color,boolean filled){
		super(color,filled);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getPerimeter() {
		return (this.width+this.length)*2;
	}

	@Override
	public double getArea() {
		return this.width*this.length;
	}

	@Override
	public String toString() {
		return super.toString() +
				getClass().getSimpleName() + "{" +
				", area=" + getArea() +
				", perimeter=" + getPerimeter() +
				'}';
	}
}

