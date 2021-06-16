package jun16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map02 {
	public static void main(String[] args) {
		//키는 String, 값은 10,20,30...
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
		
		
/* 정리
 * Map은 Key와 value를 가진 집합이며, 중복을 허용하지 않습니다.
 * 즉 한개의 key와 한개의 value가 매칭됩니다.
 * java.util 패키지에 여러 집합들을 사용하기 위한 interface와
 * class가 정의되어 있습니다.
 * 
 * HashMap
 * HashMap은 Map Interface를 implements한 클래스로
 * 중복을 허용하지 않습니다.
 * Map의 특징인 Key-value의 한 쌍으로 구성되어 있습니다.
 * Key 또는 value값으로 null을 허용합니다.
 * 
 * 		
 */
		
		
		
		
		
		
		
	}
}
