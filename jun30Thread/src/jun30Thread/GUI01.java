package jun30Thread;
//자바 그래픽
/* awt		해당 운영체제의 특징을 따라 화면을 구성함.
 * 			==	운영체제에 따라 다른 화면이 나옴.
 * 				전통적인 그래픽 출력
 * 
 * swing	자바 영역에서 사용하는 look and feel을 적용해서
 * 			모든 운영체제가 같은 모습을 보이게 함.
 * 			JButton
 * 
 * javaFX	RIA (Rich Internet Application)를 디자인하고 만들어 테스트,
 * 			디버그, 배포까지 가능한 일련의 그래픽과 미디어의 통합 패키지.
 * 			javaFX는 더 가벼워지고 더 강력한 기능을 가지고 있음.
 * 
 * -------------------------------------------------------------------
 * 용어
 * 컨테이너		자바에서 창 역할을 함.
 * 				한개 이상의 컨테이너 위에 컨테이너들이 올라감.
 * 				컨테이너는 컴포넌트보다 작은 개념임.
 * 				frame, window, panel, dialog, applet
 * 
 * 컴포넌트		실제로 컨테이너 위에 올려져서 화면 구성을 담당.
 * 				button, textField, textArea, list
 * 
 * 레이아웃		컨테이너 위에 컴포넌트들이 올려질 때 자리 배치 방법
 * 				flowLayout, boardLayout, gridLayout, cardLayout
 * 
 * 
 * 상속을 받을 때는 많이 사용하는 요소를 상속받는 것이 좋음.
 * 화면 생성은 프로그램 초기에 이뤄줘야 하므로 주로 생성자에서 작업함.
 * = 지금까지 배운 것들이 모두 나옴.
 * 
 * 컨테이너 위에 컴포넌트 추가하는 방법.
 * 
 * 프레임.add(컴포넌트);
 * 
 * 프레임.setSize(); 크기 지정
 * 
 * 프레임.setVisible(boolean); 보여주기
 * 
 */

import java.awt.Button;
import java.awt.Frame;

public class GUI01 {
	Frame f = new Frame("프레임");
	Button b = new Button("BUTTON");
	
	public void createFrame() {
		f.add(b);
		f.setSize(300, 600);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI01 g01 = new GUI01();
		g01.createFrame();
	}
}
