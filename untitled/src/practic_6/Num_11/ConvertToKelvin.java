package practic_6.Num_11;

public class ConvertToKelvin implements Convertable{
	@Override
	public void convert(double value) {
		System.out.printf("Температура в Кельвинах %.2fK\n", value + 273.15);
	}
}
