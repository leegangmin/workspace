package starcraft;

public class Zealot extends Protoss {

	public Zealot(String name, int strength, int shield) {
		this.name = name;
		this.shield = shield;
		this.strength = strength;
	
	}
	
	@Override
	public void attack() {
		System.out.println("������ ����");
	}
	
	@Override
	public void shieldCharge() {
		System.out.println("���� ȸ��");
		this.shield += 2;
	}
	
}
