package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		//ex) ����ڰ� � ������ ���� �� ������ ����Ǵ� �� == ����
		//��vs��ǻ��
//		System.out.println("�ֻ��� ������ �����մϴ�.");
//		System.out.println("-1�� �Է��ϸ� �����մϴ�.  �� �ܿ��� ����");
//		Scanner sc = new Scanner(System.in);
//		String inputData = sc.nextLine();
//		int dice = Integer.parseInt(inputData);
//		if(dice==-1) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ֻ��� ������ �����մϴ�");
//		}
//			System.out.println("����ڰ� �ֻ����� ���� �����Դϴ�.(������ ENTER)");
//		sc.nextLine();//enter key�� ���� ������ ���
//		              //(���⼭ ���� �Է� �����ʹ� ����x)
//		int userNum = (int) (Math.random()*6)+1;//1~6������ �� �����ϰ� �̴� ���(method)
//		System.out.println("������� ��:"+userNum);
//		System.out.println("��ǻ�Ͱ� �ֻ����� �����ϴ�.(���� ENTER)");
//		sc.nextLine();
//		int comNum = (int) (Math.random()*6)+1;
//		System.out.println("��ǻ���� ��" + comNum);
//		if(comNum>userNum) {
//			System.out.println("��ǻ���� ��" + comNum + "������ ��" + userNum +
//					"��ǻ�� ��");
//		}else if(comNum<userNum) {
//			System.out.println("��ǻ���� ��" + comNum + "������ ��" + userNum +
//					"���� ��");
//		}else {
//			System.out.println("��ǻ���� ��" + comNum + "������ ��" + userNum +
//					"���º�");
//		}
		System.out.println("�ֻ��� ������ �����մϴ�");
			System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int inputData=-1;
		while(inputData==-1) {
			inputData = Integer.parseInt(sc.nextLine());
			if(inputData==-1) {
				System.out.println("����");
			inputData=-1;
		}else {
			System.out.println("����ڰ� �ֻ����� ���� �����Դϴ�.(������ ENTER)");
		}
		sc.nextLine();
		int userNum = (int) (Math.random()*6)+1;
		System.out.println("������� �� : "+userNum);
		System.out.println("��ǻ�Ͱ� �ֻ����� ���� �����Դϴ�.(������ ENTER)");
		sc.nextLine();
		int comNum = (int) (Math.random()*6)+1;
		if(userNum<comNum) {
			System.out.println("������� �� : "+userNum);
			System.out.println("��ǻ���� �� : "+comNum);
			System.out.println("��ǻ�� �¸�");
		}else if(userNum>comNum) {
			System.out.println("������� �� : "+userNum);
			System.out.println("��ǻ���� �� : "+comNum);
			System.out.println("����� �¸�");
		}else {
			System.out.println("������� �� : "+userNum);
			System.out.println("��ǻ���� �� : "+comNum);
			System.out.println("���º�");
		}
		
		
		
		
		
		
		
		
	}

	}
}