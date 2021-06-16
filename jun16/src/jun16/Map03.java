package jun16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//로그인하기를 map으로 
/*HashTable
 * HashMap과 동일한 내부구조를 가지고 있습니다. 
 * HashTable도 키로 사용할 수 있는 객체는 hashCode()와 equals()를
 * 재정의 해서 동등 객체가 될 조건을 정해야 합니다. 
 * hashTable과 차이점은 HashTable은 동기화된 메소드로 구성되었기
 * 때문에 멀티 스레드가 동시에 이 메소드를 실행할 수 없고, 
 * 하나의 스레드가 실행을 완료해야 다른 스레드가 실행할 수 있다.
 * 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 가능
 * 
 * 이것을 스레드 안전(thread safe)이라고 합니다.
 * 
 */
public class Map03 {
	public static void main(String[] args) {
		
		//key = id, value = passwd
		Map<String, String> login = new HashMap<String, String>();
		login.put("poseidon", "01234567");
		login.put("temp", "temp0000");
		login.put("admin", "00000000");
		login.put("root", "rootroot");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력하세요.");
		String pw = sc.next();
		
		if(login.containsKey(id)) {
			if(login.get(id).equals(pw)) {
				System.out.println("정상 로그인입니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("해당 ID는 시스템에 없습니다.");
		}
		
	}
}
