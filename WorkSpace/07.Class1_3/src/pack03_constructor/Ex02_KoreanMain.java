package pack03_constructor;

public class Ex02_KoreanMain {
	public static void main(String[] args) {
		Ex02_Korean ek = new Ex02_Korean("�ۺ���","132123-1234567");
		//������ �������� ���ռ� : �̸��� �ֹε�Ϲ�ȣ�� ���� ������(��ü)�ϳ��� �����ϸ� �� �� 
		System.out.println(ek.nation);
		System.out.println(ek.name);
		System.out.println(ek.ssn);
	}

}