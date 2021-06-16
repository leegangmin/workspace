package may26;
/* 풀어주세요 
 1차원의 점들이 주어졌을 때, 
 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.
 (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 
결과값은 (3, 4)가 될 것이다.
 */
public class Daum {
	public static void main(String[] args) {
		
		int[] daum = {1, 3, 4, 8, 13, 17, 20};
		//각 거리차이를 저장할 변수
		
		int count = daum[1] - daum[0];
		//짧은 거리의 첫번째 수, 두번째 수 저장할 변수
		int fir = daum[0], sec = daum[1];
		
		for (int i = 0; i < daum.length - 1; i++) {
			if(count > daum[i + 1] - daum[i]) {
				fir = daum[i];
				sec = daum[i + 1];
				count = daum[i + 1] - daum[i];//?이게 필요할듯 합니다.
			}
		}
		//이 방법 말고 다른 방법도 많아요.
		System.out.println(fir + ", " + sec);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
