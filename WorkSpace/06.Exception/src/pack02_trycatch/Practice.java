package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ���߱� ����");
		int level=0;
		int[] gameArray = new int[0];
		while(level<2) {
			try {
				System.out.println("���̵��� �������ּ���");
				level = Integer.parseInt(sc.nextLine());
				gameArray = new int[level];       
					}catch (Exception e) {
			
				}
		}
		String[] gameResults = new String[level];   
		for(int i = 0;i<gameResults.length;i++) {
			gameResults[i] = "?";
		}
		int random = new Random().nextInt(level);   
		
		gameArray[random] = 1;                      
		for(;;) {
			System.out.println("1���� " + gameArray.length +"������ ���� �Է�");
			for(int i = 0;i<gameResults.length;i++) {
				System.out.print(i+1+"["+gameResults[i] +"] ");
			}
			System.out.println();
			try {
			int userNum = Integer.parseInt(sc.nextLine())-1;
			if(gameArray[userNum]==1) {
				System.out.println("����");break;
			}else {
				gameResults[userNum] = "X";
				System.out.println("����");
			}
			} catch (Exception e) {
				System.out.println("�Է¿���"+"1���� " + gameArray.length +"������ ���� �Է�");
			}
		}
	}

}