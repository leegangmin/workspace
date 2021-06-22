package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//����
public class IOTest06 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\temp\\fos.txt");
			for (int i = 0; i < 10; i++) {
				String data = i + " ��° �� �Է� \r\n"; //�ٹٲ� // \t�̷��Ŷ� �����ϱ� ���� \\�ΰ� ��
				fos.write(data.getBytes());//����Ʈ�� ���Ͽ� ��������
				
			}
			System.out.println("Has been saved.");
			/* FileOutStream�� ���� �� ���� byte�� ��ȯ��.
			 * getByte()�� �̿�����.
			 * FileWriter�� String�� ���� ��.
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
					/* close
					 * ���� ���� ��ü�� �ݾ��ִ� �޼ҵ�
					 * �ڹٰ� ����� �� ���� ������ ��� �ڵ����� �ݾ���.
					 * ������ ���� �ݾ��ִ� ���� ����.
					 * ������ ������ ���� �ʰ� �ٽ� ����Ϸ��� �ϸ�
					 * ������ ���� ��찡 ����.
					 */
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
