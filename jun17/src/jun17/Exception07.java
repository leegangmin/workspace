package jun17;

import java.io.IOException;

//예외처리
/*
 * 프로그램이 끝까지 실행되도록 유도
 */
public class Exception07 {

	public static void main(String[] args) {
		
		int input = 0;
		
		try {
			System.in.read();
			//예외가 발생할 것 같은 문장
		} catch (IOException e) {
			e.printStackTrace();
			//혹, try안에서 문제가 발생하면 실행할 문장
		}
		
		System.out.println(input);

	}

}
