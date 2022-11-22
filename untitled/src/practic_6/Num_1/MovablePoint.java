package practic_6.Num_1;

public class MovablePoint implements Movable{
	private final int xSpeed;
	private final int ySpeed;
	private int x;
	private int y;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.x = x;
		this.y = y;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	@Override
	public void moveUp() {
		x += xSpeed;
	}

	@Override
	public void moveDown() {
		x -= xSpeed;
	}

	@Override
	public void moveLeft() {
		y -= ySpeed;
	}

	@Override
	public void moveRight() {
		y += ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint{" +
				"xSpeed=" + xSpeed +
				", ySpeed=" + ySpeed +
				", x=" + x +
				", y=" + y +
				'}';
	}
}
