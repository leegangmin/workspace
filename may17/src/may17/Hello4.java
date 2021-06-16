package may17;
//변수
public class Hello4 {
	public static void main(String[] args) {
		//데이터타입 변수명 = 값;
		byte number = 127 ;//= 대입기호
		// -128~0~127
		//   <-------------   값의 흐름
		System.out.print(number + 10);
		print();//아래 메소드를 호출해서 일을시킴.
	}
	
	public static void print() {
		System.out.println("프린트 메소드에서 실행");
		System.out.println("윤승현");
		System.out.println("010-2799-2216");
		System.out.println("wisejia.com");
		System.out.println("wisejia@naver.com");
	}
	
}
