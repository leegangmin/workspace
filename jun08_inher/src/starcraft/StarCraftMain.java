package starcraft;

public class StarCraftMain {

	public static void main(String[] args) {

		StarCraft craft = new StarCraft();
		//�̷��� �ϸ� �ȵ�
		//���� ������, ��� ����
		//OOP -> ��� -> �߻�ȭ -> �������̽�
		
		Zealot zealot = new Zealot("����", 100, 50);
		Marine marine = new Marine("����", 50);
		Zergling zergling = new Zergling("���۸�", 50);
		//Zergling zergling = new Zergling();
		
		marine.attack();
		zealot.attack();
		zergling.attack();
		zealot.shieldCharge();
	}

}
