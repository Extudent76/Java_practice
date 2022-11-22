package practic_6.Num_2;

public class MovableRectangle implements Movable{
	private final MovablePoint topLeft;
	private final MovablePoint topRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	private boolean check() {
		return topLeft.getxSpeed() == topRight.getxSpeed() || topLeft.getySpeed() == topRight.getySpeed();
	}
	@Override
	public void moveUp() {
		if (check()){
			this.topLeft.moveUp();
			this.topRight.moveUp();
		}
			return;

	}

	@Override
	public void moveDown() {
		if (check()){
			this.topLeft.moveDown();
			this.topRight.moveDown();
		}
			return;

	}

	@Override
	public void moveLeft() {
		if (check()){
			this.topLeft.moveLeft();
			this.topRight.moveLeft();
		}
			return;

	}

	@Override
	public void moveRight() {
		if (check()){
			this.topLeft.moveRight();
			this.topRight.moveRight();
		}
			return;

	}
	@Override
	public String toString() {
		return "MovableRectangle{" +
				"a=" + topLeft +
				", b=" + topRight +
				'}';
	}
}
