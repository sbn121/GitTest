package pack02_static;

import java.awt.im.spi.InputMethod;

public class Ex01_Static {
	//static�� ���ο� ���� ����� �����Ѵ�.
	//static�� ���ο� ���� �޸𸮿� �ö󰡴� ������ �ٸ���.
	//��� : Ŭ������ ���->Ŭ������ �߰�ȣ ���̿� �ִ� ��� �͵�.
	
	static void sMethod() {
		Ex01_Static es = new Ex01_Static();
		System.out.println("����ƽ ����Դϴ�.");
		es.iMethod();//���� �Ұ�
	}
	
	void iMethod2() {
		iMethod();//�ν��Ͻ�(���� ����)
		sMethod();//����ƽ(���� ����)
	}
	
	//static : ���α׷� ���� ���� ���� �޸𸮿� �Ҵ�, ���α׷� ���� �� �Ҹ�
	//instance : �ν��Ͻ�ȭ ���� �Ŀ� �޸𸮿� �Ҵ�, ���α׷� ���� �� �Ҹ�
	//�ν��Ͻ�{����ƽ, �ν��Ͻ�}, ����ƽ{����ƽ}<-�ν��Ͻ�ȭ ���� �ʿ�x
	//����ƽ{�ν��Ͻ�}<-�ν��Ͻ�ȭ ���� �ʿ�
	
	//(instance)�ν��Ͻ� ���
	void iMethod() {
		System.out.println("�ν��Ͻ� ����Դϴ�.");
	}
	
	//static ���
	public static void main(String[] args) {
//		Ex01_Static es = new Ex01_Static();
//		es.iMethod();
		sMethod();
		if(true) {
			Ex01_Static es = new Ex01_Static();
			es.iMethod();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
