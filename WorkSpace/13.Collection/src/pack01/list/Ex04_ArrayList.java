package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		//사용빈도가 높음. 배열의 단점을 보완하고 불필요한 체이닝, 멀티쓰레딩 등의 기능이 없기 때문에 제일 많이 사용됨.
		//List<E> list = new ArrayList<E>();
		//ArrayList<E> list = new ArrayList<E>();
		
		List<String> list1 = new ArrayList<>();
		list1.add("가");
		list1.add("나");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		
		List<Boolean> list3 = new ArrayList<>();
		list3.add(true);
		list3.add(false);
		
		//향상된 for문
		//for문과 구조가 다름 : Collection이나 배열등의 자료구조 내부에 Element를 한 건씩 빼주어서, 가독성을 높인 구조.
		//for(요소 : 자료구조){ 알아서 자료구조의 크기만큼 반복을 하며 기준 왼쪽 요소에 아이템을 하나씩 빼면서 반복함.
		
//	}
//		for(int i=0; i<=list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
		
		for(String str : list1) {		//java.lang.IndexOutOfBoundsException : 나올 일이 없음
			System.out.println(str);	//요소를 하나씩 해당타입으로 빼주기 때문에 for문보다 가독성이 높음
		}								//개인 취향이므로 선택해서 사용
		for(int i : list2) {
			System.out.println(i);
		}
		for(boolean b : list3) {
			System.out.println(b);
		}
		//전체 내용 출력
		
		
	}
}
