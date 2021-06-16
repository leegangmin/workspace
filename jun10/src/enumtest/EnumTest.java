package enumtest;
//enum
/*
 * 열거형타입
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
		System.out.println("계절은 " + season);
		System.out.println("시작 월은 " + startMonth);
	}
	
	public static void main(String[] args) {
		EnumTest enumTest = new EnumTest();
		enumTest.seasonInfo();
		enumTest.seasonShow();
		
	}
}
