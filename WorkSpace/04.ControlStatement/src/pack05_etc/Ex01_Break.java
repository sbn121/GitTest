package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
public static void main(String[] args) {
	//break���� ����� �����ϰ� ���������� ���
	//���ѷ����ϴ� �ݺ��� �ؿ� �ڵ尡 ������ ����.(������ ����x�ڵ�)
//	while(true) {
//		while(true) {
//			break;     //�ϳ��� ����� �ش���
//		}
//		break;
//	}
	//���ѷ����� ����� ���� ���Ḧ ���� ���� ����ǰ� �����.
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt(sc.nextLine());
	while(true) {
		if(num==-1) {
			System.out.println("����");
			break;
		}else if(num==1) {
			System.out.println("1��");
			break;
		}
	System.out.println("������");
	}//while
//	System.out.println("���");
	Scanner sc1 = new Scanner(System.in);
	int i = Integer.parseInt(sc1.nextLine());
	while(true) {
		if(i>=0&&i%i==0) {
			System.out.println("���");
			break;
		}else if(i<0&&i%i==0){
			System.out.println("����");
			break;
		}
		System.out.println("������ �Է��ϼ���");
	}
	
	
	
	
	
	
	
}
}