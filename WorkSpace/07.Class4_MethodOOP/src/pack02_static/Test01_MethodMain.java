package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
//		Test01_Method tm = new Test01_Method();
//		System.out.println("���̵�� ��й�ȣ�� ���ʷ� �Է��ϼ���");
//		System.out.println(tm.login(tm.method().nextLine(), tm.method().nextLine()));
		
		Test01_Method tm = new Test01_Method();
		System.out.println("���̵� �Է��ϼ���");
		String id = tm.method().nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String pw = tm.method().nextLine();
		System.out.println(id + " : "+pw);
		
		
		if(tm.login(id, pw)) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ���� ���̵�� ��й�ȣ�� �ٽ� Ȯ���ϼ���");
		}
		
	}
}
