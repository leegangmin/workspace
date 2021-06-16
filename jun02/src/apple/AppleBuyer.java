package apple;

public class AppleBuyer {
	//정보
	//	가지고 있는 돈
	int buyerMoney = 5000;
	//	가지고 있는 사과의 수
	int countApple;
	
	//행동
	//	사는 행동
	public void buyApple(AppleSeller as1, int money) {
		//돈을 주고 사과를 받아야 함.
		//int num = as.sellApple(money);
		countApple += as1.sellApple(money);
		buyerMoney -= money;
	}
	//	결과 말하기
	public void buyerInfo() {
		System.out.println("구매자의 가진 돈은 " + buyerMoney);
		System.out.println("가진 사과는 " + countApple);
	}
	}


