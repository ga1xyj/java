package enumeration;

import java.util.Calendar;

public class MainTest {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
		case 6:
			today = Week.SATURDAY;
		}
		System.out.println("오늘 요일:"+today);
	}

}
