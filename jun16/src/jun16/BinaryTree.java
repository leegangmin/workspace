package jun16;

import java.util.TreeSet;

//2��Ʈ��
/* ����Ʈ���� �������� ���(node)�� Ʈ�����·� ����� ����
 * ��Ʈ(root) ��� �Ҹ��� �ϳ��� ��忡�� ������ �� ��忡
 * �ִ� 2���� ��带 ������ �� �ִ� ����
 * 
 *  ����� �� ��带 �θ�-�ڽ� ���迡 �ִٰ� �ϸ� 
 *  �̿� �ִ� ��带 �θ���, �Ʒ� ��带 �ڽĳ���� �Ѵ�.
 *  �ϳ��� �θ���� �ִ� �ΰ��� �ڽ� ���� ����� �� �ִ�.
 *  
 *  ù��° �����ϴ� ���� ��Ʈ ��尡 �ǰ� �ι�° ����
 *  ��Ʈ ��忡�� ���� ũ�⸦ ���ϸ鼭 Ʈ���� ���� ��������.
 * (���ڰ� �ƴ� ���ڸ� ������ ��� = ������ �����ڵ尪�� ��)
 * 
 * ���� ���� ���ʿ�, ū ���� �����ʿ� ����
 * �̷��� �����ϸ� ���� ������ ��尡 ���� ���� ��
 * ���� ū ���� ������ ���� ��ġ�մϴ�.
 * 
 * TreeSet
 * ����Ʈ���� ������� �� set
 * �ϳ��� ���� ��� ���� value�� ���ʰ� ���� �� �ڽ� ��带 
 * �����ϱ� ���� �ΰ��� ������ �����Ǿ� ����.
 * 
 * TreeSet�� ���� �����ϸ� �ڵ����� ���ĵ�
 * �θ� ���� ���ؼ� ���� ���� ���ʿ�, ���� ���� �����ʿ� ����
 * 
 * first() ���� ���� �� ����
 * last() ���� ū �� ����
 * lower(v) v���� ���� �ٷ� �Ʒ� �� ����
 * higher(v) v���� �ٷ� ���� ��ü ����
 * floor(v) v�� ������ ��ü�� ������ ����, ������ �ٷ� �Ʒ� �� ����
 * ceiling(v) v�� ������ ��ü�� ������ ����, ������ ���� ��ü ����
 * pollFirst() ���� ���� ��ü�� �������� �÷��ǿ��� ����
 * pollLast()  ���� ���� ��ü�� �������� �÷��ǿ��� ����
 * 
 * 
 */
public class BinaryTree {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(25);
		ts.add(70);
		ts.add(55);
		ts.add(1);
		ts.add(69);
		ts.add(6);
		ts.add(59);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println(ts.higher(51));
		System.out.println(ts.floor(25));//?
		
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println("---------------------------");
		
		while (!ts.isEmpty()) {			
			System.out.println(ts.pollFirst());
		}
		
		System.out.println("---------------------------");
//		int count = ts.size();
//		for (int i = 0; i < count; i++) {
//			System.out.println(ts.pollFirst());
//		}
		
		
		
		
	}
}
