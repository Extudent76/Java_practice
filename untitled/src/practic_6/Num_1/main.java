package practic_6.Num_1;

public class main {
	public static void main(String[] args) {
		Movable a = new MovablePoint(4, 3, 5, 6);
		a.moveRight();
		a.moveUp();
		System.out.println(a);
		a = new MovableCircle(1, 2, 15, 15, 6);
		a.moveRight();
		a.moveRight();
		a.moveLeft();
		a.moveDown();
		System.out.println(a);
	}

}
