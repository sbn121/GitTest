package pack03_constructor;

public class BagMain {
	public static void main(String[] args) {
		Bag b = new Bag("��",2);
		b.���� = true;
		b.�ָӴϰ��� = 5;
		System.out.println("������ ���� : "+b.����);
		System.out.println("������ �� ���� : "+b.���������);
		System.out.println("������ ���� ���� : "+(b.����==true ? "��" : "��"));
		System.out.println("������ �ָӴ� ���� : "+b.�ָӴϰ���);
	}
}