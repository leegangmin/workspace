package wrapperClass;

import java.util.ArrayList;

//랩퍼클래스
/*
 * 컬렉션 하기 위해서 = 값을 담을 때 참조형 R만 담을 수 있음.
 * 기본 자료형은 컬렉션에 담을 수 없기 때문에
 * 기본 자료형을 객체 타입으로 만들어 주는 것이 랩퍼 클래스임.
 * 
 * 기본 자료형의 값을 컬렉션에 담기 위해서는 랩퍼 클래스를 사용함.
 * 모든 기본 자료형에 대해 그에 대응하는 랩퍼 클래스가 있음.
 * 기본 자료형의 값을 멤버 변수의 값으로 저장하고
 * 이 값 주위로 값을 가공하는 메소드 들이 감싸고 있다고 해서
 * 랩퍼 wrapper: 감싸다 클래스라고 불림.
 * 
 * 기본 자료형		랩퍼 클래스
 * byte				Byte
 * short			Short
 * int				Integer
 * long				Long
 * 
 * float			Float
 * double			Double
 * 
 * char				Character
 * boolean			Boolean
 */

public class Wrapper {

	public static void main(String[] args) {
		
		//기본타입을 객체타입처럼 사용함
		//기본타입 + 메소드 = 랩퍼 클래스
		//컬렉션에 저장하기 위해서 객체형태로 씀
		
		
		//실제 값 저장하기
		String str = new String("value");
		Integer integer = new Integer(10);
		Integer integer2 = 10;
		

		System.out.println(integer);
		System.out.println(integer2);
		
		//Integer to int
		int numInt = integer;
		int numInt2 = integer2.intValue();
		short numShort = integer2.shortValue();//캐스팅 없이 변환
		long numLong = integer2.longValue();//가능함
		
		str = "10";
		numInt = Integer.parseInt(str);//str 값이 숫자라면 그 값 가져오기

		//최대값 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//16진수 저장
		//0x로 시작
		//0~9ABCDEF
		//public static final int	MIN_VALUE = 0x80000000;
		//public static final int	MAX_VALUE = 0x7fffffff;
		System.out.println("--------------------------");
		
		System.out.println(Integer.toBinaryString(3));
		System.out.println(Integer.toOctalString(9));
		System.out.println(Integer.toHexString(17));
		
		System.out.println("--------------------------");
		
		String b = Integer.toBinaryString(3);
		String o = Integer.toOctalString(9);
		String h = Integer.toHexString(17);
		
		System.out.println(b);
		System.out.println(o);
		System.out.println(h);
		System.out.println("--------------------------");
		
		System.out.println(Integer.parseInt(b, 2));
		System.out.println(Integer.parseInt(o, 8));
		System.out.println(Integer.parseInt(h, 16));
		
		System.out.println("--------------------------");
		int bi = 0b11;
		int oi = 011;
		int hi = 0x11;
		
		System.out.println(bi);
		System.out.println(oi);
		System.out.println(hi);
		
		System.out.println("--------------------------");
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max / min);
		
		System.out.println("--------------------------");
		
		//오토 언박싱 / 오토 박싱
		Integer integer3 = 200;//오토박싱
		//Integer integer3 = new Integer(200);
		//형 변환 아님. 기본 자료형이 참조형으로 바뀌는 것
		
		integer = 200;
		integer2 = new Integer(200);
		
		if (integer == integer2) {
			System.out.println("same");
		} else {
			System.out.println("not");
		}
		
		System.out.println("--------------------------");
		/*
		 * integer와 integer2가 같은 int값을 가지고 있는지
		 * 판별하기 위해서는 integer속에 있는 equals()를 써야 함.
		 * Integer의 equals()는 값이 int인지 판단하도록
		 * Object에서 이 equals()를 오버라이딩 함.
		 */
		
		if (integer.equals(integer2)) {
			System.out.println("same");
		} else {
			System.out.println("not");
		}
		
		System.out.println("--------------------------");
		
		System.out.println(integer.equals(integer2));
		System.out.println(integer.compareTo(integer2));
		
		System.out.println("--------------------------");
		integer = 10;
		integer2 = 11;
		int check = integer.compareTo(integer2); //1 0 -1
		
		if (check == 0) {
			System.out.println("same");
		} else if (check == 1) {
			System.out.println("integer is bigger");//앞이 클때
		} else {//-1
			System.out.println("integer2 is bigger");//뒤가 클때
		}
		
		System.out.println("--------------------------");
		
		numInt = 200;//int
		integer3 = 200;//Integer
		
		if (integer3.equals(numInt)) {//컴파일러가 위 코드를 확인 후 numInt를 new Integer(numInt)로 변경함
			System.out.println("same");
		} else {
			System.out.println("not");
		}
		
		System.out.println("--------------------------");
		
		numInt2 = integer3; //p = R
		//integer3 객체 안에 int값이 나와서 newInt2에 대입됨.
		//오토 언박싱 (값만 추출)
		
		integer3 = numInt2; // 오토 박싱 R = p
		
		double pi = 3.14;
		
		Double rPI = pi; //R타입으로 변경
		rPI = 3.14;
		
		Object obj = 10;
		System.out.println(obj);
		
		int num4 = (int) obj + 1;//캐스팅
		
		obj = "10";
		int num5 = Integer.valueOf((String)obj) + 1;
		
		obj = 10;
		int num6 = 5 + ((Integer)obj).intValue();
		/*
		 * 다른 형태로.
		 * obj에는 10을 내포하는 Integer객체의 참조값이 대입
		 * 컴파일 단계에서 Object = new Integer(10);으로 변경
		 * Object 타입의 레퍼런스로 Integer 고유의 메소드를 호출 할 수 없음.
		 * 호출하려면 형변환이 필요함.
		 */
		
		
		
		
		
		
		
		
	}
}
