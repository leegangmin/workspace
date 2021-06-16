package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exception05 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		try {//                  �ִ� ���Ϸ� �������ּ���.
			fr = new FileReader("c:/temp/ddd.txt");
			
			int data;
			
			while (true) {
				data = fr.read();
				if(data == -1) {
					break;
				} else {
					System.out.print((char)data);
				}
			}
		//�̷��� �����ϰڽ��ϴ�.
		} catch (Exception e) {
			System.out.print("������ ã�� �� �����ϴ�.");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		System.out.println("��");
	}
}
