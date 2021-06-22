package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//IO
/*
 * �ܺο���, � ���?, ��� �ְ� �޴���?, null, Stream
 * 
 */
public class IOTest01 {

	public static void main(String[] args) {
		//����Ʈ �迭�� ����� �ű� ���� �о����
		byte[] input = {1, 3, 5, 7, 9, 12,-1, 15, 18, 21, 90};
		byte[] output = null;
		
		//��ǲ ��� ����
		ByteArrayInputStream bais = null;
		bais = new ByteArrayInputStream(input);
		
		//�ƿ�ǲ ���
		ByteArrayOutputStream baos = null;
		baos = new ByteArrayOutputStream();
		
		//�аų� ���� ����Ʈ�� ���� ����
		int data = 0;
		//���� �����͸� �˻��ؼ� -1�̸� read()�����ϱ�
		//-1�� ���̻� ���� ���� ���ٴ� ��ȯ��.
		//��Ʈ������ �ϳ��� ����Ʈ�� �д� ��ǥ�� �޼ҵ� read()
		//read() : ���� ����Ʈ�� ���� ����(int)�� ������.
		
		while (true) {
			data = bais.read();//�о����
			if (data == -1) {
				break;
			}
			baos.write(data);//�ű� ����� ���⿡
		}

		output = baos.toByteArray();
		
		//���
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		
		
		
		
		
		
		
	}

}
