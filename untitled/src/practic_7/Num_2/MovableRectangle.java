package practic_7.Num_2;

public class MovableRectangle implements Movable{
	private final MovablePoint topLeft;
	private final MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public void moveUp() {
		this.topLeft.moveUp();
		this.bottomRight.moveUp();
	}

	@Override
	public void moveDown() {
		this.topLeft.moveDown();
		this.bottomRight.moveDown();
	}

	@Override
	public void moveLeft() {
		this.topLeft.moveLeft();
		this.bottomRight.moveLeft();
	}

	@Override
	public void moveRight() {
		this.topLeft.moveRight();
		this.bottomRight.moveRight();
	}

	@Override
	public String toString() {
		return "MovableRectangle{" +
				"a=" + topLeft +
				", b=" + bottomRight +
				'}';
	}
}
