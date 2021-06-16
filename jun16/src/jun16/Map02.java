package jun16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map02 {
	public static void main(String[] args) {
		//Ű�� String, ���� 10,20,30...
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//map.put(null, null);//
		map.put("1", 10);
		map.put("2", 20);
		map.put("3", 30);
		map.put("4", 40);
		map.put("5", 50);
		
		System.out.println(map);
		
		Integer num = map.get("5");
		System.out.println(num);
		
		System.out.println(map.containsKey("1"));//true
		System.out.println(map.containsKey("10"));//false
		
		System.out.println(map.containsValue(50));//true
		System.out.println(map.containsValue(500));//false
		
		//map.clear();
		//map.isEmpty();
		
		List<Integer> list = new ArrayList<Integer>(map.values());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set<Integer> set = new HashSet<Integer>(map.values());
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
/* ����
 * Map�� Key�� value�� ���� �����̸�, �ߺ��� ������� �ʽ��ϴ�.
 * �� �Ѱ��� key�� �Ѱ��� value�� ��Ī�˴ϴ�.
 * java.util ��Ű���� ���� ���յ��� ����ϱ� ���� interface��
 * class�� ���ǵǾ� �ֽ��ϴ�.
 * 
 * HashMap
 * HashMap�� Map Interface�� implements�� Ŭ������
 * �ߺ��� ������� �ʽ��ϴ�.
 * Map�� Ư¡�� Key-value�� �� ������ �����Ǿ� �ֽ��ϴ�.
 * Key �Ǵ� value������ null�� ����մϴ�.
 * 
 * 		
 */
		
		
		
		
		
		
		
	}
}
