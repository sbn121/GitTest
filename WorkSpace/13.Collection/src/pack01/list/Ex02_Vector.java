package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	public static void main(String[] args) {
		//��� �󵵰� ���ų� �ſ� ���� ������ �̷и� ���캸�� �Ѿ.
		//List��� Interface�� ��ӹ޾ұ� ������ �⺻ ������ ArrayList, LinkedList, Vector ���� �����.
		List<TestDTO> list = new Vector<TestDTO>();
//		TestDTO dto = null;
//		TestDTO dto1 = new TestDTO("FirstName", "LastName");
//		System.out.println(dto1.getFirstName());
//		list.add(dto);
//		list.add(dto1);
		list.add(new TestDTO("��", "�̸�"));
		System.out.println("FirstName : "+list.get(0).getFirstName());
		System.out.println("LastName : "+list.get(0).getLastName());
		
//		TestDTO[] arrDTOs = new TestDTO[1];
//		arrDTOs[0] = new TestDTO("��", "�̸�");
//		arrDTOs[1] = new TestDTO("��", "�̸�"); //���� �߻� �迭�� ũ�Ⱑ 1�̱� ������ �Ұ���
//		System.out.println(arrDTOs[0].getFirstName());
	}
}
