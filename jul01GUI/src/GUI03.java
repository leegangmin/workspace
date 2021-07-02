package jul01GUI;
//자바 그래픽 = menu

import java.awt.MenuBar;
import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class GUI03 {
	JFrame jf = new JFrame("메뉴 만들기");
	JTextArea textArea = new JTextArea("입력하세요", 5, 10);//스크롤바 없는 5x10
	
	//메뉴 넣기
	JMenu fileMenu = new JMenu("파일");
	JMenu helpMenu = new JMenu("도움말");
	//menubar
	JMenuBar menuBar = new JMenuBar();
	
	//scrollbar
	JScrollPane jScrollPane = new JScrollPane(textArea);
	
	public GUI03() {
		fileMenu.add(new JMenuItem("새파일 열기"));
		fileMenu.getItem(0).setAccelerator(
				KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK));
		fileMenu.add(new JMenuItem("저장"));
		fileMenu.getItem(1).setAccelerator(
				KeyStroke.getKeyStroke('S', InputEvent.CTRL_MASK));
		fileMenu.add(new JMenuItem("기존파일에 추가"));
		fileMenu.addSeparator();//-----------구분선 그리기
		fileMenu.add(new JMenuItem("종료"));
		
		helpMenu.add(new JMenuItem("이 프로그램은"));
		helpMenu.add(new JMenuItem("만든 사람"));
		
		//menubar에 붙이기
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		//프레임에 붙이기
		jf.setJMenuBar(menuBar);
		//textArea붙이기
		jf.add(jScrollPane, "Center");
		
		jf.setSize(300, 600);
		
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GUI03();
	}
	
	
	
	
	
}
