package interfacetest;

class Hero{
	public void attack() {
		System.out.println("����");
	}
	public void defend() {
		System.out.println("����");
	}
}

//���ƴٴϰ�, �Ա⵵, lazer
interface Fly{
	public void fly();
}
interface Eat{
	public void eat();
}
interface Lazer{//���ü� �ִ� �ͳ��� �����صӴϴ�.
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
//��Ÿ...... �ֻ��� Ŭ����
//���...�������̽� ....
//���.... ����
















