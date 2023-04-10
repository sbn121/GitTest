package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_Highlow {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);    //사용자에게 입력받기 위한 스캐너
	int random = new Random().nextInt(100)+1;//랜덤한 수 채번
	//for문을 이용해서 무한루프 만들어보기.
//	for(int i=0;i<5;i++) {
//		i=0; //첫번째 방법:i가 증가해도 다시 0으로 숫자를 바꿔서 계속해서 반복하게 한다.
//	}
//	for(int i=0;i<1;i--) {
//		//i를 감소시킴
//	}
	System.out.println("high-low게임을 시작합니다");
	System.out.println("1~100사이의 정수를 입력하세요");
	int count = 0;
	for(;;) { //while(true)와 같음
		count++;
		int userNum = Integer.parseInt(sc.nextLine());
		if(userNum==random) {
			System.out.println("정답");
			break;
		}else if(userNum<random) {
			System.out.println("더 큰 수를 입력하세요");
		}else {
			System.out.println("작은수입력");
		}
		
	}
	System.out.println("시도 횟수는 "+count+"번 입니다");
	
	
	
	
	
	Scanner sc = new Scanner(System.in);
	int comNum = new Random().nextInt(100)+1;
	int count = 0;
	for(;;) {
		count++;
		int userNum = Integer.parseInt(sc.nextLine());
		if(comNum>userNum) {
			System.out.println("더 큰 수를 입력하세요");}
		else if(comNum<userNum) {
			System.out.println("더 작은 수를 입력하세요");}
		else {
			System.out.println("정답");break;}
		}
	System.out.println("시도 횟수는 "+count+"번 입니다");
}
}
