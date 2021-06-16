package jun01;

import apple.Apple;

//객체지향
/* 절차지향은 하나의 로직을 순서대로 진행하여 처리합니다 
 * 객체지향은 객체의 호출 순서에 영향을 받습니다.
 * 
 * 객체를 만들어서 순서에 연연하지 않고 자주 쓰거나 필요한 부품은
 * 따로 정의하여 모듈화 하는 등의 장점을 가진 방법입니다. 
 * 
 * 객체 = 현실에 존재하는 사물들
 * 
 * 클래스 = 객체를 컴퓨터에서 구현하기 위해서 필요한 설계도 같은 개념
 * 			인스턴스 = 메모리 상에 만들어진 객체 
 * 
 * 메소드 = 클래스 속에 존재 어떤 기능을 수행하는 명령문장들
 */
class NoteBook{
	String game;
	String power;
	int memory = 1024;
	
	void runGame() {
		System.out.println(game + "을 실행합니다.");
	}
	
	void power(String stats) {//가상 변수
		System.out.println("노트북 : " + stats);
	}
	
	int addMemory(int memory) {//지역 가상 변수
		memory += this.memory;//인스턴스 변수
		return memory;
	}
}

public class OOP02 {
	public static void main(String[] args) {
		
		//클래스에서 인스턴스 생성하기
		NoteBook lg = new NoteBook(); 
		
		lg.power("On");
		lg.game = "diablo4";
		lg.runGame();
		int result = lg.addMemory(1024);
		System.out.println("1024를 추가하면 " + result + "가 됩니다.");
		
		NoteBook ss = new NoteBook();
		lg.memory += 2048;
		System.out.println(lg.memory);
		System.out.println(ss.memory);
		
		System.out.println(ss.game);
		
		//Apple apple = new Apple();
		Apple a1 = new Apple();
		com.poseidon.apple.Apple s2 = new com.poseidon.apple.Apple();
		
		
		/* 패키지
		 * 관련성 있는 클래스 집합
		 * 
		 * 다른 패키지면?
		 * 
		 * 패키지 이름은?
		 */
		
		
		
		
	}
}
