package may24;
/*�⼮ ����ֽð�, 
�Ʒ��� ���� ��µǴ� ���α׷��� ������ּ���.
1. for�� �ϳ��θ�.
2. �� 5�� 25��.

*****
*****
*****
*****
*****

�ɷ´����� : ���� SW ���� ��� Ȱ��
�ɷ´������ : �⺻ ����ȯ�� �����ϱ�
 */
public class For05 {
	public static void main(String[] args) {
	//���� for��    for�� �ӿ� for��
		
		//int i = 100;
		
		for (int i = 1; i <= 10; i+=2) {//���� �ݺ� === ���� �ݺ�				
			System.out.println(i);//1,3,5,7,9
		}
		//System.out.println(i);//������ ������
		
		for (int i = 0; i < 5; i++) {//�������� ����ϱ�
			for (int j = 0; j < 5; j++) {
				System.out.println(i * 5 + j + 1 + "�� �ݺ��߽��ϴ�.");
			}
		}
			
		
		
		
		
		
		//System.out.print("\n�̰͵� �ٹٲ�");//�ٹٲ�
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");//�ٹٲ�
		}
		
		//������ 2~9��
		
		//2��
		for (int i = 1; i < 10; i++) {			
			System.out.println("2 * " + i + " = " + (2 * i));
			//System.out.printf("2 * %d = %d\n", i , (2 * i));
		}
		
		//2�ܺ��� 9�ܱ��� ���
		A:for (int i = 2; i < 10; i++) {//��
			B:for (int j = 1; j < 10; j++) {//1~9
				//System.out.println(i + " X " + j + " = " + (i * j));
				if(j % 3 == 2) {//0 1 2
					//break;//���� ����� �ݺ��� Ż��.
					continue A;//���� ����� �ݺ������� ������
					//�󺧹�
					/*��ø�� �ݺ������� �̸��� �� �� �ֽ��ϴ�.
					 * �ʿ信 ���� �ش� �̸��� ����
					 * �ݺ����� Ż���ϰų� ������ �� �ֽ��ϴ�.
					 */
				}
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("");//���ϰ� �� ���� ����
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
