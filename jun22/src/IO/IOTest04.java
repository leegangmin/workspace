package IO;

import java.io.BufferedReader;
import java.io.FileReader;

//file �о����
public class IOTest04 {

	public static void main(String[] args) {
		//FileReader
		FileReader fr = null;//���� �о���� ����
		BufferedReader br = null;//�ҷ��� ������ �����ִ� ����

		try {
			fr = new FileReader("C:\\temp\\ddd.txt");
			String line = null;
			//���ڿ��� �̾ �� ��ü�� �־�ΰ� ����ϱ�
			//���ؼ� ��Ʈ�� ���۸� �����.
			StringBuffer sb = new StringBuffer();
			//���ο��ٰ� br.�� �� ���� �о ������.
			//�� �̻� ������ ���� ������ �ݺ��� ���߰� �ϰ���.
			br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
