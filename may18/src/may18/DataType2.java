package may18;
//실수
	//float
	//double(기본)
public class DataType2 {

	public static void main(String[] args) {
		//데이터타입 변수명 = 값;
		//3.14
		double pi = 3.14;
		System.out.println(pi);
		
		int intNum = (int) pi;
		System.out.println(intNum);
		
		long longNum = (long) pi;
		System.out.println(longNum);
		
		pi = longNum;
		System.out.println(pi);
		
		pi = (int) longNum;
		System.out.println(pi);
		
		pi = Long.MAX_VALUE;
		System.out.println(pi);
		
		//float
		float fNum = (float) 3.14;
		float fNum2 = 3.14F;
		System.out.println(fNum);
		System.out.println(fNum2);
		//float int
		fNum2 = intNum;
		intNum = (int) fNum;
		System.out.println(fNum);
		
		//float long
		longNum = (long) fNum;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		pi = Double.MAX_VALUE;
		longNum = (long) pi;
		
		System.out.println(longNum);
		
		/* 실수형
		 * float과 double이 있음
		 * double이 기본타입
		 * float에 값을 실수로 초기화 할 때는 표식자(f,F)를 넣어야 함
		 * (안 그럼 컴파일 에러)
		 * 이유는 실수 값 자체가 double 메모리로 만들어지기 대문에 float에 대입하는 것이 불가능
		 * 
		 *  주의2
		 *  같은 값이라도 실수는 정수보다 무조건 큰 타입으로 인지함
		 *  또한 float는 4byte라고 하더라도 long보다 큰 타입으로 인지함
		 *  따라서 값을 대입할 때는 캐스팅 해야함
		 *  
		 */
		
		
		
		fNum = 3.14F + 3.14F;
		fNum2 = fNum + 3.14F;//사칙연산은 기본타입으로 해야하기 때문에 표식자 붙여줌
		intNum = 3 + (int)longNum;
		
		//byte short
		byte bNum = 3;
		short sNum = 5;
		sNum = 3 + 100;
		bNum = (byte) (126 + 19);
		/* 작은 타입과 큰 타입 계산시엔 기본 타입 이하이면 기본타입으로 변환, 계산됨
		 * 기본타입 이상일 경우에는 무조건 큰 타입으로 변환 후 계산됨
		 * 
		 */
		
		/* 진법
		 * 8진수는 숫자0값, 16진수 숫자0x값
		 */
		
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		
		
		
		
		
		
		
		
	}

}
