package pack02_trycatch;

public class Ex02_TryCatchFinally {
	public static void main(String[] args) {
	//�丮 : ������ on, �丮 ����, �丮 ��, ������ off, �Ա�(����)
	try {
		System.out.println("������ on");
		System.out.println("�丮 ����");
		int errorInt = 10/0;	//�丮�ϴ� ���� ���� ����(����)
//		System.out.println("�丮 ��");
//		System.out.println("������ off");
//		System.out.println("�Ա�(����)");
	}catch (Exception e) {
		System.out.println("���� �߻�");
	}finally {
		//�ݵ�� ����Ǿ�� �ϴ� ����(�ڵ�)�� �ִٸ� �־��ִ� �κ�
		System.out.println("�丮 ��");
		System.out.println("������ off");
		System.out.println("�Ա�(����)");
	}
	
	}
}