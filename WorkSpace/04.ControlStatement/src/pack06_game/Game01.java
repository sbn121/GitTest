package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
public static void main(String[] args) {
	int comNum = new Random().nextInt(100)+1;
	int count = 0;
	while(true) {
		count++;
		System.out.println("1���� 100������ ������ �Է��ϼ��䢺");
		Scanner sc = new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
	if(comNum>userNum) {
			System.out.println("�� ū ���� �Է��ϼ���!");
		}else if(comNum<userNum) {
			System.out.println("�� ���� ���� �Է��ϼ���!");
		}else {
			System.out.println("������ϴ�!");break;
		}
	
	}
	System.out.println("�õ� Ƚ����:"+count+"��");
	
		
		
		
}
}