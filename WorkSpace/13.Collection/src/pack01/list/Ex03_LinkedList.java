package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03_LinkedList {
	public static void main(String[] args) {
		//사용빈도가 낮음. 인덱스끼리 체이닝(연결)구조를 가지고있어서 장점이 한 두가지있지만
		//실제 사용 용도로는 느리고 불편함.(눈으로 확인이 데이터 건수가 낮을 땐 식별불가.)
		
		//책 예제 : System.nanoTime();이라는 메소드를 이용해서 ArrayList vs LinkedList를 비교
		
		List<String> listArray = new ArrayList<String>();
		List<String> listLinked = new ArrayList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i =0;i<10000;i++) {
			listArray.add(0, i+""); //0번 인덱스에 끼워넣기 처리를 함. Linked가 끼워넣기에는 더 빠르다.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 작업 시간 : "+(endTime - startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i =0;i<10000;i++) {
			listLinked.add(0, i+""); //0번 인덱스에 끼워넣기 처리를 함. Linked가 끼워넣기에는 더 빠르다.
		}
		endTime = System.nanoTime();
		System.out.println("LinkLinked의 작업 시간 : "+(endTime - startTime)+"ns");
		
	}
}
