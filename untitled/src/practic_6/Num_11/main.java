package practic_6.Num_11;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение в Градусах по цельсию (℃)");
		double value = scan.nextDouble();
		Convertable converter = new ConvertToFahrenheit();
		converter.convert(value);
		converter = new ConvertToKelvin();
		converter.convert(value);
	}
}
