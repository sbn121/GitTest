package pack02.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex02_HashMap {
	public static void main(String[] args) {
		// Map �÷����� <Class, Class> : Ŭ���� Ÿ���� �� ���� ��.
		// ù ���� ���� �����͸� �ĺ��ϱ� ���� Ű ���̰�, �� ��° ���� �������̴�.
		//Map<K, V> Key, Value �ǹ�
		Map<String, Integer> map = new HashMap<>();
		map.put("�ſ��", 95);
		map.put("ȫ�浿", 50);
		map.put("�Ӳ���", 60);
		map.put("�ſ��", 100);
		//Key�� �����͸� �����ϰ� �ĺ��� �� �ִ� ���̾�� �Ѵ�. ex)���������� �ִ� ��� key�ν� ����� ���
		System.out.println("map Entry(��ü) �� : "+map.size());
		
		System.out.println("�ſ���� ���� : "+map.get("�ſ��"));
		// ${map.data}
		//�ڹ��ڵ�� �����͸� ���� ���� ���� ����
		//������ �� ���� Ȯ���ϰ� �Ѿ�� ��.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : "+key+" value : "+value);
		}
		
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("key : "+key+" value : "+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}