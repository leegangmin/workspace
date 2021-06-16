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

		// �Ķ��� ������ �۾� : static �������
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);// ���ۿ� : 0
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 1~7 �Ͽ��Ϻ��� ����

		// ���� : �� ���� get()�� ������ (return) ������ Ÿ����? int

		// ���� ����
		System.out.println(cal.get(Calendar.AM_PM));
		// 24�ð�
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		// �̴��� ������ ��?
		System.out.println(cal.get(Calendar.DATE));

		// �̴��� ���° ����?
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		Date date2 = cal.getTime();
		System.out.println(date2);

		long longTime = cal.getTimeInMillis();
		System.out.println(longTime);

		// ����⵵�� �Է��ϼ���.
		// ����� **�� �Դϴ�.
		// ��ĳ��, ������ ����, ���
		// Calendar ��ü �����ϱ�
		Calendar cal2 = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("��� �⵵�� �Է����ּ���.");
		int input = sc.nextInt();

		int result = cal2.get(Calendar.YEAR) - input;

		System.out.println("����� ���̴� " + result);

		sc.close();
	}

}
