package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int[] mbtiResult = new int[4];
	String[][] mbtiWorld = {
			{"E","I"}, {"S","N"}, {"F","T"}, {"J","P"}
	};
	System.out.println("���� ���ϴ� ���� �����Ѵ�. ������ 1 Ʋ���� 2");
	mbtiResult[0]=Integer.parseInt(sc.nextLine());
	System.out.println("���� �����ٴ� ������ ����. ������ 1 Ʋ���� 2");
	mbtiResult[1]=Integer.parseInt(sc.nextLine());
	System.out.println("���� �Ϻ��� ���ΰ��踦 �߿��ϰ� �����. ������ 1 Ʋ���� 2");
	mbtiResult[2]=Integer.parseInt(sc.nextLine());
	System.out.println("���� �������� ����� �߿��ϴ�. ������ 1 Ʋ���� 2");
	mbtiResult[3]=Integer.parseInt(sc.nextLine());
	String result = "";
	for(int i=0; i<mbtiResult.length;i++) {
		result+=mbtiWorld[i][mbtiResult[i]];
	}
	System.out.println("����"+result+"�Դϴ�");
	
}
}
