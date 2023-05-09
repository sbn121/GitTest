package pack02.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01_Hash {
	public static void main(String[] args) {
		//Collection자료구조는 <> 클래스타입만 넣을 수 있게 구조가 되어있음.
		//ArrayList< Class타입 뭐든 가능 > 이름 = new ..
		//해쉬코드 : 객체를 식별하는 하나의 정수값
//		String strHash1 = "hash1";
//		String strHash2 = "hash";
//		String strHash3 = new String("hash");
//		System.out.println(strHash1.hashCode());
//		System.out.println(strHash2.hashCode());
//		System.out.println(strHash3.hashCode());
		//↑(이론)데이터를 식별할 수 있는 해시코드를 기준으로 데이터를 저장하는 것(HashSet)
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("html");
		set.add("jsp/servlet");
		set.add("oracledb");
		set.add("java");	//HashSet은 해시코드로 비교하여 중복된 데이터가 있다면 마지막 데이터만 유지가 됨.
							//데이터 건수가 몇 건이 될까?
		System.out.println("내부에 들어있는 아이템 개수 : "+set.size());
		
		//HashSet자료구조는 index로 접근을 하는 게 아니라 요소별로 접근을 하는 것을 권장함.
		//여기 부분은 iterator라는 게 어떤 식으로 데이터를 빼오는지만 코드로 보고 외우거나 할 필요x
		Iterator<String> iterator = set.iterator(); //set자료구조를 탐색할 수 있는 기능을 가짐(반복자)
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		//반복횟수가 정확하게 정해지지 않거나 인덱스로 관리가 안될때는 '향상된 for문'이 편함
		for(String element : set) {
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
