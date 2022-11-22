package practic_7.Num_2;

public class main {
	public static void main(String[] args) {
		Movable Rectangle = new MovableRectangle(4, 3, 5, 6, 11, 15);
		Rectangle.moveRight();
		Rectangle.moveRight();
		Rectangle.moveLeft();
		Rectangle.moveDown();
		System.out.println(Rectangle);
	}
}
