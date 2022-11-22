package practic_4_1.Num_5;

public class Square extends Shape{
	protected double side;

	public Square(){};
	public Square(double side){
		this.side = side;
	}
	public Square(double side, String color, boolean filled){
		super(color,filled);
		this.side = side;
	}

	@Override
	public double getPerimeter() {
		return this.side*4;
	}

	@Override
	public double getArea() {
		return this.side*this.side;
	}

	@Override
	public String toString() {
		return super.toString()+
				getClass().getSimpleName() + "{" +
				", area=" + getArea() +
				", perimeter=" + getPerimeter() +
				'}';
	}
}

