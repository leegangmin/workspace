package jun16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map04 {
	public static void main(String[] args) {
		
		ArrayList<Map<String, Object>> list = 
				new ArrayList<Map<String,Object>>();
		
		Map<String, Object> in = new HashMap<String, Object>();
		in.put("제목", "제목");
		in.put("내용", "blablablablablab.a....");
		in.put("글쓴이", "poseidon");
		in.put("읽음", 100);
		in.put("날짜", "2021-06-15");
		
		list.add(in);
		
		in = new HashMap<String, Object>();
		in.put("제목", "제목2");
		in.put("내용", "bla");
		in.put("글쓴이", "admin");
		in.put("읽음", 5);
		in.put("날짜", "2021-06-14");
		
		list.add(in);
		
		in = new HashMap<String, Object>();
		in.put("제목", "제목3");
		in.put("내용", "bla3");
		in.put("글쓴이", "root");
		in.put("읽음", 1);
		in.put("날짜", "2021-06-13");
		
		list.add(in);
		
		System.out.println(list);
		
		//출력
		System.out.println("번호 \t 제목 \t 글쓴이 \t 읽음 \t 날짜");
		System.out.println("----------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + "\t");
			System.out.print(list.get(i).get("제목") + "\t");
			System.out.print(list.get(i).get("글쓴이") + "\t");
			System.out.print(list.get(i).get("읽음") + "\t");
			System.out.print(list.get(i).get("날짜") + "\n");
		}
		System.out.println("----------------------------------");

		
		Iterator<Map<String, Object>> it = list.iterator();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
