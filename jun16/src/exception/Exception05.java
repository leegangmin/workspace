package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exception05 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		try {//                  있는 파일로 선택해주세요.
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
		//이렇게 수정하겠습니다.
		} catch (Exception e) {
			System.out.print("파일을 찾을 수 없습니다.");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		System.out.println("끝");
	}
}
