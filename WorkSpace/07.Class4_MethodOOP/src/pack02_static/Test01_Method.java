package pack02_static;

import java.util.Scanner;

public class Test01_Method {
	
	boolean login(String id, String pw) {
		
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("�α��� ����");
			return true;
		}else {
			System.out.println("�α��� ����");
			return false;
		}
	}
	
	Scanner method() {
		return new Scanner(System.in);
	}
	
	
}
