package starcraft;

public class Protoss extends StarCraft {
	int shield;
	String clan;
	
	public void attack() {
		System.out.println("�����佺�� ����");
	}
	public void shieldCharge() {
		System.out.println("��ȣ�� ȸ��");
		this.shield++;
	}
	
}
