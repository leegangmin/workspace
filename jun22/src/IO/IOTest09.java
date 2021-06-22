package IO;

import java.io.FileWriter;

//파일 이어쓰기
public class IOTest09 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\temp\\write.txt");

			for (int i = 0; i < 10; i++) {
				String data = i + "번째 줄\r\n";
				fw.write(data);

			}

			fw.close();

			// 이어쓰기
			FileWriter fw2 = new FileWriter("C:\\temp\\write.txt", true);

			for (int i = 0; i < 10; i++) {
				String data = i + "번째 줄\r\n";
				fw2.write(data);

			}
			fw2.close();
			
			System.out.println("이어쓰기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
