package may18;
//char 문자형
//문자 하나를 저장
/* 반드시 값으로는 문자 하나가 와야 함
 * 하나 이상일 경우에는 String에 저장
 * 정수형 타입 0~65,535 = 2byte
 * 
 * 문자형을 저장할 때는?
 * 반드시 홀따옴표
 * 
 * 정수형이기 때문에 int에 프로모션 가능
 * 반대로 int값 또한 문자로 바뀔 수 있음
 */
public class DataType3 {

	public static void main(String[] args) {
		//문자형 초기화 하기
		//데이터타입 변수명 = '값';
		
		char char1 = 'A';
		char char2 = '가';
		char char3 = '家';
		char1 = 100;
		char2 = '\u0392';//유니코드
		//아스키코드, 유니코드 ---- utf-8, euc-kr, ms949
		
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		System.out.println((char) 76);
		
		//for (int i =1; i < 128; i++) {//i는 정수
		//	System.out.print(i	 + " : " + (char) i + "\n");
		//}
		
		
		String str = "가나다";//문자열 = 스트링
		str = ""+ char1 + char2 + char3;
		System.out.println(str);
	
		
		int iNum = char1;
		System.out.println(iNum);
		
		char3 = 63759;
		System.out.println(char3);
		
		///////////////////////논리형
		// boolean 참, 거짓
		
		boolean check = true;
		
		System.out.println(check);
		
		System.out.println('A'=='a');
	
		iNum = 10;
		int iNum2 = 10;
		
		
		System.out.println(iNum == iNum2);
	
		check = iNum == iNum2 + 1;//! = not
		
		System.out.println("결과는 : " + check);
		//참 거짓 저장하는 타입
		//off on
		
		/* P타입
		 * 정수형
		 *  byte
		 *  short
		 *  int
		 *  long
		 * 실수형
		 *  float
		 *  double
		 * 문자형
		 *  char
		 * 논리형
		 *  boolean
		 */
		
		int code = 1;
		int result = code % 2;//모듈러 = 나머지 값
		check = result == 0;
		
		if(check) {//만약에 check가 참이라면
			System.out.println("당신은 여자");
		} else {
			System.out.println("당신은 남자");
		}
		
	}

}
