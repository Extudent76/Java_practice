package practic_6.Num_2;

public class main {
	public static void main(String[] args) {
		Movable a = new MovableRectangle(4, 3, 5, 6, 11, 15);
		a.moveRight();
		a.moveRight();
		a.moveLeft();
		a.moveDown();
		System.out.println(a);
	}
}
