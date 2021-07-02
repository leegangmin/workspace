package jul02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

//소켓
/* socket
 * 소켓을 사용하는 통신을 말함.
 * 소켓 : 프로세스간 통신에 사용되는 양 끝단 영역을 말함.
 * java.net 안에 소켓이 있음. tcp/udp를 사용하는 소켓프로그래밍이 대표적
 * 
 * tcp : 전화 - 데이터를 전송하기 전에 먼저 상대편과 연결한 후 데이터 전송
 * 				전송되어 있는지 확인함. 실패하면 재전송.
 * 
 * udp : 전보 - 연결하지 않고 데이터를 전송함. 전송 확인하지 않음.
 * 				데이터를 순서대로 수신한다는 보장이 없음.
 * 
 * 서버 클라이언트의 1:1 통신
 * 서버가 먼저 실행되어 클라이언트의 연결 요청을 기다림.
 * 
 * socket : 프로세스간 통신을 담당. inputStream, OutputStream을 가지고 있음.
 * 			두 스트림을 통해 프로세스간 통신이 이루어짐.
 * 
 * server socket : 포트와 연결되어 외부 연결 요청을 기다리다 연결이 들어오면
 * 					socket을 생성하여 소켓과 소켓간 통신을 함.
 * 
 * 하나의 포트에는 하나의 소켓이 연결됨. (프로토콜이 다르면 다른 포트로)
 * 1. 서버는 서버소켓을 사용해서 서버 컴퓨터의 특정 포트에서 클라이언트 요청을 처리함.
 * 2. 클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서벙 연결을 요청함.
 * 3. 서버 소켓은 클라이언트의 요청을 받으며 새로운 소켓을 생성해서 클라이언트와 연결함.
 * 4. 클라이언트의 소켓과 서버소켓은 1:1 통신을 함.
 * 
 * 1056page
 */
public class Socket {
	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(5000);
			System.out.println(getTime() + " 접속됨.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			System.out.println(getTime() + " 접속 대기중...");
			try {
				java.net.Socket socket = ss.accept();
				System.out.println(getTime() + socket.getInetAddress() + " 로 부터 요청이 들어옴");
				//소켓의 출력 스트림 얻어오기
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//원격 소켓 보내기
				dos.writeUTF("서버로부터 온 메시지.");
				System.out.println(getTime() + " 데이터를 전송함.");
				dos.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
}
