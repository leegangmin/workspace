package polymorphism;
//다형성
/* 다양한 형태로 변할 수 있는 것.
 * 
 * 다형성은 동적 바인딩(런타임 때 최종 타입이 결정되는 것)이
 * 지원되어야 합니다.
 * 
 * 다형성: 305p
 * 같은 타입이지만 실행결과가 다양한 객체를 이용할 수 있는 성질을
 * 말합니다. 코드 측면에서 보면 다형성은 하나의 타입에 여러 객체를
 * 대입함으로써 다양한 기능을 이용할 수 있도록 해줍니다.
 * 다형성을 위해 자바는 부모 클래스로 타입 변환을 허용해줍니다.
 * 즉 부모타입에 모든 자식객체가 대입될 수 있습니다.
 * 이것을 이용하면 객체는 부품화가 가능합니다.
 * 
 * 
 */

class Hero{
	public String name;
	public void attack() {
		System.out.println("공격");
	}
}

class Ironman extends Hero{
	public String spot = "하늘";
	int suitCount;
	
	public void makeSuit() {
		System.out.println("Javis, 슈트 만들어줘.");
	}
	
	@Override
	public void attack() {
		System.out.println("javis, 공격");
	}
}
class Hulk extends Hero{
	public String spot = "땅";
	@Override
	public void attack() {
		System.out.println("주먹");
	}
}
class Spiderman extends Hero{
	public String spot = "바다";
	@Override
	public void attack() {
		System.out.println("거미줄");
	}
}
class Thor extends Hero{
	public String spot = "우주";
	@Override
	public void attack() {
		System.out.println("번개");
	}
}







public class Polymorphism {
	public static void main(String[] args) {
		//Hero h = new Hero();
		Hero h1;//컴파일타임
		h1 = new Ironman();//런타임
		//반드시 상위 클래스가 앞으로 와야 합니다.
		
		//Ironman i = new Hero();
		
		h1.attack();
		//h1.makeSuit();?? 부를 수 없습니다.
		//그럼 자식 클래스에서 정의한 멤버나 메소드를 사용하기는?
		//숨김 = 변경시켜서 씁니다.
		
		//방법1 형변환
		((Ironman) h1).makeSuit();
		((Ironman)h1).suitCount = 10;
		
		//방법2
		int a = 10;
		byte ba = (byte)a;
		
		Ironman i2 = (Ironman)h1;
		i2.makeSuit();
		
		//Hulk
		//Spiderman
		//Thor        하나의 배열에 넣고 싶다면?
		int[] intArray = new int[4];
		
		Hero[] avangers = new Hero[4];
		
		avangers[0] = new Ironman();
		avangers[1] = new Hulk();
		avangers[2] = new Spiderman();
		avangers[3] = new Thor();
				
		for (Hero hero : avangers) {
			hero.attack();
		}
		
		for (int i = 0; i < avangers.length; i++) {
			avangers[i].attack();
		}
		
		
		
	}
}
