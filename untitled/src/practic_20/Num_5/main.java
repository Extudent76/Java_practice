package practic_20.Num_5;

public class main {
	public static void main(String[] args) {
		Matrix<Integer> integerMatrix = new Matrix<>();
		integerMatrix.setMatrix(new Integer[][]{{1, 2}, {3, 4}});
		integerMatrix.printMatrix();
		integerMatrix.transparentMatrix();
		integerMatrix.printMatrix();
	}
}
