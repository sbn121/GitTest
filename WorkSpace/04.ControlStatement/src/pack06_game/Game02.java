package pack06_game;

import java.util.Scanner;

public class Game02 {
public static void main(String[] args) {
	System.out.println("국어점수를 입력하세요 :");
	Scanner sc = new Scanner(System.in);
	String data1 =sc.nextLine();
	int scoKor = Integer.parseInt(data1);
	if(scoKor<0||scoKor>100) {
		System.out.println("다시 입력하세요");
	}
	System.out.println("영어점수를 입력하세요 :");
	String data2 =sc.nextLine();
	int scoEng = Integer.parseInt(data1);
	if(scoEng<0||scoEng>100) {
		System.out.println("다시 입력하세요");
	}
	System.out.println("수학점수를 입력하세요 :");
	String data3 =sc.nextLine();
	int scoMat = Integer.parseInt(data1);
	if(scoMat<0||scoMat>100) {
		System.out.println("다시 입력하세요");
	}
	System.out.println("총점 :"+(scoKor+scoEng+scoMat));
	System.out.println("평균 :"+(scoKor+scoEng+scoMat)/3);
}
}
