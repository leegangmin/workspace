package jun04;

import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {

		/*
		 * String email = "gangminlee@kakao.com";
		 * 
		 * String id = email.substring(0, email.indexOf('@')); String domain =
		 * email.substring(email.indexOf('@')+1, email.length());
		 * 
		 * System.out.println(id + "@" + domain);
		 */

		// ����ڰ� ���� �ּҸ� �Է��ϱ�

		// ��¥ ���� �ּҰ� �´��� �˻��ϱ� = @, .com, .co.kr, .net, .org

		// �Է¹��� email���� @ �������� �и���.
		// @�� ���� id��� ������ ���.
		// @�� ���� server ��� ������ ���.
		// @�� ���� email�̶�� "�̸����� �Է���"

		// �ùٸ� �̸����� ��� �и��� id�� �Ʒ��� ���� ���ǿ� ���յǰ� �����.

		/*
		 * 1. id�� ���̴� 5~10�� �̾�� �Ѵ�. 2. ù ���ڴ� �ݵ�� ���� �빮���̾�� �Ѵ�. 3. ������ ���ڴ� �����ڿ� ���ڷθ�
		 * �����Ǿ�� �Ѵ�. 4. ��� ���ǿ� ������ "�ùٸ� ID"��� ���. 5. �� ���ǿ� ���� �ʴ´ٸ� Ʋ�� ������ ��� ��Ű�� ���α׷�
		 * ����.
		 */

		Scanner sc = new Scanner(System.in);

		String email = "";

		for (int i = 1; i <= 5; i++) {

			do {

				System.out.println("�̸��� �ּҸ� �Է���");
				email = sc.next();

				String id = email.substring(0, email.indexOf('@'));
				String server = email.substring(email.indexOf('@') + 1, email.length());

				if (email.contains("@")) {
					if (server.contains(".com")
							|| server.contains(".co.")
							|| server.contains(".net")
							|| server.contains(".org")) {
						if (id.length() <= 10 && id.length() >= 5) {
					}
					System.out.println("����");
				}
			} while (i == 5);
				if (i == 5) {
					System.out.println("5ȸ �õ� �ʰ�");
					break;
				}
			System.out.println("����");
			break;
			
			for (int j = 0; j < args.length; j++) {
				
				
			}
			if (id.length() >= 5 && id.length() <= 10) {
				if(Character.isUpperCase(id.charAt(0)) {
					for (int j = 0; j < args.length; j++) {
						char m = id.charAt(j);
						if (Character.isUpperCase(m)||Character.isLowerCase(m)||Character.isDigit(m))  {
							
						}
					}
				}
				
			}
			
			
			

		}
}
	}
}

