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
	
}
}
