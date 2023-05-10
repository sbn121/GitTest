package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
	public static void main(String[] args) {
		//Collection Framework
		//Collection : �ڷḦ �����ؼ� ������ ���� �� �ִ� ����� ���� �ڷᱸ��(Ŭ����, �迭)
		//Framework : � �����̳� ����� �̸� ���� ����ϰ� ����� ���� ��(����) ex)������vs�޹�
		//List<Extends Object> list = new ... <>();
		//List�� Object�� ��ӹ��� ��ü Ÿ�Ը� �����͸� �����ϰ� �س���(Ŭ����)
		//List< ���� ������ Ÿ��(DTO) > list = new �ڷᱸ��Ÿ��(...);
		//List<E> ���� E�� ���(Element) : � ������ ���ο� ������ �������
		
		List<String> list = new ArrayList<String>(); //ArrayList�� Ex03~04���� ��뿹��
		list.add("Java1"); //List�� StringŸ���� �������� ����� �Ǿ��ֱ� ������ String�� ��ҷ� ���� �� ����.
		list.add("Java2");
		list.add("Java3");
		list.add("Java4");
		list.add("Java5");
		list.add("Java6");
		list.add(3, "�����ֱ�"); //��� ���� : ��� : �޼ҵ尡 �Ķ���ͳ� Ÿ�� �ٸ��� �Ȱ��� �̸� ���� ��
								 //�� ������(DB���� �����ؿ� ������ ���ռ��� ������ �ֱ� ����)
//		System.out.println(list.size()); //�迭�� arr.length��� ������ ũ�⸦ �޾ƿ� �� ����.
//		System.out.println(list.get(0)); //list�� �迭�� ���������� 0���� �����ؼ� ũ�� -1������ index�� ����
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}