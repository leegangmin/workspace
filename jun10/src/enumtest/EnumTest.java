package enumtest;
//enum
/*
 * ������Ÿ��
 * 
 */
public class EnumTest {
	Season season;
	int startMonth;
	
	public void seasonInfo() {
//		this.season = "Spring";
		this.season = Season.Spring;
	}
	
	public void seasonShow() {
		System.out.println("������ " + season);
		System.out.println("���� ���� " + startMonth);
	}
	
	public static void main(String[] args) {
		EnumTest enumTest = new EnumTest();
		enumTest.seasonInfo();
		enumTest.seasonShow();
		
	}
}
