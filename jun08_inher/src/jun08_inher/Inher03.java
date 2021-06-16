package jun08_inher;
//상속 및 오버라이드 다시

/*
 * 오버로드
 * 		같은 이름의 메소드를 여러개 만들 수 있는 기술
 * 		메소드 파라미터의 수, 순서, 타입이 달라야함 = 시그니쳐*****
 * 		sleep()
 * 		sleep(int age)
 * 		sleep(int age, int nam)
 * 		sleep(int age, int nam, String name)
 * 
 * 		this();
 * 		this.메소드();
 * 
 * 
 * 상속
 * 		클래스를 디자인 할 때 중복되는 코드가 있다면
 * 		이것을 상위 클래스에 몰아 넣고 내려받아서 쓰는 것
 * 		코드 중복 줄일 수 있음
 * 		다형성으로 서로 연결 할 수 있음
 * 
 * 		super();			부모 생성자 호출
 * 		super.메소드명();	부모 메소드 호출
 * 
 * 
 * 오버라이드
 * 		상속관계에서만 생성.*****
 * 		부모의 메소드를 자식 클래스에서 자신의 상황에 맞게
 * 		재정의해서 사용하는 것.*****
 * 		접근제어자, 리턴 타입, 파라미터는 그대로.
 * 
 * 
 */

class OldMan {
	String name;
	String ssn;

	public OldMan(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public void myInfo() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("주민번호는 " + ssn + "입니다.");

	}
}

class NewMan extends OldMan {
	String tel;

	public NewMan(String name, String ssn, String tel) { // 오버로드
		super(name, ssn);
		// this.name = name;
		// this.ssn = ssn;
		this.tel = tel;
	}

	@Override
	public void myInfo() {// 이 부분을 수정하면 오버로드
		// super.myInfo();
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("생년월일은 " + ssn.substring(0, 6) + "입니다.");
		System.out.println("전화번호는 " + tel + "입니다.");
	}

}

public class Inher03 {

	public static void main(String[] args) {

		OldMan o01 = new OldMan("홍길동", "423423-3423423");
		o01.myInfo();

		NewMan n01 = new NewMan("김길동", "123433-2352332", "030-32423-324234");
		n01.myInfo();

	}

}
