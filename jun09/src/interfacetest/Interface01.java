package interfacetest;
//인터페이스
/* 다른 언어에서 찾기 힘든 자바의 고급 기능입니다.
 * 단일 상속의 한계 극복
 * 
 * 인터페이스란?
 * 추상 클래스 = 대략 만들어진, 추상적인, 추상화
 * 추상 클래스는 일반 메소드와 추상 메소드 둘 다 가질 수 있습니다.
 * 인터페이스는 오로지 추상 메소드와 상수만 가질 수 있습니다.
 * 
 * 인터페이스 내에 존재하는 메소드는 무조건 
 * 		public abstract로 선언됩니다.
 * 
 * 인터페이스 내에 존재하는 변수는 무조건
 * 		public static final로 선언됩니다.
 * 
 * 인터페이스는 다중상속과 비슷한 기능을 제공합니다.
 * 
 * 인터페이스를 잘 쓰면 편해집니다.
 * 
 * 인터페이스는 외부를 서로 이어주는 통로 역할을 합니다.
 * 
 * 생성하기
 * interface 인터페이스명{
 * 		public abstract void();//추상 메소드
 * }
 * 
 * 사용하기
 * 
 * class 클래스명 implements 인터페이스명{
 * 		인터페이스에서 미구현 된 메소드 오버라이드;
 * 
 * }
 * 
 * 인터페이스 구현시 주의할 점
 * 클래스에 인터페이스 상속시 인터페이스 내에 정의된 모든
 * 추상 메소드를 구현해야 합니다.
 * 
 * 
 * 상속과 인터페이스의 차이점?
 * 상속 class A extends B
 * B라는 클래스를 상속받아 A의 기능을 더한다.
 * 순수 상속 : 부모로부터 모든 권한과 재산 능력을 가져오기
 * 
 * 인터페이스 class A implements B
 * B라는 인터페이스를 구현하겠다.
 * 권한 상속 : 인터페이스만 가져오기 : 비어있는 것을 가져와서
 * 
 */
interface SayHi{
	//정적 변수, 공유 변수
	public static final int NUMBER = 0;//상수
	public void sayHi();//추상메소드
	void sayBye();//추상메소드
}

class Say extends Object implements SayHi{

	@Override
	public void sayHi() {//인터페이스에 있는 미구현 메소드 구현하기
		
	}

	@Override
	public void sayBye() {	}

	
	
}


public class Interface01 {

}
