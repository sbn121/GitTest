package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test02_Game {
public static void main(String[] args) {
	//Test01_Game�̶�� Ŭ������ ����.
	// Scanner�� �̿��Ͽ� ���ڸ� �Է¹޴´�.
	//���ڴ� ������ ���̵��� �ȴ�.
	//ex)10�Է� => ���̵�10��.
	//���̵��� ũ�⸦ ���� �迭�� ����� �迭�� ������ �ε����� Ư���� �ٸ� ���� ����.
	//����ڴ� ���ĭ�� Ư���� ���� �����ִ��� ���ߴ� ����
	//new Random().nextInt(�ٿ����);//0~�ٿ���� ������ �����Ѽ�����
	
	//���� ) ����ڰ� 10�Է�
	// ���̵��� 10��.
	// �迭�� ���� [] [] [] [] [] [] [] [] [] []
	// �迭�� Ư���� �ε����� �����ϰ� �ٸ����� ���� [] [] [] [x ][ ][ ][ ][ ][ ] []
	//����ڰ� ���� �Է��� . 3=> ����
	// ����ڰ� ���� �Է��� . 4=> ����                                    ��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ���߱� ����");
		int level = 0;
		int[] gameArray = new int[0];
		while(level<2) {
			
			try {
				System.out.println("���̵��� �������ּ���");
		level = Integer.parseInt(sc.nextLine());//<-������ ���� �ڵ����� �˰�����
		gameArray = new int[level];           //<-[0] [0] [0]
			}catch (Exception e) {
			}
		}
		String[] gameResults = new String[level];   //<-[null] [null] [null]
		for(int i = 0;i<gameResults.length;i++) {
			gameResults[i] = "?";
		}
		int random = new Random().nextInt(level);   //<-0~2
		
		gameArray[random] = 1;                      //<-[1] [0] [0]
		for(;;) {
			try {
			System.out.println("1���� " + gameArray.length +"������ ���� �Է�");
			for(int i = 0;i<gameResults.length;i++) {
				System.out.print(i+1+"["+gameResults[i] +"] ");
			}
			System.out.println();
			
			int userNum = Integer.parseInt(sc.nextLine())-1;
			if(gameArray[userNum]==1) {
				System.out.println("����");break;
			}else {
				gameResults[userNum] = "X";
				System.out.println("����");
			}
			}catch (Exception e) {
				System.out.println("�Է� ����"+"1���� " + gameArray.length +"������ ���� �Է�");
			}
		}
	
	
	
	
	
	
}
}