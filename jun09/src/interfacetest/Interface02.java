package interfacetest;

class Hero{
	public void attack() {
		System.out.println("공격");
	}
	public void defend() {
		System.out.println("막기");
	}
}

//날아다니고, 먹기도, lazer
interface Fly{
	public void fly();
}
interface Eat{
	public void eat();
}
interface Lazer{//관련성 있는 것끼리 조합해둡니다.
	public void shoot();
}

class Ironman extends Hero implements Fly, Eat, Lazer{

	@Override
	public void shoot() { }

	@Override
	public void eat() {	}

	@Override
	public void fly() {	}

}

class Hulk extends Hero implements Eat{

	@Override
	public void eat() { }
	
}







public class Interface02 {

}
//스타...... 최상위 클래스
//기능...인터페이스 ....
//상속.... 구현
















