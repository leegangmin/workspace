package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class Server01 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			System.out.println("서버 실행 중...");
			serverSocket = new ServerSocket(5000);
			Socket socket = serverSocket.accept();
			System.out.println("접속 성공");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				System.out.println(br.readLine());
			}
			
		} catch (Exception e) {
		
		} finally {
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
