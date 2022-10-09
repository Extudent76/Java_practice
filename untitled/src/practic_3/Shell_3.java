package practic_3;
import java.util.Scanner;
public class Shell_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double value = 21122.645454;
		byte m1 = value.byteValue();
		short m2 = value.shortValue();
		int m3 = value.intValue();
		long m4 = value.longValue();
		float m5 = value.floatValue();
		boolean m6 = Boolean.parseBoolean(value.toString());
		char m7 = (char) (value.intValue());
		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5 + " " + m6 + " " +m7);
	}
}
