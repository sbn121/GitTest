package pack06_game;

import java.util.Scanner;

public class Game02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int scoKor, scoEng, scoMat;
	
	while(true) {
		System.out.println("���� ������ �Է��ϼ���");
		scoKor = Integer.parseInt(sc.nextLine());
		if(scoKor>100||scoKor<0) {
			System.out.println("�ٽ� �Է��ϼ���");continue;
		}break;
	}
	while(true) {
		System.out.println("���� ������ �Է��ϼ���");
		scoEng = Integer.parseInt(sc.nextLine());
		if(scoEng>100||scoEng<0) {
			System.out.println("�ٽ� �Է��ϼ���");continue;
		}break;
	}
	while(true) {
		System.out.println("���� ������ �Է��ϼ���");
		scoMat = Integer.parseInt(sc.nextLine());
		if(scoMat>100||scoMat<0) {
			System.out.println("�ٽ� �Է��ϼ���");continue;
		}break;
	}
	System.out.println("���� :"+(scoKor+scoEng+scoMat));
	System.out.println("��� :"+(double)((scoKor+scoEng+scoMat)/3));
	
	
	
	
	
	
	
	
	
}
}