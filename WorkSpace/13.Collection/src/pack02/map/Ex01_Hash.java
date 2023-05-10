package pack02.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01_Hash {
	public static void main(String[] args) {
		//Collection�ڷᱸ���� <> Ŭ����Ÿ�Ը� ���� �� �ְ� ������ �Ǿ�����.
		//ArrayList< ClassŸ�� ���� ���� > �̸� = new ..
		//�ؽ��ڵ� : ��ü�� �ĺ��ϴ� �ϳ��� ������
//		String strHash1 = "hash1";
//		String strHash2 = "hash";
//		String strHash3 = new String("hash");
//		System.out.println(strHash1.hashCode());
//		System.out.println(strHash2.hashCode());
//		System.out.println(strHash3.hashCode());
		//��(�̷�)�����͸� �ĺ��� �� �ִ� �ؽ��ڵ带 �������� �����͸� �����ϴ� ��(HashSet)
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("html");
		set.add("jsp/servlet");
		set.add("oracledb");
		set.add("java");	//HashSet�� �ؽ��ڵ�� ���Ͽ� �ߺ��� �����Ͱ� �ִٸ� ������ �����͸� ������ ��.
							//������ �Ǽ��� �� ���� �ɱ�?
		System.out.println("���ο� ����ִ� ������ ���� : "+set.size());
		
		//HashSet�ڷᱸ���� index�� ������ �ϴ� �� �ƴ϶� ��Һ��� ������ �ϴ� ���� ������.
		//���� �κ��� iterator��� �� � ������ �����͸� ���������� �ڵ�� ���� �ܿ�ų� �� �ʿ�x
		Iterator<String> iterator = set.iterator(); //set�ڷᱸ���� Ž���� �� �ִ� ����� ����(�ݺ���)
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		//�ݺ�Ƚ���� ��Ȯ�ϰ� �������� �ʰų� �ε����� ������ �ȵɶ��� '���� for��'�� ����
		for(String element : set) {
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}