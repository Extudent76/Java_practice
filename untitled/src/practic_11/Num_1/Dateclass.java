package practic_11.Num_1;

import java.util.Calendar;
import java.util.Date;
public class Dateclass {
	private final String name;

	public String getName() {
		return name;
	}

	public Dateclass()
	{
		this.name = "Alex";
	}

	public static void display( int month, int day, int hour, int minute) {

		Dateclass test = new Dateclass();
			Calendar startCal = Calendar.getInstance();
			startCal.set(Calendar.MONTH, month);
			startCal.set(Calendar.DAY_OF_MONTH, day);
			startCal.set(Calendar.HOUR_OF_DAY, hour);
			startCal.set(Calendar.MINUTE, minute);


			System.out.println( "\n\nРазработчик: " +
					"\nИмя   - " + test.getName() );
			Date startDate = startCal.getTime();
			System.out.println( "\nДата и время получения задания" + startDate);
			Date currentTime = new Date();
			System.out.println( "\nДата и время сдачи задания" + currentTime);

	}
	}


