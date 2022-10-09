package practic_3;
import java.text.NumberFormat;
import java.util.Locale;
public class Converter_2 {
	private static final double rubToDol = 61.2;
	private static final double rubToEur = 59.9;
	private static final double rubToGbp = 68.8;

	public String ConvertToDol(double value) {
		return convertToLocale(value / rubToDol, Locale.US);
	}

	public String ConvertToEur(double value) {
		return convertToLocale(value / rubToEur, Locale.FRANCE);
	}

	public String ConvertToGbp(double value) {
		return convertToLocale(value / rubToGbp, Locale.UK);
	}

	public String convertToLocale(double value, Locale locale) {
		return NumberFormat.getCurrencyInstance(locale).format(value);
	}
}
