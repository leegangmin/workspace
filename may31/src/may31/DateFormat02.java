package may31;

import java.time.Year;
import java.util.Calendar;

public class DateFormat02 {

	public static void main(String[] args) {

		// �Ʒ��� ���� ����ϴ� ���α׷�
		// 2021�� 5�� 31�� ������ ���� 10�� 30�� 59���Դϴ�.

		Calendar cal = Calendar.getInstance();//�̹� ������ ��ü (��ü ������ new + ������();)
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
			day_c = "��";
			break;
		case 2:
			day_c = "��";
			break;
		case 3:
			day_c = "ȭ";
			break;
		case 4:
			day_c = "��";
			break;
		case 5:
			day_c = "��";
			break;
		case 6:
			day_c = "��";
			break;
		case 7:
			day_c = "��";
			break;

		default:
			break;
		}

		String ampm_c = ampm == 0? "����" : "����";//���׿����� condition operator

		System.out.println(year + "�� " + month + "�� " + date + "�� "
				+ day_c + "���� " + ampm_c + " "
				+ hour + "�� " + min + "�� " + sec + "�� ");
	}

}
