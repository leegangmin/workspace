package jun16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* 스택 stack
 * 쌓아 올리다. 
 * 자료를 정해진 방향으로만 쌓을 있음
 * 가장 마지막에 입력된 자료가 가장 먼저 읽힌다.
 * 자료 저장 push
 * 자료 읽기 pop
 * 후입 선출구조(LIFO) Last In First Out
 *  
 * 사용 : 브라우저 사용기록, 실행 취소 
 * 
 * 큐 Queue
 * 줄 서서 기다리는 것
 * 선입선출 구조 (FIFO) First In First Out
 * 한쪽에서는 입력이 다른 쪽에서는 출력이 실행
 * 먼저 입력된 자료를 먼저 출력함
 * 
 * 사용 : 프린트 출력, 프로세스 실행
 */
public class Stack01 {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
		st.push("5");
		
		//추출
		while (!st.isEmpty()) {
			String str = st.pop();
			System.out.println(str);
		}
		
		//push() 객체를 스택에 넣기
		//peek() 스택의 맨 위 객체를 가져온다. 제거 x
		//pop() 스텍의 멘 위 객체를 가져온다. 제거 o
		/////////////////////////////////////////////768
		
		//Queue
		//offer  주어진 객체를 넣는다.
		//peek 객체를 가져온다. 큐에서 제거하지 않는다.
		//poll 객체 하나를 가져온다. 객체를 큐에서 제거한다.
		
		//LinkedList로 만들어보겠습니다.
		Queue<String> qu = new LinkedList<String>();
		qu.offer("1");
		qu.offer("2");
		qu.offer("3");
		qu.offer("4");
		qu.offer("5");
		
		while (!qu.isEmpty()) {
			String str = qu.poll();
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
