package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		//�迭�� ������ ������ ���� ����� ����
		//���� ������ �״��
		//��, ������� �Է��� �����ο �߸� �Է� �� "�߸��� �Է��Դϴ�. ���ڹ��� ?~?������ �Է����ּ���"
		//�� ������ ���α׷��� ������ ����Ǵ� ��찡 ����(���� ������)
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ã�� ������ �����մϴ�");
		int[] game =  new int[0];
		int dif= 0;
		while(game.length<2) {
			try {
				System.out.println("���̵�(2�̻��� �ڿ���)�� �Է����ּ���");
				dif = Integer.parseInt(sc.nextLine());	//���� ���� �� �Է� �� ����
				game = new int[dif];					//-�� �Է� �� ����
			
			}catch (Exception e) {
				
			}
		}
		String[] result = new String[dif];
			for(int i=0;i<result.length;i++) {
				result[i]="?";}
		int random = new Random().nextInt(dif);
		game[random]=1;
		while(true) {
			try {
			for(int i=0;i<result.length;i++) {
				System.out.print((i+1)+"["+result[i]+"]");
			}System.out.println();
			System.out.println("1~"+dif+"������ ���� �Է��ϼ���");
			int userNum = Integer.parseInt(sc.nextLine())-1;
			if(game[userNum]==1) {
				System.out.println("����");break;
			}else {
				result[userNum]="x";
				System.out.println("����");
			}
			}catch(Exception e) {
				System.out.println("�Է¿���"+"1~"+dif+"������ ���� �Է��ϼ���");
			}
		}
		
		
		
	}
}
