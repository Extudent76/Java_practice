package practic_2;

public class Circle1 {
	private double r;

	public Circle1() {}
	public double getR() {return r;}
	public void setR(double r) {this.r = r;}

	public double getLength(double r){
		double c;
		c = 2*Math.PI*r;
		return c;
	}
	public double getArea(double r){
		double c;
		c = Math.PI*(r*r);
		return c;
	}
	public void Comparison(double S1,double S2,double l1,double l2){
		 if (S1 > S2) System.out.println("Площадь первого круга больше площади второго круга");
		 else if (S1 <  S2) System.out.println("Площадь второго круга больше площади первого круга");
		 else System.out.println("Площади равны");

		if (l1 > l2) System.out.println("Длинна окружности первого круга больше Длинны окружности второго круга");
		else if (l1 <  l2) System.out.println("Длинна окружности второго круга больше Длинны окружности первого круга");
		else System.out.println("Длинны окружности равны");
	}
}

