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
		in.put("����", "����");
		in.put("����", "blablablablablab.a....");
		in.put("�۾���", "poseidon");
		in.put("����", 100);
		in.put("��¥", "2021-06-15");
		
		list.add(in);
		
		in = new HashMap<String, Object>();
		in.put("����", "����2");
		in.put("����", "bla");
		in.put("�۾���", "admin");
		in.put("����", 5);
		in.put("��¥", "2021-06-14");
		
		list.add(in);
		
		in = new HashMap<String, Object>();
		in.put("����", "����3");
		in.put("����", "bla3");
		in.put("�۾���", "root");
		in.put("����", 1);
		in.put("��¥", "2021-06-13");
		
		list.add(in);
		
		System.out.println(list);
		
		//���
		System.out.println("��ȣ \t ���� \t �۾��� \t ���� \t ��¥");
		System.out.println("----------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("�۾���") + "\t");
			System.out.print(list.get(i).get("����") + "\t");
			System.out.print(list.get(i).get("��¥") + "\n");
		}
		System.out.println("----------------------------------");

		
		Iterator<Map<String, Object>> it = list.iterator();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
