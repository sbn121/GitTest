package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int kor = -1, eng= -1, mat = -1; //-1�̸� �Է�x����
	System.out.println("���� ������ �Է����ּ���");
	while(kor==-1) {//�ʱ⿡ -1�� ���� �ʱ�ȭ�Ǿ��ֱ� ������ �ʱ�ȭ�� �� ���¿����� ����
		kor = Integer.parseInt(sc.nextLine());//0~100�� �Է°����ϰ�
		if(kor>0&&kor<=100) {
			System.out.println("������Է¿Ϸ�");
		}else {
			System.out.println("�߸��Է�, 1~100�� �Է°���");
			kor=-1;
		}
	}//while kor
	System.out.println("���� ������ �Է����ּ���");
	while(eng==-1) {//�ʱ⿡ -1�� ���� �ʱ�ȭ�Ǿ��ֱ� ������ �ʱ�ȭ�� �� ���¿����� ����
		eng = Integer.parseInt(sc.nextLine());//0~100�� �Է°����ϰ�
		if(eng>0&&eng<=100) {
			System.out.println("������Է¿Ϸ�");
		}else {
			System.out.println("�߸��Է�, 1~100�� �Է°���");
			eng=-1;
		}
	}
	System.out.println("���� ������ �Է����ּ���");
	while(mat==-1) {//�ʱ⿡ -1�� ���� �ʱ�ȭ�Ǿ��ֱ� ������ �ʱ�ȭ�� �� ���¿����� ����
		mat = Integer.parseInt(sc.nextLine());//0~100�� �Է°����ϰ�
		if(mat>0&&mat<=100) {
			System.out.println("���м����Է¿Ϸ�");
		}else {
			System.out.println("�߸��Է�, 1~100�� �Է°���");
			mat=-1;
		}
	}
	System.out.println("���� ���� : "+kor);
	System.out.println("���� ���� : "+eng);
	System.out.println("���� ���� : "+mat);
	
	Scanner sc = new Scanner(System.in);
	int kor = -1, eng = -1, mat = -1;
	System.out.println("���� ������ �Է��ϼ���");
	while(kor==-1) {
		int kor = Integer.parseInt(sc.nextLine());
		if(kor>100||kor<=0) {
			System.out.println("1~100�� ���� �Է��ϼ���");
			kor = -1;
		}else {
			System.out.println("���� ���� �Է��� �Ϸ�Ǿ����ϴ�");
		}
	}
	System.out.println("���� ������ �Է��ϼ���");
	while(eng==-1) {
		int eng = Integer.parseInt(sc.nextLine());
		if(eng>100||eng<=0) {
			System.out.println("1~100�� ���� �Է��ϼ���");
			eng = -1;
		}else {
			System.out.println("���� ���� �Է��� �Ϸ�Ǿ����ϴ�");
		}
	}
	System.out.println("���� ������ �Է��ϼ���");
	while(mat==-1) {
		int mat = Integer.parseInt(sc.nextLine());
		if(mat>100||mat<=0) {
			System.out.println("1~100�� ���� �Է��ϼ���");
			mat = -1;
		}else {
			System.out.println("���� ���� �Է��� �Ϸ�Ǿ����ϴ�");
		}
	}
	System.out.println("���� ���� : "+kor);
	System.out.println("���� ���� : "+eng);
	System.out.println("���� ���� : "+mat);
	System.out.println("���� : "+(kor+eng+mat));
	System.out.println("��� : "+(double)((kor+eng+mat)/3));
	
	
	
	
	
	
	
	
}
}
