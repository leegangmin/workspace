package apple;

public class AppleSeller {
	//정보
	//	사과의 수
	int appleCount = 50;
	//	가진 돈
	int sellerMoney = 0;
	//	사과의 가격
	final int APPLE_PRICE = 1000;//상수
	
	
	//기능
	//	사과를 파는 행동
	public int sellApple(int money) {
		//5천원 주면 사과 5개 가져옴
		int number = money / APPLE_PRICE;//줄 사과의 수
		//내 사과에서 -
		appleCount -= number;
		//돈은 +
		sellerMoney += money; 
		return number;
		
	}
	//	자신의 정보를 말하는 행동
	public void sellerInfo() {
		System.out.println("판매자의 남은 사과는 " + appleCount);
		System.out.println("수익은 " + sellerMoney);
	}
	

}
