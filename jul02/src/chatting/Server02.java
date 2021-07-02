package chatting;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server02 extends JFrame {
	private ArrayList<MultiServerThread> list;
	private Socket socket;
	JTextArea ta;
	JTextField tf;

	public Server02() {
		// 화면 디자인 코드
		setTitle("채팅 서버 ver 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta = new JTextArea();
		add(new JScrollPane(ta));
		tf = new JTextField();
		tf.setEditable(false);
		add(tf, BorderLayout.SOUTH);
		setSize(300, 300);
		setVisible(true);

		// 채팅 관련 코드
		list = new ArrayList<MultiServerThread>();
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			MultiServerThread mst = null;
			boolean isStop = false;
			tf.setText("서버가 정상 실행중입니다. 주인님^^\n");
			while (!isStop) {
				socket = serverSocket.accept();
				mst = new MultiServerThread();
				list.add(mst);
				mst.start();
			} // while
		} catch (IOException e) {
			e.printStackTrace();
		} // catch
	}

	public static void main(String[] args) {
		new Server02();
	}// main

	//
	class MultiServerThread extends Thread {
		private ObjectInputStream ois;
		private ObjectOutputStream oos;

		@Override
		public void run() {
			boolean isStop = false; // flag value
			try {
				ois = new ObjectInputStream(socket.getInputStream());
				oos = new ObjectOutputStream(socket.getOutputStream());
				String message = null; //
				while (!isStop) {
					message = (String) ois.readObject();//
					String[] str = message.split("#");//
					if (str[1].equals("exit")) { //
						broadCasting(message);//
						isStop = true; //
					} else {
						broadCasting(message);//
					} // else
				} // while
				list.remove(this);// ȫ�浿�� ����.
				ta.append(socket.getInetAddress() + " IP 사용자가 종료하였습니다.\n");
				tf.setText("사용자 수 : " + list.size());
			} catch (Exception e) {
				list.remove(this);// ������ ����.
				ta.append(socket.getInetAddress() + " IP 사용자가 비정상 종료되었습니다.");
				tf.setText("사용자 수 : " + list.size());
			} // catch
		}// run

		public void broadCasting(String message) {//
			for (MultiServerThread ct : list) {
				ct.send(message);
			} // for
		}// broadCasting

		public void send(String message) { //
			try {
				oos.writeObject(message);
			} catch (IOException e) {
				e.printStackTrace();
			} // catch
		}// send
	}//

}// end
