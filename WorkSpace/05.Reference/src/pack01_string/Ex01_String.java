package pack01_string;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
	//String : �⺻�� ����x, ������ ����
	//������ ������ �����̶�� �޸� ������ �� ������ �ּҸ� �����ϰ� ���� ����
	//�� ������ �ִ� ����. (�⺻�� ������ �� ���� ���x)
	String strVar1 = "SBN";//�޸� �ּ� 1
	String strVar2 = "SBN";//�޸� �ּ� 1
	if(strVar1==strVar2) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	System.out.println(strVar1==strVar2 ? "true" : "false");
	//new<-�� ������ ������ �����. (�ν��Ͻ� ����)
	String strVar3 = new String("SBN");
	String strVar4 = new String("SBN");
	
	Scanner sc = new Scanner(System.in);
	String strVar5 = sc.nextLine();
	if(strVar1==strVar5) {
		System.out.println("strVar1==strVar5");
	}else if(strVar3 == strVar5) {
		System.out.println("strVar3==strVar5");
	}else {
		System.out.println("strVar1!=strVar3!=strVar5");
	}
	System.out.println(strVar3==strVar4 ? "true" : "false");
	
	
		
		
		
}
}
