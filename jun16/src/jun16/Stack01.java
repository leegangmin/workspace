package jun16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* ���� stack
 * �׾� �ø���. 
 * �ڷḦ ������ �������θ� ���� ����
 * ���� �������� �Էµ� �ڷᰡ ���� ���� ������.
 * �ڷ� ���� push
 * �ڷ� �б� pop
 * ���� ���ⱸ��(LIFO) Last In First Out
 *  
 * ��� : ������ �����, ���� ��� 
 * 
 * ť Queue
 * �� ���� ��ٸ��� ��
 * ���Լ��� ���� (FIFO) First In First Out
 * ���ʿ����� �Է��� �ٸ� �ʿ����� ����� ����
 * ���� �Էµ� �ڷḦ ���� �����
 * 
 * ��� : ����Ʈ ���, ���μ��� ����
 */
public class Stack01 {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
		st.push("5");
		
		//����
		while (!st.isEmpty()) {
			String str = st.pop();
			System.out.println(str);
		}
		
		//push() ��ü�� ���ÿ� �ֱ�
		//peek() ������ �� �� ��ü�� �����´�. ���� x
		//pop() ������ �� �� ��ü�� �����´�. ���� o
		/////////////////////////////////////////////768
		
		//Queue
		//offer  �־��� ��ü�� �ִ´�.
		//peek ��ü�� �����´�. ť���� �������� �ʴ´�.
		//poll ��ü �ϳ��� �����´�. ��ü�� ť���� �����Ѵ�.
		
		//LinkedList�� �����ڽ��ϴ�.
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
