package IO;

import java.io.FileWriter;

//���� �̾��
public class IOTest09 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\temp\\write.txt");

			for (int i = 0; i < 10; i++) {
				String data = i + "��° ��\r\n";
				fw.write(data);

			}

			fw.close();

			// �̾��
			FileWriter fw2 = new FileWriter("C:\\temp\\write.txt", true);

			for (int i = 0; i < 10; i++) {
				String data = i + "��° ��\r\n";
				fw2.write(data);

			}
			fw2.close();
			
			System.out.println("�̾�� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
