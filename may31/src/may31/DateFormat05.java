package may31;

import java.util.Date;

public class DateFormat05 {

	public static void main(String[] args) {

		long millis = System.currentTimeMillis();
		System.out.println(millis);

		// 1970����� ���ݱ��� �帥 ms�ð�
		// 1000 * 60 * 60 * 24

		// �ٽ� date
		Date date = new Date(127, 5, 1);// ����1900+ ��1+ ��0+
		System.out.println(date);
		// 4�� 29�� 2030��
		Date date1 = new Date(130, 3, 29);// ���� �� ��
		System.out.println(date1);

		System.out.println(date.getTime());

		// �̹� ũ������������ ��ĥ ���ҳ���?
		date = new Date();
		System.out.println(date);

		Date xMas = new Date(121, 11, 25);

		long howLong = xMas.getTime() - date.getTime();
		System.out.println(howLong);

		long result = howLong / (1000 * 60 * 60 * 24);
		System.out.println("�� ũ������������ " + result);

		// ũ�������� ����
		int day = xMas.getDay();
		System.out.println(day);

		switch (day) {
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("ȭ");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;

		default:
			break;
		}

		long millis2 = System.currentTimeMillis();
  
		System.out.println("�ҿ�ð� : " + (millis2 - millis));

	}

}
