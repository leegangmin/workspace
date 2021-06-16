package may25;

import java.util.Arrays;

//배열 Array
/* index, length ---> String
 * 위치, 길이
 * 
 * 일단, 이거 기억해. 배열은 객체다.
 * 객체는 기본적으로 속성과 메소드를 가지고 있음
 * 배열만 유일하게 속성만 가지고 있음
 * 
 * 배열은 동일(유사)한 타입의 데이터를 하나의 묶음 형태로
 * 관리하기 위해 사용되는 자료구조임
 * 
 * 예) int 타입의 변수가 100개 정도 필요하다면 변수명만 만드는데
 * 많은 시간이 걸림. 이를 관리하는 어려움도 있음.
 * 
 * 이런 어려움을 극복하고자 사용되는 것이 배열.
 * 
 * 배열은 객체라고 했기 때문에 객체의 속성과 메소드를 사용해서 배열을 관리.
 * 하지만 배열은 유일하게 속성만 가지고 있음.
 * 
 * 속성은 배열의 길이를 나타내는 length임.
 * 객체의 속성과 메소드 등을 호출할 때는 .(점)을 이용.
 * 
 */
public class Array01 {

	public static void main(String[] args) {
		
		// 배열 생성식 = 변수 선언식
		// 데이터타입 변수명 = 값;
		/* int 타입의 배열 = 내가 배열임을 선언
		 * 길이 = 저장할 수 있는 값
		 */
		
		int[] arr01 = new int[10];//int 타입의 길이가 10인 배열 선언 
		double[] dArr01 = new double[5];//double 타입의 길이가 5인 배열 선언
		//char 타입의 길이가 15인 배열은 선언해
		char[] cArr01 = new char[15];
		System.out.println(Arrays.toString(cArr01) + "       cArr01");
		
		//같은 타입, 동일 관리, 주소 호출
		//배열 생성식
		int[] arr02 = new int[5];//길이는 생성할때만 사용함
		//int arr02[] = new int[5]; 위와 같음
		
		//값 대입 = index
		arr02[0] = 10;//index 값 호출, 대입 할때만 씀
		//1 2 3 4 5 6 = 길이 length
		//0 1 2 3 4 5 = 위치 index -1
		//10
		
		//호출
		System.out.println(arr02[0]);
		System.out.println(arr02[1]);
		System.out.println(arr02[2]);
		System.out.println(arr02[3]);
		System.out.println(arr02[4]);
		//System.out.println(arr02[5]);//index 밖으로 나감
		
		//전체 다 찍어주려면?
		System.out.println(arr02); //[I@6ee52dcd 메모리 주소값
		System.out.println(Arrays.toString(arr02));//[10, 0, 0, 0, 0]
		
		//문제 [10, 11, 12, 13, 14]
		arr02[1] = 11; //index는 정수, 변수도 가능
		arr02[2] = 12;
		arr02[3] = 13;
		arr02[4] = 14;
		System.out.println(Arrays.toString(arr02));
		
		//해당 배열의 길이
		int length = arr02.length;
		System.out.println(arr02.length);//길이는 int
		
		//int[] arr03 = new int[arr02.length]
		
		//문제 [101, 101, 102, 103, 104]
		for (int i = 0; i < 5; i++) {
			arr02[i] = 100 + i;
		}
		
		//문제 [100, 102, 104, 106, 108]
				for (int i = 0; i < arr02.length; i++) {
					arr02[i] = 100 + 2*i;
				}
		System.out.println(Arrays.toString(arr02));
		
		//길이를 모르는 배열 맨 마지막 index에 값을 대입하고 싶다면
		//index = 길이 - 1
		arr01[(arr01.length) - 1] = 1000;
		System.out.println(Arrays.toString(arr01));
		
		
		//arr01에 1부터 10까지 저장해
		System.out.println(arr01.length);//10개 공간 있음
		
		//여기다가 for문으로 작성
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr01));

		//역순
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = arr01.length - i;
		}
		System.out.println(Arrays.toString(arr01));
		
		
	}

}
