package jun03;
//����������
/*
 * �ڹٿ����� ���� �����ڸ� ���ؼ� �� API�� ���� ������ ������ �� �ֽ��ϴ�.
 * 
 * ����� ������ �ƴϴϱ� �� ���ֽø� �˴ϴ�.
 * 
 * �Ʒ��� ���� �������� ���� ������ ��Ÿ�� �� �Դϴ�.
 * 
 * public > protected > default(package) > private
 * 
 * public : ���� ���� ������ ��Ű�� ���Ѿ��� ��� ���� ������ ����
 * 
 * protected : ���� ��Ű�������� ���� ����, 
 * 				�ٸ� ��Ű�������� ����̳� �ڽ� Ŭ����, �������̽����
 * 				���� �����մϴ�.
 * 
 * default : �ƹ��� ���� ������ ���� ���� �� = ����ִٸ� 
 * 			���� ��Ű�� ������ ���� ����
 * 			�ܺ� ��Ű�������� ���� �Ұ�.
 * 
 * private : �ڱ� �ڽ� Ŭ���������� ���� ����, �׿� ��� ����.
 * 
 * 
 * ���� : Ŭ���� �տ� �ٴ� ���������ڴ� public, default�� �ֽ��ϴ�.
 * 
 * ���� : Ŭ������ ���� �� � Ŭ������ public�� �ٿ��� ��?
 * 		�� �����̸��� public Ŭ�������� ����� �ұ�? 
 * 		������? �ڹ� ���� �ȿ� ���� Ŭ������ ������ �� 
 * 				�ϳ��� ��ǥ Ŭ������ �����ϰ� ���ϸ�� �����ϰ�
 * 				���ߴ� ���� �������� ������ �˴ϴ�.
 * 
 * 		����� �ҽ��ڵ带 ���� �� publicŰ���尡 ���� Ŭ������ ���ٸ�
 * 		�� �ҽ��� � �ڹ� ���� �̸����� �Ǿ��ִ��� �� �� �ֽ��ϴ�.
 * 		= public�� ���� ���� �ڹ� ���ϸ�� ������ class�� �ƴϴ�. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
class AAA{//DTO, VO
	private int age;   //a1.age = -100;
	private String name;
	
	public int getAge() {//getter
		return age;
	}
	public void setAge(int age) {//setter
		if(age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//3���� ���϶�� _��  ä���ּ���.  ȫ�� -> _ȫ��
		//5���ڶ�� �� 3���ڸ� �����ϰ� �ϱ�   �����ٶ󸶹� -> ������
		//��ĭ���� ������ ȫ�浿���� �����ϱ�    "" -> ȫ�浿
		if(name.length() < 1) {
			this.name = "ȫ�浿";
			
		}else if(name.length() == 1){
			this.name = "__" + name;
			
		} else if(name.length() == 2) {
			this.name = "_" + name;
			
		} else if(name.length() > 3) {
			this.name = name.substring(0, 3);
			
		} else {			
			this.name = name;
		}
	}
	
	
	
}

public class AccessModifier {
	public static void main(String[] args) {
		
		AAA a1 = new AAA();
		//a1.age = 10;
		a1.setAge(-110);
		System.out.println( a1.getAge()  );
		//a1.name = "";
		a1.setName("3PO");
		System.out.println(  a1.getName()   );
		
		
		
		
		
		
	}
}
