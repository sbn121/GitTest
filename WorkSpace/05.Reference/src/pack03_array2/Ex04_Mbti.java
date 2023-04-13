package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int[] mbtiResult = new int[4];
	String[][] mbtiWorld = {
			{"E","I"}, {"S","N"}, {"F","T"}, {"J","P"}
	};
	System.out.println("나는 말하는 것을 좋아한다. 맞으면 1 틀리면 2");
	mbtiResult[0]=Integer.parseInt(sc.nextLine());
	System.out.println("나는 숲보다는 나무를 본다. 맞으면 1 틀리면 2");
	mbtiResult[1]=Integer.parseInt(sc.nextLine());
	System.out.println("나는 일보다 대인관계를 중요하게 여긴다. 맞으면 1 틀리면 2");
	mbtiResult[2]=Integer.parseInt(sc.nextLine());
	System.out.println("나는 과정보다 결과가 중요하다. 맞으면 1 틀리면 2");
	mbtiResult[3]=Integer.parseInt(sc.nextLine());
	String result = "";
	for(int i=0; i<mbtiResult.length;i++) {
		result+=mbtiWorld[i][mbtiResult[i]];
	}
	System.out.println("나는"+result+"입니다");
	
}
}
