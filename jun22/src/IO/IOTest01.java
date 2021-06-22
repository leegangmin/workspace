package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//IO
/*
 * 외부연결, 어떤 통로?, 어떻게 주고 받는지?, null, Stream
 * 
 */
public class IOTest01 {

	public static void main(String[] args) {
		//바이트 배열을 만들고 거기 값을 읽어오기
		byte[] input = {1, 3, 5, 7, 9, 12,-1, 15, 18, 21, 90};
		byte[] output = null;
		
		//인풋 통로 생성
		ByteArrayInputStream bais = null;
		bais = new ByteArrayInputStream(input);
		
		//아웃풋 통로
		ByteArrayOutputStream baos = null;
		baos = new ByteArrayOutputStream();
		
		//읽거나 쓰는 바이트를 담을 변수
		int data = 0;
		//읽은 데이터를 검사해서 -1이면 read()중지하기
		//-1은 더이상 읽을 값이 없다는 반환값.
		//스트림에서 하나의 바이트를 읽는 대표적 메소드 read()
		//read() : 읽은 바이트의 값을 정수(int)로 리턴함.
		
		while (true) {
			data = bais.read();//읽어오기
			if (data == -1) {
				break;
			}
			baos.write(data);//옮긴 결과는 여기에
		}

		output = baos.toByteArray();
		
		//출력
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		
		
		
		
		
		
		
	}

}
