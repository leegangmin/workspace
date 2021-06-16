package jun03;
/*
 * public	 : 모든 접근을 허용. 어떤 클래스가 접근하던 다 open 
 * protected : 상속 받은 클래스, 또는 같은 패키지 내에서만 접근 가능
 * default	 : 기본 제어자, 아무것도 붙지 않은 것.
 * 				클래스가 같은 패지키내에 있어야 접근 가능합니다.
 * private	 : 외부에서 접근 불가능, 같은 클래스 내에서만 접근 가능
 * 
 * 
 * 
 * 
 * 				클래스내부		동일패키지			하위클래스		그외
 * ---------------------------------------------------------------------
 * public			O				O					O			O
 * protected		O				O					O			X
 * default			O				O					X			X
 * private			O				X					X			X
 * 
 */



public class AccessM02{
	private static int num = 10;
	protected static int age;
	static String name;//
	
	protected void print() {
		
	}
	
	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		aaa.setAge(10);
		aaa.setName("3PO");
		
	}
}


