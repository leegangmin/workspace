package jul02;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		String serverIp = "localhost";
		System.out.println(serverIp + " 서버 연결중.");

		try {
			//소켓 만들기
			Socket socket = new Socket(serverIp, 5000);
			
			//입력 스트림
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//소켓으로 받은 데이터 출력하기
			System.out.println("서버에서 온 메시지 : " + dis.readUTF());
			System.out.println("연결 종료");
			
			dis.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
