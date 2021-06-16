package com.poseidon.jini;

import java.util.Scanner;

//단어대응 심심이 같은거
//안녕
//시간
//탈출 시 안녕
public class JiniMake {
	public static void main(String[] args) {
		//객체 생성
		JINI jini = new JINI();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지니 시작");
		System.out.println("명령어 : 안녕/이름/날짜/시간/나가기");
		
		while (jini.isQute) {
			System.out.println("질문 >");
			String input = sc.next();
			jini.scheck(input);
		}
	sc.close();
}
}
