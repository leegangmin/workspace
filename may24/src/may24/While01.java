package may24;

import java.io.IOException;

//while
/* ���� �ݺ���
 * 
 * while(���ǽ�){
 * 		���ǽ��� ���̸� ��� �����մϴ�.
 * }
 * 
 * while�� ���� ���� �ݺ��� �����ϴٰ� Ư�� ������ �Ǹ�
 * Ż���ϵ��� �մϴ�. ���� Ȱ��˴ϴ�.
 * ä���̳� ���� �� ���� �ݺ� �������� Ȱ���մϴ�.
 * ��� ���ϴ�...
 */
public class While01 {
	public static void main(String[] args) throws IOException {
		
		boolean exit = true;
		
		while (exit) {
			System.out.println("���ǽ��� ���̸� ���ϴ�.");
			System.out.println("������?(Y/N)");
			char input = (char) System.in.read();
			System.in.read();//���͵� == \n \r
			System.in.read();//�� ������ ����Ű ó���Դϴ�.
			
			if(input == 'Y' || input == 'y') {
				exit = !exit;
				System.out.println("�����մϴ�.");
			}
		}
		
		System.out.println("while�� �Ʒ� ��¹� �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
