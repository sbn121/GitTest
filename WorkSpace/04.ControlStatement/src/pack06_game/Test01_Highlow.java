package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_Highlow {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);    //����ڿ��� �Է¹ޱ� ���� ��ĳ��
	int random = new Random().nextInt(100)+1;//������ �� ä��
	//for���� �̿��ؼ� ���ѷ��� ������.
//	for(int i=0;i<5;i++) {
//		i=0; //ù��° ���:i�� �����ص� �ٽ� 0���� ���ڸ� �ٲ㼭 ����ؼ� �ݺ��ϰ� �Ѵ�.
//	}
//	for(int i=0;i<1;i--) {
//		//i�� ���ҽ�Ŵ
//	}
	System.out.println("high-low������ �����մϴ�");
	System.out.println("1~100������ ������ �Է��ϼ���");
	int count = 0;
	for(;;) { //while(true)�� ����
		count++;
		int userNum = Integer.parseInt(sc.nextLine());
		if(userNum==random) {
			System.out.println("����");
			break;
		}else if(userNum<random) {
			System.out.println("�� ū ���� �Է��ϼ���");
		}else {
			System.out.println("�������Է�");
		}
		
	}
	System.out.println("�õ� Ƚ���� "+count+"�� �Դϴ�");
	
	
	
	
	
	Scanner sc = new Scanner(System.in);
	int comNum = new Random().nextInt(100)+1;
	int count = 0;
	for(;;) {
		count++;
		int userNum = Integer.parseInt(sc.nextLine());
		if(comNum>userNum) {
			System.out.println("�� ū ���� �Է��ϼ���");}
		else if(comNum<userNum) {
			System.out.println("�� ���� ���� �Է��ϼ���");}
		else {
			System.out.println("����");break;}
		}
	System.out.println("�õ� Ƚ���� "+count+"�� �Դϴ�");
}
}
