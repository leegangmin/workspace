package exception;
//예외처리 해보기
/* 
 * try를 활용하여 오류를 막고 다른 부분까지 실행되게 할 수 있습니다.
 * 
 * 1. 직접 처리 
 * 
 * 		try{
 * 			예외가 발생할만한 코드;
 * 		}catch(Exception e){
 * 			예외가 발생하면 실행할 코드;
 * 		}finally{
 * 			예외 발생유무와 상관없이 반드시 실행해야 할 코드;
 * 			(닫기();)
 * 		}
 * 
 * 
 * 
 * 
 * 2. 던지기(throw)
 * 
 * 		메소드 뒷부분에 throw 처리할 예외타입을 적어줍니다.
 * 		메소드가 실행되다가 예외를 만나면 메소드를 호출한쪽으로
 * 		예외를 던집니다.
 * 		main메소드는 VM으로 던집니다. 
 * 
 * 
 * 
 * 3. 직접 예외 객체 만들어서 처리하기
 * 		예외 객체를 만들어서 처리하기
 * 		throw 객체명;
 * 			@override
 * 			public void printStrackTrace(){
 				super.printstrackTrace();
 				System.out.println("계산 불가");
 * 			}
 * 
 */
public class Exception02 {
	public static void main(String[] args) {
		
		//System.out.println(10/0);//ArithmeticException
		
		try {
			int[] ia = {10, 20, 30, 40, 50};
			System.out.println(ia[5]);
			//ArrayIndexOutOfBoundsException
			
			System.out.println(10/0);
			//예외가 발생할 것 같은 녀석을 이 속에 넣어주세요.
			System.out.println("try문장 속 입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누려고 시도 중 예외 발생");
			//예외가 발생하면 실행될 코드이기 때문에
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 밖으로 나갔어요.");
		} finally {
			System.out.println("여기는 예외 발생과 상관없이");
			System.out.println("실행할 문장이 옵니다.");
		}
		
		
		System.out.println("프로그램이 종료됩니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
