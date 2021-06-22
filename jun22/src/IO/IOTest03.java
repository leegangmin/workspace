package IO;

/*
 * ���α׷������� �����͸� �ܺο��� �а� �ٽ� �ܺη� ����ϴ� �۾��� ����ϰ� �Ͼ.
 * �����ʹ� ����ڷκ��� Ű���带 ���� �Էµ� �� �ְ�,
 * ���� �Ǵ� ��Ʈ��ũ�κ��� �Էµ� �� ����.
 * �����ʹ� �ݴ�� ����ͷ� ��µ� �� �ְ� ���Ϸ� ��µǾ� ����� �� ����.
 * 
 * �ڹٿ��� �����ʹ� ��Ʈ�� (stream)�� ���� ����µǹǷ� ��Ʈ���� Ư¡�� �� �������.
 * ��Ʈ���� �ܹ������� ���������� �귯���� ���� ����.
 * ���� ���� ������ ���� ������ �帣��, �����ʹ� ��������� ���� �������� ���ٴ� ����.
 * 
 * ���α׷��� �����͸� �Է¹��� ���� �Է½�Ʈ��
 * �����͸� ������ ���� ��½�Ʈ���̶�� ��.		
 */


//994page
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOTest03 {

	public static void main(String[] args) {
		
		byte[] input = {0,1,2,3,4,5,6,7,8,9,-1};
		byte[] output = null;
		byte[] temp = new byte[3];
		
		ByteArrayInputStream bais = new ByteArrayInputStream(input);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		
		while (bais.available() > 0) {
			System.out.println(bais.available() + " ����");
			try {
				int len = bais.read(temp);
				System.out.println(len + "temp���� ����");
				baos.write(temp, 0, len);//����, ����, ��
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		output = baos.toByteArray();
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		
		
		
		
		
		
	}

}
