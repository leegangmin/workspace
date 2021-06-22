package innerClass;
//지역 클래스
/* Local Class
 * 메소드 안에 선언한 클래스
 * 선언한 메소드 내에서만 사용하기 위해서 내부에 선언함.
 * 	메소드 안에서만 지역변수처럼 클래스를 활용하므로
 * 	메소드의 실행이 끝나면 지역 클래스는 제거됨.
 * 
 * 	외부에서 인스턴스를 생성할 수 없음.
 * 	또한 static을 사용할 수 없음.
 * 	instance변수 또한 메소드는 사용할 수 있음.
 * 
 * 	final 붙은 지역변수(상수처리)하거나 매개변수는
 * 	지역클래스의 메소드에서 접근 가능함
 * 
 * 	객체를 생성해서 활용해야함.
 * 	컴파일 하면 외부 클래스$숫자+로컬 클래스명.class로 만들어짐.
 * 	숫자는 서로 다른 메소드인 경우 같은 이름의 클래스가
 * 	존자할 수 있어서 구분하기 위해서 붙임.
 * 	
 * 
 */
public class LocalClass01 {
	private int a = 10;
	final int LV = 100;
	
	void method() {
		int in = 100;
		final int inD = 1000;
		
		class LocalClass{
			int no = 99;
			void msg() {
				no = no + 10;
				System.out.println("외부 a " + a);
				System.out.println(LocalClass01.this.a);
				System.out.println(in);
				System.out.println(inD);
				
			}
		}//LocalClass 끝
		//지역 클래스가 선언된 메소드 안에서 객체를 만듦.
		LocalClass local = new LocalClass();
		local.msg();//객체 생성 후에 호출해서 사용함.
	}//메소드 끝
	
		
	public static void main(String[] args) {

		LocalClass01 localClass01= new LocalClass01();
		localClass01.method();
	}

}
