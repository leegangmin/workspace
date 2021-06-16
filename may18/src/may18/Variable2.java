package may18;

public class Variable2 {

	public static void main(String[] args) {
		//String 문자열
		//데이터타입 변수명 = 값;
		String name = "홍길동";
		//문자열 + 문자열 ===== 연결
		System.out.println("제 이름은 " + name + "입니다.");
		//계산
		System.out.println(10+10);
		System.out.println("제 이름은 홍길동입니다.");
		
		int age = 34;
		//문자열 + 숫자 ==== 연결
		System.out.println("제 나이는 " + age + "입니다.");
		//숫자 + 문자열 === 연결
		System.out.println(20 + "입니다.");
		//숫자 + 숫자 + 문자열 ===== 계산 + 연결
		System.out.println(20 + 10 + "입니다.");
		//문자열 + 숫자 + 숫자 + 문자열
		System.out.println("문자열" + age + 10 + "입니다.");
		//문자열 3410 입니다.
		System.out.println("문자열" + (age + 10) + "입니다.");
		//문자열 44 입니다.
		System.out.println(3.14 + 10 + "입니다.");
	}

}
