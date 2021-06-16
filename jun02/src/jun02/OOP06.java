package jun02;

/* 오버라이드
 * 		[상위 클래스]에 있는 메소드와 동일한 메소드를 만들어 기능을 [재정의] 하는 것
 * 		상속에서 사용함.
 * 
 * 오버로드
 * 		한 클래스 내에서 [같은 이름]의 메소드가 잇으면 안됨.
 * 		단, [파라미터]가 다르면 같은 메소드명을 허용.
 * 		파라미터의 [갯수, 순서, 타입]이 다르면 다른 메소드.
 * 		메소드를 호출할 때 파라미터로 구분함.
 * 
 */
public class OOP06 {

	public static void main(String[] args) {
		// 객체 생성, 호출
		Alan alan = new Alan();
		Marc marc = new Marc();
		
		alan.breakfast = true;

		//marc.ask();
		//alan.answer();
		
		alan.answer(marc);
	}

}

//클래스 생성 -> 변수, 메소드 생성 -> 객체 생성 -> 호출해서 사용
//Alan & Marc

class Alan {
	// 정보 = 변수 = 인스턴스 변수
	String name;// null
	boolean breakfast;// false

	// 기능 = 메소드()
	public void answer(Marc a) {
		a.ask();
		if (breakfast == true) {
			System.out.println("I have");
		} else {
			System.out.println("I haven't");
		}

	}
}

class Marc {
	// 정보

	// 기능
	public void ask() {
		System.out.println("Have you had a breakfast?");
	}
}
