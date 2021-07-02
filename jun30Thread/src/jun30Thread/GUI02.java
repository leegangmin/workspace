package jun30Thread;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI02 {
	JFrame frame = new JFrame("Swing");
	JButton button = new JButton("Click here.");
	
	public void createFrame() {
		frame.add(button);
		frame.setSize(200, 400);
		frame.setVisible(true);
		//닫기버튼 명령 처리
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		GUI02 g02 = new GUI02();
		g02.createFrame();
	}
	
}
