package pack02_static;

import java.util.Scanner;

public class Test01_Method {
	
//	boolean isLogin(String id, String pw) {
//		
//		if(id.equals("master")&pw.equals("master1234")) {
//			System.out.println("�α��� ����");
//			return true;
//		}else {
//			System.out.println("�α��� ����");
//			return false;
//		}
//	}
//	
//	Scanner method() {
//		return new Scanner(System.in);
//	}
	
	//����Ÿ���� �� ������ �� �� ��. void(��ȯ����)
	private static final String Scanner = null;

	boolean login(String id, String pw) {
		//Test01_MethodMain�̶�� �ܺ� Ŭ�������� �Է¹��� id�� pw�� ���� ���ϴ� ���� ��ġ�ϴ��� ���θ� �Ǵ�
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("���� ��ġ");
			return true;
		}else {
			System.out.println("���� ����ġ");
			return false;
		}
	}	
		Scanner method() {
			return new Scanner(System.in);
		}
		
		
		
		
	
	
}
