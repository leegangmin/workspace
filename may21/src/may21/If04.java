package may21;

public class If04 {

	public static void main(String[] args) {
		
		int random1 = (int) (Math.random() * 10 + 1);
		int random2 = (int) (Math.random() * 10 + 1);
		
		int temp = 0;
		
		if(random1 < random2) {
			
			temp = random1;
			random1 = random2;
			random2 = temp;
			
		}
		System.out.println(temp);//데이터스코프 {}
		
/* 데이터 스코프
 * 간단히 정의하면 선언된 변수가 어떤 범위까지 유지되는지 입니다.
 * 
 */
		
		System.out.println(random1 + ">" + random2);
		
		//if (random1 > random2) {
		//	System.out.println(random1 + ">" + random2);
		//} else if (random2 > random1) {
		//	System.out.println(random2 + ">" + random1);
		//}
		

		
		
	}

	
	
}
