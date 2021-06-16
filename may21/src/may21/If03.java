//if 연습
package may21;

public class If03 {

	public static void main(String[] args) {
			//랜덤값 뽑기
			//0.0 ~ 1.0 미만의 랜덤한 실수값
			int random = (int) (Math.random() * 5) + 1;
			System.out.println(random);
			
			if (random == 1) {
				System.out.println("1입니다");
			}
	
			else if (random == 2) {
				System.out.println("2입니다");
			}
			
			else if (random == 3) {
				System.out.println("3입니다");
			}
			
			else if (random == 4) {
				System.out.println("4입니다");
			}
			
			else if (random == 5) {
				System.out.println("5입니다");
			}
			

	}
}
