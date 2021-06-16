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
				new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat("DD�� W K HH�� S");
		System.out.println(sdf.format(now));//2021�� 05�� 31�� 10�� 45�� 38��
		System.out.println(sdf1.format(now));
		
		String str = sdf.format(now).toString();//toString���� ���� ó��
		System.out.println(str);//2021�� 05�� 31�� 10�� 48�� 31��

		
		

	}

}
