package innerClass;
//멤버 클래스
/* 멤버 클래스와 static 클래스는 외부 클래스의 멤버 변수와 같은 위치에 선언됨.
 * 또한 멤버 변수와 같은 성질을 가짐.
 * 
 * 다른 책에서는 멤버 변수를 이렇게 말하고 있음.
 * 정적 클래스 static이 아닌 경우 (static선언이 없으면)
 * 내부 클래스라고 부름.
 * 
 * 내부 클래스는 클래스 내에 선언되므로 인스턴스 속성 변수처럼 활용됨.
 * 즉 메소드{} 안에서만 유효함.
 * 
 * 인스턴스 변수는 클래스 내에서 선언되지만 메소드 밖에서,
 * 생성자 밖에서, 다른 블록 밖에서 선언됨. (이 경우 반드시 초기화가 필요함)
 * 
 * 내부 클래스는 외부 클래스의 멤버를 활용할 수 있지만
 * 외부 클래스는 내부 클래스의 멤버 변수를 활용할 수 없다.
 * 또한 static 이 붙은 메소드 내에서는 내부 클래스의 객체 선언 X
 * 
 * 
 */
public class MemberClass01 {
	private int outerDf = 10;
	private static int osi = 55;
	int number = 777;
	
	void outerMethod() {
		System.out.println(number);
		System.out.println(osi);
		System.out.println(this.osi);
	}
	
	static void outterSM() {
		System.out.println(osi);
		//System.out.println(number);//X
	}
	
	public class InnerClass {
		private int x = 100;
		int innerDf = 100;
		static final int ISI = 123;
		
		public void innerMethod() {
			int imnum = osi;//외부 클래스
			System.out.println(x);
			System.out.println(innerDf);
			System.out.println(number);
			System.out.println(outerDf);
		}
		
	}
	
	
	
	public static void main(String[] args) {

		MemberClass01 memberClass01 = new MemberClass01();
		MemberClass01.InnerClass in = memberClass01.new InnerClass();
		in.innerMethod();
		

	}

}
