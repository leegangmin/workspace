package may31;

import java.time.Year;
import java.util.Calendar;

public class DateFormat02 {

	public static void main(String[] args) {

		// 아래와 같이 출력하는 프로그램
		// 2021년 5월 31일 월요일 오전 10시 30분 59초입니다.

		Calendar cal = Calendar.getInstance();//이미 생성된 객체 (객체 생성시 new + 생성자();)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		String day_c = new String();

		switch (day) {
		case 1:
			day_c = "일";
			break;
		case 2:
			day_c = "월";
			break;
		case 3:
			day_c = "화";
			break;
		case 4:
			day_c = "수";
			break;
		case 5:
			day_c = "목";
			break;
		case 6:
			day_c = "금";
			break;
		case 7:
			day_c = "토";
			break;

		default:
			break;
		}

		String ampm_c = ampm == 0? "오전" : "오후";//삼항연산자 condition operator

		System.out.println(year + "년 " + month + "월 " + date + "일 "
				+ day_c + "요일 " + ampm_c + " "
				+ hour + "시 " + min + "분 " + sec + "초 ");
	}

}
