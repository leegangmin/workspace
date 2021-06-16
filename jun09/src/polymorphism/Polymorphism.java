package polymorphism;
//������
/* �پ��� ���·� ���� �� �ִ� ��.
 * 
 * �������� ���� ���ε�(��Ÿ�� �� ���� Ÿ���� �����Ǵ� ��)��
 * �����Ǿ�� �մϴ�.
 * 
 * ������: 305p
 * ���� Ÿ�������� �������� �پ��� ��ü�� �̿��� �� �ִ� ������
 * ���մϴ�. �ڵ� ���鿡�� ���� �������� �ϳ��� Ÿ�Կ� ���� ��ü��
 * ���������ν� �پ��� ����� �̿��� �� �ֵ��� ���ݴϴ�.
 * �������� ���� �ڹٴ� �θ� Ŭ������ Ÿ�� ��ȯ�� ������ݴϴ�.
 * �� �θ�Ÿ�Կ� ��� �ڽİ�ü�� ���Ե� �� �ֽ��ϴ�.
 * �̰��� �̿��ϸ� ��ü�� ��ǰȭ�� �����մϴ�.
 * 
 * 
 */

class Hero{
	public String name;
	public void attack() {
		System.out.println("����");
	}
}

class Ironman extends Hero{
	public String spot = "�ϴ�";
	int suitCount;
	
	public void makeSuit() {
		System.out.println("Javis, ��Ʈ �������.");
	}
	
	@Override
	public void attack() {
		System.out.println("javis, ����");
	}
}
class Hulk extends Hero{
	public String spot = "��";
	@Override
	public void attack() {
		System.out.println("�ָ�");
	}
}
class Spiderman extends Hero{
	public String spot = "�ٴ�";
	@Override
	public void attack() {
		System.out.println("�Ź���");
	}
}
class Thor extends Hero{
	public String spot = "����";
	@Override
	public void attack() {
		System.out.println("����");
	}
}







public class Polymorphism {
	public static void main(String[] args) {
		//Hero h = new Hero();
		Hero h1;//������Ÿ��
		h1 = new Ironman();//��Ÿ��
		//�ݵ�� ���� Ŭ������ ������ �;� �մϴ�.
		
		//Ironman i = new Hero();
		
		h1.attack();
		//h1.makeSuit();?? �θ� �� �����ϴ�.
		//�׷� �ڽ� Ŭ�������� ������ ����� �޼ҵ带 ����ϱ��?
		//���� = ������Ѽ� ���ϴ�.
		
		//���1 ����ȯ
		((Ironman) h1).makeSuit();
		((Ironman)h1).suitCount = 10;
		
		//���2
		int a = 10;
		byte ba = (byte)a;
		
		Ironman i2 = (Ironman)h1;
		i2.makeSuit();
		
		//Hulk
		//Spiderman
		//Thor        �ϳ��� �迭�� �ְ� �ʹٸ�?
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
