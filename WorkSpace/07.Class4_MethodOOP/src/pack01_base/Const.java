package pack01_base;

public class Const {
//������ <-��ü(Object) : �츮�� ����� �ִ� ��� Ŭ����
//��� Ŭ������ Object�κ��� ���������
	
	//�ݵ�� �ʿ��� ������ �ִٸ� ��ü ���� �� �ش��ϴ� ������ ������ �����ϱ� ���ؼ� �ʿ���.
	int field;
	
	public Const(int field) {//������ ������ '�޼ҵ�'�� ������ ������ class�� �̸����� ������ �޼ҵ尡 �����Ѵ�.
		//�޼ҵ��ε� Ŭ������ �̸��� ������ �Ȱ��� �� > Ŭ������ �������·� �ν��Ͻ�ȭ�� �� ����ϴ� �޼ҵ�
		this.field = field;
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Const con = new Const(10);//ȣ��(�ҷ��� ����)
		System.out.println(con.sum(10, 20));
	}
}