package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		//ex) 사용자가 어떤 동작을 했을 때 게임이 진행되는 것 == 조작
		//나vs컴퓨터
//		System.out.println("주사위 게임을 시작합니다.");
//		System.out.println("-1을 입력하면 종료합니다.  그 외에는 시작");
//		Scanner sc = new Scanner(System.in);
//		String inputData = sc.nextLine();
//		int dice = Integer.parseInt(inputData);
//		if(dice==-1) {
//			System.out.println("종료");
//		}else {
//			System.out.println("주사위 게임을 시작합니다");
//		}
//			System.out.println("사용자가 주사위를 굴릴 차례입니다.(굴리기 ENTER)");
//		sc.nextLine();//enter key를 누를 때까지 대기
//		              //(여기서 나온 입력 데이터는 쓸모x)
//		int userNum = (int) (Math.random()*6)+1;//1~6까지의 수 랜덤하게 뽑는 기능(method)
//		System.out.println("사용자의 수:"+userNum);
//		System.out.println("컴퓨터가 주사위를 굴립니다.(진행 ENTER)");
//		sc.nextLine();
//		int comNum = (int) (Math.random()*6)+1;
//		System.out.println("컴퓨터의 수" + comNum);
//		if(comNum>userNum) {
//			System.out.println("컴퓨터의 수" + comNum + "유저의 수" + userNum +
//					"컴퓨터 승");
//		}else if(comNum<userNum) {
//			System.out.println("컴퓨터의 수" + comNum + "유저의 수" + userNum +
//					"유저 승");
//		}else {
//			System.out.println("컴퓨터의 수" + comNum + "유저의 수" + userNum +
//					"무승부");
//		}
		System.out.println("주사위 게임을 시작합니다");
			System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int inputData=-1;
		while(inputData==-1) {
			inputData = Integer.parseInt(sc.nextLine());
			if(inputData==-1) {
				System.out.println("종료");
			inputData=-1;
		}else {
			System.out.println("사용자가 주사위를 굴릴 차례입니다.(굴리기 ENTER)");
		}
		sc.nextLine();
		int userNum = (int) (Math.random()*6)+1;
		System.out.println("사용자의 수 : "+userNum);
		System.out.println("컴퓨터가 주사위를 굴릴 차례입니다.(굴리기 ENTER)");
		sc.nextLine();
		int comNum = (int) (Math.random()*6)+1;
		if(userNum<comNum) {
			System.out.println("사용자의 수 : "+userNum);
			System.out.println("컴퓨터의 수 : "+comNum);
			System.out.println("컴퓨터 승리");
		}else if(userNum>comNum) {
			System.out.println("사용자의 수 : "+userNum);
			System.out.println("컴퓨터의 수 : "+comNum);
			System.out.println("사용자 승리");
		}else {
			System.out.println("사용자의 수 : "+userNum);
			System.out.println("컴퓨터의 수 : "+comNum);
			System.out.println("무승부");
		}
		
		
		
		
		
		
		
		
	}

	}
}
