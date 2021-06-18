package jun17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//파일입출력
public class Exception08 {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일 만들기
		 * 	FileReader = 파일을 읽어서 자바로 가져오기
		 * 
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("/Users/gangmin/Downloads/mariadb.txt");
			int data;
			while (true) {
				data = fr.read();
				if(data == -1) {
					break;
				}
				System.out.println((char) data);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
