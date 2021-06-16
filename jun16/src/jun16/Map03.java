package jun16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//�α����ϱ⸦ map���� 
/*HashTable
 * HashMap�� ������ ���α����� ������ �ֽ��ϴ�. 
 * HashTable�� Ű�� ����� �� �ִ� ��ü�� hashCode()�� equals()��
 * ������ �ؼ� ���� ��ü�� �� ������ ���ؾ� �մϴ�. 
 * hashTable�� �������� HashTable�� ����ȭ�� �޼ҵ�� �����Ǿ���
 * ������ ��Ƽ �����尡 ���ÿ� �� �޼ҵ带 ������ �� ����, 
 * �ϳ��� �����尡 ������ �Ϸ��ؾ� �ٸ� �����尡 ������ �� �ִ�.
 * �׷��� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ���� ����
 * 
 * �̰��� ������ ����(thread safe)�̶�� �մϴ�.
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
		System.out.println("���̵� �Է��ϼ���.");
		String id = sc.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String pw = sc.next();
		
		if(login.containsKey(id)) {
			if(login.get(id).equals(pw)) {
				System.out.println("���� �α����Դϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("�ش� ID�� �ý��ۿ� �����ϴ�.");
		}
		
	}
}
