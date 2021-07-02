package chatting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
		Scanner sc = null;
		Socket so = null;
		
		try {
			sc = new Scanner(System.in);
			so = new Socket("localhost", 5000);
			
			//출력
			OutputStream os = so.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String text = "";
			
			while (true) {
				System.out.println("내용 : ");
				text = sc.next();
				bw.write(text + "\n");// \n을 붙여야 서버로 날아감.
				bw.flush();//강제 전송
			}
		} catch (Exception e) {
		} finally {
			try {
				if (so != null) {so.close();}
				if (sc != null) {sc.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
