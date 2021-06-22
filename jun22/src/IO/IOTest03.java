package IO;

/*
 * 프로그램에서는 데이터를 외부에서 읽고 다시 외부로 출력하는 작업이 빈번하게 일어남.
 * 데이터는 사용자로부터 키보드를 통해 입력될 수 있고,
 * 파일 또는 네트워크로부터 입력될 수 있음.
 * 데이터는 반대로 모니터로 출력될 수 있고 파일로 출력되어 저장될 수 있음.
 * 
 * 자바에서 데이터는 스트림 (stream)을 통해 입출력되므로 스트림의 특징을 잘 살펴야함.
 * 스트림은 단방향으로 연속적으로 흘러가는 것을 말함.
 * 물이 높은 곳에서 낮은 곳으로 흐르듯, 데이터는 출발지에서 나와 도착지로 들어간다는 개념.
 * 
 * 프로그램이 데이터를 입력받을 때는 입력스트림
 * 데이터를 내보낼 때는 출력스트림이라고 함.		
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
			System.out.println(bais.available() + " 길이");
			try {
				int len = bais.read(temp);
				System.out.println(len + "temp속의 길이");
				baos.write(temp, 0, len);//내용, 시작, 끝
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		output = baos.toByteArray();
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		
		
		
		
		
		
	}

}
