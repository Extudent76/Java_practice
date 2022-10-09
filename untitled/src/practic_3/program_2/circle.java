package practic_3.program_2;
public class circle {
	private point point;
	private double l;
	private  double r;

	public circle( int x, int y) {
		this.point = new point(x,y);
		this.r = Math.random() * 10;
		setL(this.r);
	}
	public circle() {
		point = new point(0, 0);
		this.r = Math.random() * 10;
		setL(this.r);
	}
	public double getR() {
		return r;
	}

	private void setR(double r) {
		this.r = r;
	}
	public double getL() {
		return l;
	}
	private void setL(double r) {
		this.l = 2 * Math.PI * r;
	}
	@Override
	public String toString() {
		return "Circle {Center x: " + point.getX() + ", y: " + point.getY() + ", r: " + getR() + ", l: " + getL() + "}";
	}
}
