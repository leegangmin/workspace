package jun16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 			Collection		      Map
 * 
 * 			List   	Set
 * 
 * ArrayList  		  HashSet     HashMap
 * 
 * List 순서 O, 중복 O
 * Set  순서 X, 중복 X
 * Map  키-값 형태로 저장합니다.
 * 		키는 중복X, 값은 중복 O
 */
public class Map01 {
	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "홍길동");
		map.put("2", "김길동");
		map.put("3", "김길동");
		map.put("1", "홍길동2");
		
		//{1=홍길동2, 2=김길동, 3=김길동}
		System.out.println(map);
		System.out.println(map.size());
		
		//String result = map.get("1");
		System.out.println(map.get("1"));
		
		//Set<String> set = map.keySet();
		//System.out.println(set);//[1, 2, 3]
		
		List<String> list = new ArrayList<String>(map.keySet());
		System.out.println(list);//[1, 2, 3]
		
		for (int i = 0; i < map.size(); i++) {
			System.out.print(list.get(i) + " : ");
			System.out.println(map.get(list.get(i)));
		}//map -> set -> list -> for
		
		
		//map -> set -> iterator
		//Iterator<String> it = map.keySet().iterator();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
			String key = it.next();
			System.out.print(key + " : ");
			System.out.println(map.get(key));
		}
		
		
		//map -> set -> foreach
		for (String str : map.keySet()) {
			System.out.print(str + " : ");
			System.out.println(map.get(str));
		}
		//Entry : map 데이터를 key value 한쌍씩 뽑아내기 
		//해당 map에 담겨있는 key value의 연결들(mapping)을 반환
		for (Map.Entry<String, String> ele : map.entrySet()) {
			System.out.print(ele.getKey() + " = ");
			System.out.println(ele.getValue());
		}
		
		//배열로 변환
		//Set<String> set04 = map.keySet();
		//Object[] keyArray = set04.toArray();
		Object[] keyArray = map.keySet().toArray();
		
		for (int i = 0; i < keyArray.length; i++) {
			//System.out.println(keyArray[i]);
			String key = (String) keyArray[i];
			System.out.println(key + " = " + map.get(key));
		}
		//map -> set -> Array -> for
		
		
		
	}
}
