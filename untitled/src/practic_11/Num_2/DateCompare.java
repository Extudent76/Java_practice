package practic_11.Num_2;

import practic_11.Num_1.Dateclass;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
	public static void main(String[] args) {
		System.out.println("Введите месяц, день, час,минуту");
		Scanner scan = new Scanner(System.in);
		Dateclass test = new Dateclass();

		Calendar startCal = Calendar.getInstance();
		startCal.set(Calendar.MONTH, scan.nextInt());
		startCal.set(Calendar.DAY_OF_MONTH, scan.nextInt());
		startCal.set(Calendar.HOUR_OF_DAY, scan.nextInt());
		startCal.set(Calendar.MINUTE, scan.nextInt());

		Date startDate = startCal.getTime();
		Date currDate = new Date();
		System.out.println("Ваше время:" + startCal);
		System.out.println("Текущее время:" + currDate);
		if (currDate.before(startDate))
			System.out.println("Текущее время <= Ваше время");
		else
			System.out.println("Текущее время > Ваше врем");

	}
}
