package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	public static void main(String[] args) {
		//사용 빈도가 없거나 매우 낮기 때문에 이론만 살펴보고 넘어감.
		//List라는 Interface를 상속받았기 때문에 기본 구조는 ArrayList, LinkedList, Vector 전부 비슷함.
		List<TestDTO> list = new Vector<TestDTO>();
//		TestDTO dto = null;
//		TestDTO dto1 = new TestDTO("FirstName", "LastName");
//		System.out.println(dto1.getFirstName());
//		list.add(dto);
//		list.add(dto1);
		list.add(new TestDTO("성", "이름"));
		System.out.println("FirstName : "+list.get(0).getFirstName());
		System.out.println("LastName : "+list.get(0).getLastName());
		
//		TestDTO[] arrDTOs = new TestDTO[1];
//		arrDTOs[0] = new TestDTO("성", "이름");
//		arrDTOs[1] = new TestDTO("성", "이름"); //오류 발생 배열의 크기가 1이기 때문에 불가능
//		System.out.println(arrDTOs[0].getFirstName());
	}
}
