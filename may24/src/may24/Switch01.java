package may24;
//����ġ Switch

/*
 * switch~case��
 * if�� else~if�� �� �ٸ� �����Դϴ�.
 * �� ������ case�� ���� ���ؼ� ����� true�̸� ������ ���������ϴ�.
 * switch�� ���� ���� Ÿ���� ��ġ���� ���� int���ϸ� �����մϴ�.
 * ���ڿ��� ���� ������ �����մϴ�.
 * 
 */

/* switch(�˻�����){
 * 		case ����:
 * 			������ true�� ������ ����;
 * 			break;
 * 		case ����2:
 * 			����2�� true�� ������ ����;
 * 		default:
 * 			������ case�� ������ ��� false�϶�
 * 			�⺻������ ����Ǵ� ���๮��;
 * 			break;
 * }
 * ���� : �˻� ������ intŸ�� ����
 * 			long, �Ǽ����� ���Ұ��մϴ�.
 * 			
 * 
 */

public class Switch01 {
	public static void main(String[] args) {

		//char number = 'A';
		int number = 0;
		//String number = "Hi";
		
		switch (number) {
		case 0:
			for (int i = 0; i < args.length; i++) {
				if() {
					
				}
			}
			
			if() {
				for (int j = 0; j < args.length; j++) {
					
				}
			}
			
			break;
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("number�� 5�����Դϴ�.");
			break;

		case 5:
			System.out.println("number�� 5�Դϴ�.");
			break;//?
			
		default://�� case�� �������� �ʴٸ�,
			System.out.println("number�� 0�� 5�� �ƴմϴ�.");
			break;
		}

		
		if(number > 1 || number < 5) {
			//
		}else if() {
			//
		}
		
		
		
		
		
		
	}
}
