package may31;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat03 {

	public static void main(String[] args) {
		//Date
		Date now = new Date();
		System.out.println(now); //Mon May 31 10:41:10 KST 2021

		//now.getMonth();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat("DD일 W K HH시 S");
		System.out.println(sdf.format(now));//2021년 05월 31일 10시 45분 38초
		System.out.println(sdf1.format(now));
		
		String str = sdf.format(now).toString();//toString으로 문자 처리
		System.out.println(str);//2021년 05월 31일 10시 48분 31초

		
		

	}

}
