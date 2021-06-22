package IO;

import java.io.BufferedReader;
import java.io.FileReader;

//file 읽어오기
public class IOTest04 {

	public static void main(String[] args) {
		//FileReader
		FileReader fr = null;//파일 읽어오는 변수
		BufferedReader br = null;//불러온 파일을 보여주는 변수

		try {
			fr = new FileReader("C:\\temp\\ddd.txt");
			String line = null;
			//문자열을 이어서 한 객체에 넣어두고 출력하기
			//위해서 스트링 버퍼를 사용함.
			StringBuffer sb = new StringBuffer();
			//라인에다가 br.의 한 줄을 읽어서 저장함.
			//더 이상 저장할 것이 없으면 반복문 멈추게 하겠음.
			br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
