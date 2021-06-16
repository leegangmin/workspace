package may31;

import java.util.Date;

public class DateFormat05 {

	public static void main(String[] args) {

		long millis = System.currentTimeMillis();
		System.out.println(millis);

		// 1970년부터 지금까지 흐른 ms시간
		// 1000 * 60 * 60 * 24

		// 다시 date
		Date date = new Date(127, 5, 1);// 연도1900+ 월1+ 일0+
		System.out.println(date);
		// 4월 29일 2030년
		Date date1 = new Date(130, 3, 29);// 연도 월 일
		System.out.println(date1);

		System.out.println(date.getTime());

		// 이번 크리스마스까지 며칠 남았나요?
		date = new Date();
		System.out.println(date);

		Date xMas = new Date(121, 11, 25);

		long howLong = xMas.getTime() - date.getTime();
		System.out.println(howLong);

		long result = howLong / (1000 * 60 * 60 * 24);
		System.out.println("올 크리스마스까지 " + result);

		// 크리스마스 요일
		int day = xMas.getDay();
		System.out.println(day);

		switch (day) {
		case 0:
			System.out.println("일");
			break;
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;

		default:
			break;
		}

		long millis2 = System.currentTimeMillis();
  
		System.out.println("소요시간 : " + (millis2 - millis));

	}

}
