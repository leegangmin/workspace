package may21;

public class For03 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) { //3%5=3(������ ���� �������� ������ ũ�� �״�� ��ȯ)
				continue;

			}
			System.out.println("2 X " + i + " = " + (2 * i));
			// System.out.printf("2 X %d = %d\n", i, 2 * i);
			
		}
		// continue = ���� ���౸���� �����ϰ� �ٽ� �ݺ������� ����
		// break = ���� ����� ���ǹ��� Ż��
	}

}
