package apple;

public class AppleSeller {
	//����
	//	����� ��
	int appleCount = 50;
	//	���� ��
	int sellerMoney = 0;
	//	����� ����
	final int APPLE_PRICE = 1000;//���
	
	
	//���
	//	����� �Ĵ� �ൿ
	public int sellApple(int money) {
		//5õ�� �ָ� ��� 5�� ������
		int number = money / APPLE_PRICE;//�� ����� ��
		//�� ������� -
		appleCount -= number;
		//���� +
		sellerMoney += money; 
		return number;
		
	}
	//	�ڽ��� ������ ���ϴ� �ൿ
	public void sellerInfo() {
		System.out.println("�Ǹ����� ���� ����� " + appleCount);
		System.out.println("������ " + sellerMoney);
	}
	

}
