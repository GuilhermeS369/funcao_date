package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date x1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date x2 = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(x2);

		int minutes = 5 + cal.get(Calendar.MINUTE);
		int month = 3 + cal.get(Calendar.MONTH);
		System.out.println("minutes: " + minutes);
		System.out.println("month: " + month);

	}

}
