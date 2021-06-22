package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//정리
public class IOTest06 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\temp\\fos.txt");
			for (int i = 0; i < 10; i++) {
				String data = i + " 번째 줄 입력 \r\n"; //줄바꿈 // \t이런거랑 구분하기 위해 \\두개 ㄱ
				fos.write(data.getBytes());//바이트로 파일에 직접쓰기
				
			}
			System.out.println("Has been saved.");
			/* FileOutStream에 값을 쓸 때는 byte로 변환함.
			 * getByte()를 이용했음.
			 * FileWriter는 String을 직접 씀.
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
					/* close
					 * 열린 파일 객체를 닫아주는 메소드
					 * 자바가 종료될 때 열린 파일의 경우 자동으로 닫아줌.
					 * 하지만 직접 닫아주는 것이 좋음.
					 * 열었던 파일을 닫지 않고 다시 사용하려고 하면
					 * 에러가 나는 경우가 있음.
					 */
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
