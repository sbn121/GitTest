package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	void v1() {
		System.out.println("v1");
	}
	void v2(String data) {
		if(data==null) {
			return;//�޼ҵ带 ������Ű�� ����ŷ ������ �̵�(��������).
		}
		System.out.println("v2"+data);
	}
	boolean isB1() {
		System.out.println("isB1");
		return true;
	}
	boolean isB2(int data) {
		System.out.println("isB2");
		return false;
	}
	String sMethod() {
		return "";
	}
	double dMethod() {
		return 1.0;
	}
	int[] aMethod() {
		return new int[1];
	}
	Scanner scanMethod() {
		return new Scanner(System.in);
//		return null; ->�ش� �޼ҵ带 �̿��ؼ� ��ĳ�� ��� ��� �� NullPointerException�߻�
	}
	
	
	
}