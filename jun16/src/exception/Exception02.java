package exception;
//����ó�� �غ���
/* 
 * try�� Ȱ���Ͽ� ������ ���� �ٸ� �κб��� ����ǰ� �� �� �ֽ��ϴ�.
 * 
 * 1. ���� ó�� 
 * 
 * 		try{
 * 			���ܰ� �߻��Ҹ��� �ڵ�;
 * 		}catch(Exception e){
 * 			���ܰ� �߻��ϸ� ������ �ڵ�;
 * 		}finally{
 * 			���� �߻������� ������� �ݵ�� �����ؾ� �� �ڵ�;
 * 			(�ݱ�();)
 * 		}
 * 
 * 
 * 
 * 
 * 2. ������(throw)
 * 
 * 		�޼ҵ� �޺κп� throw ó���� ����Ÿ���� �����ݴϴ�.
 * 		�޼ҵ尡 ����Ǵٰ� ���ܸ� ������ �޼ҵ带 ȣ����������
 * 		���ܸ� �����ϴ�.
 * 		main�޼ҵ�� VM���� �����ϴ�. 
 * 
 * 
 * 
 * 3. ���� ���� ��ü ���� ó���ϱ�
 * 		���� ��ü�� ���� ó���ϱ�
 * 		throw ��ü��;
 * 			@override
 * 			public void printStrackTrace(){
 				super.printstrackTrace();
 				System.out.println("��� �Ұ�");
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
			//���ܰ� �߻��� �� ���� �༮�� �� �ӿ� �־��ּ���.
			System.out.println("try���� �� �Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� �������� �õ� �� ���� �߻�");
			//���ܰ� �߻��ϸ� ����� �ڵ��̱� ������
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ������ �������.");
		} finally {
			System.out.println("����� ���� �߻��� �������");
			System.out.println("������ ������ �ɴϴ�.");
		}
		
		
		System.out.println("���α׷��� ����˴ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
