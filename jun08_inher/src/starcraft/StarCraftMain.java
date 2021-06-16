package starcraft;

public class StarCraftMain {

	public static void main(String[] args) {

		StarCraft craft = new StarCraft();
		//이렇게 하면 안됨
		//접근 제어자, 상속 개념
		//OOP -> 상속 -> 추상화 -> 인터페이스
		
		Zealot zealot = new Zealot("질럿", 100, 50);
		Marine marine = new Marine("마린", 50);
		Zergling zergling = new Zergling("저글링", 50);
		//Zergling zergling = new Zergling();
		
		marine.attack();
		zealot.attack();
		zergling.attack();
		zealot.shieldCharge();
	}

}
