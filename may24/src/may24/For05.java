package may24;
/*출석 찍어주시고, 
아래와 같이 출력되는 프로그램을 만들어주세요.
1. for문 하나로만.
2. 별 5줄 25개.

*****
*****
*****
*****
*****

능력단위명 : 응용 SW 기초 기술 활용
능력단위요소 : 기본 개발환경 구축하기
 */
public class For05 {
	public static void main(String[] args) {
	//이중 for문    for문 속에 for문
		
		//int i = 100;
		
		for (int i = 1; i <= 10; i+=2) {//유한 반복 === 무한 반복				
			System.out.println(i);//1,3,5,7,9
		}
		//System.out.println(i);//데이터 스코프
		
		for (int i = 0; i < 5; i++) {//무한으로 출력하기
			for (int j = 0; j < 5; j++) {
				System.out.println(i * 5 + j + 1 + "번 반복했습니다.");
			}
		}
			
		
		
		
		
		
		//System.out.print("\n이것도 줄바꿈");//줄바꿈
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");//줄바꿈
		}
		
		//구구단 2~9단
		
		//2단
		for (int i = 1; i < 10; i++) {			
			System.out.println("2 * " + i + " = " + (2 * i));
			//System.out.printf("2 * %d = %d\n", i , (2 * i));
		}
		
		//2단부터 9단까지 찍기
		A:for (int i = 2; i < 10; i++) {//단
			B:for (int j = 1; j < 10; j++) {//1~9
				//System.out.println(i + " X " + j + " = " + (i * j));
				if(j % 3 == 2) {//0 1 2
					//break;//가장 가까운 반복문 탈출.
					continue A;//가장 가까운 반복문으로 던지기
					//라벨문
					/*중첩된 반복문에서 이름을 줄 수 있습니다.
					 * 필요에 따라서 해당 이름을 가진
					 * 반복문을 탈출하거나 제어할 수 있습니다.
					 */
				}
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("");//단하고 단 사이 공백
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
