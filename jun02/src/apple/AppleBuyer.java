package apple;

public class AppleBuyer {
	//����
	//	������ �ִ� ��
	int buyerMoney = 5000;
	//	������ �ִ� ����� ��
	int countApple;
	
	//�ൿ
	//	��� �ൿ
	public void buyApple(AppleSeller as1, int money) {
		//���� �ְ� ����� �޾ƾ� ��.
		//int num = as.sellApple(money);
		countApple += as1.sellApple(money);
		buyerMoney -= money;
	}
	//	��� ���ϱ�
	public void buyerInfo() {
		System.out.println("�������� ���� ���� " + buyerMoney);
		System.out.println("���� ����� " + countApple);
	}
	}


