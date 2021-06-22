package innerClass;
//static class
/* class 앞에 static이 붙은 것이 차이점.
 * stastic이 붙었기 때문에 객체 생성없이 사용 가능함.
 * 클래스의 static 변수처럼 사용됨.
 * 외부 클래스와 내부 클래스는 다르게 동작함.
 * 외부 클래스와 내부 클래스의 멤버가 private이라도 상호 접근 가능.
 * 경로만 지정된다면 단독으로 직접 사용할 수 있음.
 * 
 * 책 390p
 */
public class StaticClass01 {
	private int num = 1;//객체 생성, 외부X
	int sc = num;//객체 생성, 외부O
	private static int outterSI = 0;//클래스명. 객체X, 외부X
	public static void outterMethod() {
		System.out.println(SInner.innerSM);
	}
	
	public static class SInner {
		private int innerMember = 200;
		private static int innerSM = 300;
		final int LV = 100;
		
		public static void innerMethod() {
			System.out.println("static 클래스 내부 static 메소드");
		}
		
		public void innerM() {
			System.out.println("static 클래스 내부 클래스");
			System.out.println("this.innerSM : " + this.innerSM);
			System.out.println("outterSI : " + outterSI);
		}
	}
	public static void main(String[] args) {
		StaticClass01 staticClass01 = new StaticClass01();
		StaticClass01.SInner si = new SInner();
		StaticClass01.SInner si2 = new StaticClass01.SInner();
	
		si.innerMethod();
		si.innerM();
		//si.innerMember;
		//si.LV;
		
		StaticClass01.SInner.innerMethod();
		//StaticClass01.SInner.innerM();//객체 생성 후 호출

		//AAA 객체 생성
		AAA aaa = new AAA();
		//System.out.println(aaa.BBB);//불가
		//System.out.println(AAA.BBB);//안보임
		AAA.BBB bbb = new AAA.BBB();
		//bbb.number2//이건 가능.
	
	}
}

class AAA {
	private static int innerNum = BBB.number;//접근 가능
	private static int outternum = 100;
	
	static class BBB {
		private static int number = 10;
		int number2 = outternum;//외부의 것도 접근 가능.
	}
}


