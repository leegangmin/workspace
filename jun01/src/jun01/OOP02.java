package jun01;

import apple.Apple;

//��ü����
/* ���������� �ϳ��� ������ ������� �����Ͽ� ó���մϴ� 
 * ��ü������ ��ü�� ȣ�� ������ ������ �޽��ϴ�.
 * 
 * ��ü�� ���� ������ �������� �ʰ� ���� ���ų� �ʿ��� ��ǰ��
 * ���� �����Ͽ� ���ȭ �ϴ� ���� ������ ���� ����Դϴ�. 
 * 
 * ��ü = ���ǿ� �����ϴ� �繰��
 * 
 * Ŭ���� = ��ü�� ��ǻ�Ϳ��� �����ϱ� ���ؼ� �ʿ��� ���赵 ���� ����
 * 			�ν��Ͻ� = �޸� �� ������� ��ü 
 * 
 * �޼ҵ� = Ŭ���� �ӿ� ���� � ����� �����ϴ� ��ɹ����
 */
class NoteBook{
	String game;
	String power;
	int memory = 1024;
	
	void runGame() {
		System.out.println(game + "�� �����մϴ�.");
	}
	
	void power(String stats) {//���� ����
		System.out.println("��Ʈ�� : " + stats);
	}
	
	int addMemory(int memory) {//���� ���� ����
		memory += this.memory;//�ν��Ͻ� ����
		return memory;
	}
}

public class OOP02 {
	public static void main(String[] args) {
		
		//Ŭ�������� �ν��Ͻ� �����ϱ�
		NoteBook lg = new NoteBook(); 
		
		lg.power("On");
		lg.game = "diablo4";
		lg.runGame();
		int result = lg.addMemory(1024);
		System.out.println("1024�� �߰��ϸ� " + result + "�� �˴ϴ�.");
		
		NoteBook ss = new NoteBook();
		lg.memory += 2048;
		System.out.println(lg.memory);
		System.out.println(ss.memory);
		
		System.out.println(ss.game);
		
		//Apple apple = new Apple();
		Apple a1 = new Apple();
		com.poseidon.apple.Apple s2 = new com.poseidon.apple.Apple();
		
		
		/* ��Ű��
		 * ���ü� �ִ� Ŭ���� ����
		 * 
		 * �ٸ� ��Ű����?
		 * 
		 * ��Ű�� �̸���?
		 */
		
		
		
		
	}
}
