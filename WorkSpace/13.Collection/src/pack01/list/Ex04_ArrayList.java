package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		//���󵵰� ����. �迭�� ������ �����ϰ� ���ʿ��� ü�̴�, ��Ƽ������ ���� ����� ���� ������ ���� ���� ����.
		//List<E> list = new ArrayList<E>();
		//ArrayList<E> list = new ArrayList<E>();
		
		List<String> list1 = new ArrayList<>();
		list1.add("��");
		list1.add("��");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		
		List<Boolean> list3 = new ArrayList<>();
		list3.add(true);
		list3.add(false);
		
		//���� for��
		//for���� ������ �ٸ� : Collection�̳� �迭���� �ڷᱸ�� ���ο� Element�� �� �Ǿ� ���־, �������� ���� ����.
		//for(��� : �ڷᱸ��){ �˾Ƽ� �ڷᱸ���� ũ�⸸ŭ �ݺ��� �ϸ� ���� ���� ��ҿ� �������� �ϳ��� ���鼭 �ݺ���.
		
//	}
//		for(int i=0; i<=list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
		
		for(String str : list1) {		//java.lang.IndexOutOfBoundsException : ���� ���� ����
			System.out.println(str);	//��Ҹ� �ϳ��� �ش�Ÿ������ ���ֱ� ������ for������ �������� ����
		}								//���� �����̹Ƿ� �����ؼ� ���
		for(int i : list2) {
			System.out.println(i);
		}
		for(boolean b : list3) {
			System.out.println(b);
		}
		//��ü ���� ���
		
		
	}
}