package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

//������ �о����
public class IOTest02 {
	public static void main(String[] args) {

		byte[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		byte[] output = null;

		// �����͸� ���� �迭
		byte[] temp = new byte[3];

		ByteArrayInputStream bais = new ByteArrayInputStream(input);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		int data;

		try {
			while ((data = bais.read(temp)) != -1) {

				// data = bais.read(temp);
				// baos.write(temp);
				System.out.println("data : " + data);
				baos.write(temp, 0, data);//write(�迭, ������ġ, ����ģ)
				for (int i = 0; i < data; i++) {// data = 3
					System.out.println(temp[i]);
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		output = baos.toByteArray();

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));

	}

}
