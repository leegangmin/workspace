package may28;

//import���� : ctrl + shift + o


/*
codingDojang --> coding_dojang

numGoat30 --> num_goat_3_0

�� ����� ���� CameleCase�� Pothole_case �� �ٲٴ� �Լ��� ������!

��ó: UT past test
 */
public class Camel2Pothole {
	public static void main(String[] args) {
		
		char ch1 = 'c';
		char ch2 = 'C';
		char ch3 = '1'; //ĳ���� Ȧ����ǥ, �ѱ���
		
		String str = "Hello";//���ڿ� �ֵ���ǥ, �ѱ���, �� �̻�
		
		System.out.println(Character.isUpperCase(ch1)); //false
		System.out.println(Character.isLowerCase(ch1)); //true
		
		System.out.println(Character.isUpperCase(ch2));//��
		System.out.println(Character.isLowerCase(ch2));//����
		
		System.out.println(Character.isUpperCase(ch3)); //����
		System.out.println(Character.isLowerCase(ch3)); //����
		
		System.out.println(Character.isDigit(ch1)); //false
		System.out.println(Character.isDigit(ch2)); //false
		System.out.println(Character.isDigit(ch3)); //true
		
		//���ڿ� ĳ���� ���·� �ѱ��ھ� �߶󳻱�
		//Hello
		//str = "12345";
		char ch4 = str.charAt( 0 ); //H
		
		System.out.println(Character.isUpperCase(ch4));
		System.out.println(Character.isUpperCase(str.charAt( 0 )));
		System.out.println(Character.isUpperCase(str.charAt( 1 )));
		System.out.println(Character.isUpperCase(str.charAt( 2 )));
		System.out.println(Character.isUpperCase(str.charAt( 3 )));
		System.out.println(Character.isUpperCase(str.charAt( 4 )));
		
		//��ҹ��� ��ȯ
		System.out.println(ch1);//�ҹ���
		System.out.println(Character.toUpperCase(ch1));//C
		
		System.out.println(ch2);//�빮��
		System.out.println(Character.toLowerCase(ch2)); //c
		
		
		/////////////////////////////////////////////
		
		//���� ���ڿ��� for������ 
		//�ѱ��ھ� ���ϱ� if �̰� �빮������ �����
		//���� �빮���̸� -> _���̰� �ҹ��ڷ� �����ؼ� ����ϱ�
		//���� �ҹ��ڶ�� �״�� ����ϱ�
		
		//for
			//if �빮����?
				// ����� + �ҹ��ڷ� ����
				// �׳� ���
		
		
		String word = "codingDojang";
		
		//0~������ �������� ���鼭 �빮������ �����
		for (int i = 0; i < word.length(); i++) {
			//�빮��?
			if(Character.isUpperCase(word.charAt(i))) {
				System.out.print("_" + Character.toLowerCase(word.charAt(i)));
			//�ҹ���
			} else {
				System.out.print(word.charAt(i));
			}
		}
		//String�� �־ ���߿� ����ϰ� ���ּŵ� �˴ϴ�.
		//coding_dojang
		
		System.out.println("===============ȣ���ؼ� ����ϱ�=============");
		
		//ȣ�� = �ٸ� �޼ҵ� �� ��Ű��
		//�޼ҵ��̸�(�Ķ����);
		String str2 = camel2pothole("codingKorea");
		System.out.println(str2);
		
		System.out.println(camel2pothole("hello3World"));//hello_3_world
		System.out.println(camel2pothole(""));
		// �Ķ���� Ÿ���� �¾ƾ� �˴ϴ�.
		
		
		
		
		//������Hello2!_134 ----> Hello2_134
		
	}//main�޼ҵ� ��
	//��ü���� ��ü�ȸ��� ��ȯŸ��  �̸�         (�Ķ����){
	public       static    String   camel2pothole(String camel) {
		String result = "";
		for (int i = 0; i < camel.length(); i++) {
			if(Character.isUpperCase(camel.charAt(i))) {
				result += "_" + Character.toLowerCase(camel.charAt(i));
			//�����϶��� ����� ������ ���ּ���.
			} else if(Character.isDigit(camel.charAt(i))) {
				result += "_" + camel.charAt(i);
			} else {
				result += camel.charAt(i);
			}
		}
		return result;//�ӽ÷� �̷���
	}
	
}//Ŭ���� ��