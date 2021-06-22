package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


//파일 읽고 쓰기
public class IOTest05 {

	public static void main(String[] args) {
		//파일 경로를 주고 해당 파일을 읽어오고 파일로 출력하기
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
			/*	byte[5]배열을 생성하고 파일을 읽고
			 * 	temp값을 그대로 out.txt에 저장함.
			 */
			System.out.println("파일 저장 완료");
		
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
