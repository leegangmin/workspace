package jun04;

/*
 * object 클래스는 java.lang 내 최상위 클래스이며
 * 다른 타입들은 기본형 형태로 저장되어있음.
 * 자바가 api를 정의한 모든 클래스와 사용자가 만든 클래스의 최상위 클래스임.
 * 모든 클래스는 이 Object를 상속받아서 사용함.
 * 
 * Object는 자동으로 import 됨.
 * 
 * Object --- String
 * 		  --- Boolean
 *		  --- StringBuffer
 *		  --- Character
 *		  --- Number	--- Byte
 *						--- Short
 *						--- Integer
 *						--- Long
 *						--- Float
 *						--- Double 
 *
 */
public class Object01 {

	public static void main(String[] args) {

		String str1 = "Hi";
		String str2 = new String("Hi");
		//String str2 = "Hi";
		
		System.out.println(str1);
		System.out.println(str2);
		
		if (str1 == str2) { // == -> 같은 객체인지 묻는거임
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
		
		
		
		if (str1.equals(str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		str2 = str1;
		
		str1 = "Hello";
		str2 = "world";
		
		//String의 값은 immutable 주소를 계속 변경하더라도 값은 불변
		//객체 비교는 ==, 값 비교는 equals
		
		if (str1 == str2) { 
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
		
		for (int i = 0; i < args.length; i++) {
			str1 += i + "";
		}
		
		//StringBuffer or StringBuilder recommended in field.
		
		str1 = "Hello";
		str2 = "Hello";
		str2 = str1;
		
		System.out.println(str1.getBytes());
		System.out.println(str2.getBytes());
		//유니코드 문자열을 바이트코드로
		
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		//어떤 클래스에 속하는지
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴함.

	}

}
