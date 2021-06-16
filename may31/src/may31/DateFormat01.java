package may31;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormat01 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		// 파란색 기울어진 글씨 : static 멤버변수
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);// 시작월 : 0
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 1~7 일요일부터 시작

		// 문제 : 저 위에 get()로 나오는 (return) 데이터 타입은? int

		// 오전 오후
		System.out.println(cal.get(Calendar.AM_PM));
		// 24시간
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		// 이달의 마지막 날?
		System.out.println(cal.get(Calendar.DATE));

		// 이달의 몇번째 요일?
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		Date date2 = cal.getTime();
		System.out.println(date2);

		long longTime = cal.getTimeInMillis();
		System.out.println(longTime);

		// 출생년도를 입력하세요.
		// 당신은 **살 입니다.
		// 스캐너, 변수에 저장, 출력
		// Calendar 객체 생성하기
		Calendar cal2 = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("출생 년도를 입력해주세요.");
		int input = sc.nextInt();

		int result = cal2.get(Calendar.YEAR) - input;

		System.out.println("당신의 나이는 " + result);

		sc.close();
	}

}
