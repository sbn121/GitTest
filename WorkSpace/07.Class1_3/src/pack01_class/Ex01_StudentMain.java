package pack01_class;

import java.util.Scanner;

public class Ex01_StudentMain {
	public static void main(String[] args) {
		//��� Ŭ������ �츮�� ����ó�� �޸𸮿� �ø��� ����� ������ ��<-
		//Ŭ������ �ʱ�ȭ��
		//��ü���� : �� �� �� �������� ����� ����ؼ� ��Ȱ���� �� �ְ� ��.
		//�� �������� ����� ���������� ����ϱ� ������ ��� �߰��� �ϳ��� Ŭ�������� �ص� ����������
		//��� ����޴� ��.
		
//		Scanner sc = new Scanner(System.in);//��ĳ��(��ü) ����ڿ��� � ���� �ܼ�â�� ���ؼ� �Է¹޾ƿ���
//											//'���'�� ���� ��ü
		Ex01_Student es1 = new Ex01_Student();
		es1.����="12";
		es1.�̸�="���л�";
		es1.����="����";
		es1.study();
		Ex01_Student es2 = new Ex01_Student();
		es2.����="12";
		es2.�̸�="�ۺ���";
		es2.����="����";
		es2.study();
		System.out.println(es1.����+es1.�̸�+es1.����);
		System.out.println(es2.����+es2.�̸�+es2.����);
		System.out.println("es1 ������ Student ��ü�� �����մϴ�"+es1);
		
//		es1 = null;
//		Ex01_Student es2 = null;
//		
//		if(es1==es2) {
//			System.out.println("?"+es1+"/"+es2);
//		}else {
//			System.out.println("������ �ٸ�");
//		}
		
		
	}
}