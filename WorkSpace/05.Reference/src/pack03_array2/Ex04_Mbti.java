package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int[] mbtiResult = new int[4];
	String[][] mbtiWorld = {
			{"E","I"}, {"S","N"}, {"F","T"}, {"J","P"}
	};
	System.out.println("���� ���ϴ� ���� �����Ѵ�. ������ o Ʋ���� x");
	mbtiResult[0]=Integer.parseInt(sc.nextLine()=="o"?"0":"1");
	System.out.println("���� �����ٴ� ������ ����. ������ o Ʋ���� x");
	mbtiResult[1]=Integer.parseInt(sc.nextLine()=="o"?"0":"1");
	System.out.println("���� �Ϻ��� ���ΰ��踦 �߿��ϰ� �����. ������ o Ʋ���� x");
	mbtiResult[2]=Integer.parseInt(sc.nextLine()=="o"?"0":"1");
	System.out.println("���� �������� ����� �߿��ϴ�. ������ o Ʋ���� x");
	mbtiResult[3]=Integer.parseInt(sc.nextLine()=="o"?"0":"1");
	String result = "";
	for(int i=0; i<mbtiResult.length;i++) {
		result+=mbtiWorld[i][mbtiResult[i]];
	}
	System.out.println("����"+result+"�Դϴ�");
	
}
}
