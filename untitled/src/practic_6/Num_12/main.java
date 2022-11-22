package practic_6.Num_12;

public class main {
	public static void main(String[] args) {
		StringBuilder2 stringBuilder = new StringBuilder2();
		stringBuilder.append("123456");
		stringBuilder.delete(3,5);
		System.out.println(stringBuilder);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		stringBuilder.append("ABC");
		System.out.println(stringBuilder);
		stringBuilder.undo();
		System.out.println(stringBuilder);
	}

}
