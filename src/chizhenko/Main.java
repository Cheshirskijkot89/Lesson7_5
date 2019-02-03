package chizhenko;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");

	public static void main(String[] args) {

		String text;
		System.out.println("¬ведите дату в формиате dd:MM:yyyy");

		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();
		sc.close();

		Calendar clRandom = new GregorianCalendar();
		Calendar clNow = new GregorianCalendar();
		clRandom = convertFromDMY(text);
		// clNow = convertFromDMY(text);
		// System.out.println(cl.toString());

		int yearRandom = clRandom.get(Calendar.YEAR);
		int yearNow = clNow.get(Calendar.YEAR);

		int monthRandom = clRandom.get(Calendar.MONTH);
		int monthNow = clNow.get(Calendar.MONTH);

		int dayRandom = clRandom.get(Calendar.DAY_OF_MONTH);
		int dayNow = clNow.get(Calendar.DAY_OF_MONTH);

		if (yearNow != yearRandom) {
			System.out.println("√ода отличаютсь€: сейчас " + yearNow + ", а указано " + yearRandom);
		}
		
		if (monthRandom != monthNow) {
			System.out.println("ћес€ца отличаютсь€: сейчас " + Month.of(clNow.get(Calendar.MONTH)) + ", а указано " + Month.of(clRandom.get(Calendar.MONTH)));
		}
		
		if (dayRandom != dayNow) {
			System.out.println("ƒни отличаютсь€: сейчас " + dayNow + ", а указано " + dayRandom);
		}

//		sdf.setCalendar(clRandom);
//		String dateFormattedRandom = sdf.format(clRandom.getTime());
//		System.out.println(dateFormattedRandom);
//
//		sdf.setCalendar(clNow);
//		String dateFormattedNow = sdf.format(clNow.getTime());
//		System.out.println(dateFormattedNow);

	}

	public static GregorianCalendar convertFromDMY(String dd_mm_yy) {

		String[] splitDate = dd_mm_yy.split(":");
		int day = Integer.parseInt(splitDate[0]);
		int month = Integer.parseInt(splitDate[1]) - 1;
		int year = Integer.parseInt(splitDate[2]);

		GregorianCalendar dataConverted = new GregorianCalendar(year, month, day);

		return dataConverted;
	}

}
