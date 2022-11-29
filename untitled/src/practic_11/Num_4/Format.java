package practic_11.Num_4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Format {
	public static void main(String[] args) {
		System.out.println("Введите дату");
		Scanner scanner = new Scanner(System.in);
		DateFormat formatter = new SimpleDateFormat("hh:mm dd/MM/yy");
		Date date;
		Calendar calendar = Calendar.getInstance();
		String input = scanner.nextLine();
		try {
			date = formatter.parse(input);
			calendar.setTime(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		System.out.println(calendar.getTime());
		System.out.println(date);
	}
}
