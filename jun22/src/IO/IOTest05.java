package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


//���� �а� ����
public class IOTest05 {

	public static void main(String[] args) {
		//���� ��θ� �ְ� �ش� ������ �о���� ���Ϸ� ����ϱ�
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\temp\\ddd.txt");
			fos = new FileOutputStream("C:\\temp\\out.txt");
			
			int data = 0;
			byte[] temp = new byte[5];
			
			while ((data = fis.read(temp)) != -1) {
				fos.write(temp, 0, data);
				//System.out.println(Arrays.toString(temp));
				//for (byte b : temp) {
				//	System.out.print((char) b);
				//}
			}
			/*	byte[5]�迭�� �����ϰ� ������ �а�
			 * 	temp���� �״�� out.txt�� ������.
			 */
			System.out.println("���� ���� �Ϸ�");
		
			while ((data = fis.read(temp)) != -1) {
				char c = (char) data;
				fos.write(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
