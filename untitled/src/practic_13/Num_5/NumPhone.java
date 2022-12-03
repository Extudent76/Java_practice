package practic_13.Num_5;

public class NumPhone {
	String formatNumber;


	public NumPhone(String number) {
		this.formatNumber = "%s-%s-%s".formatted(number.substring(0, number.length() - 7),
				number.substring(number.length() - 7, number.length() - 4),
				number.substring(number.length() - 4));
		if (number.charAt(0) != '+') this.formatNumber = "+" + formatNumber;

	}

	@Override
	public String toString() {
		return "NumPhone{" +
				"formatNumber='" + formatNumber + '\'' +
				'}';
	}
}
