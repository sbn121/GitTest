package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
public static void main(String[] args) {
		//Test01_Game이라는 클래스를 만듬.
			// Scanner를 이용하여 숫자를 입력받는다.
			//숫자는 게임의 난이도가 된다.
			//ex)10입력 => 난이도10임.
			//난이도의 크기를 가진 배열을 만들고 배열의 랜덤한 인덱스에 특정한 다른 값을 숨김.
			//사용자는 어느칸에 특정한 값이 숨어있는지 맞추는 게임
			//new Random().nextInt(바운더리);//0~바운더리 내에서 랜덤한수생성
			
			//예시 ) 사용자가 10입력
			// 난이도는 10임.
			// 배열을 만듬 [] [] [] [] [] [] [] [] [] []
			// 배열의 특정한 인덱스에 랜덤하게 다른값을 숨김 [] [] [] [x ][ ][ ][ ][ ][ ] []
			//사용자가 답을 입력함 . 3=> 오답
			// 사용자가 답을 입력함 . 4=> 정답                                    ↑
	System.out.println("게임을 시작합니다");
	System.out.println("난이도(2이상의 수)를 입력해주세요");
	int dif=-1;
	Scanner sc= new Scanner(System.in);
	while(dif<2) {
		dif = Integer.parseInt(sc.nextLine());
		if(dif<2) {
		System.out.println("입력 오류 난이도(2이상의 수)를 입력해주세요");
		}else {
			System.out.println("난이도 입력이 완료되었습니다");
			
		}
	}
	int[] game = new int[dif];
	int random = new Random().nextInt(game.length+1);
	game[random] = 5;
	int inputData = -1;
	int count = 0;
	System.out.println("0~설정한 난이도 값을 입력해주세요");
	while(inputData==-1) {
		inputData = Integer.parseInt(sc.nextLine());
		if(inputData==random) {
			System.out.println("정답");
		}else if(inputData>dif) {
			System.out.println("입력 오류 0~설정한 난이도 값을 입력해주세요");
			inputData=-1;
		}else {
			System.out.println("오답");
			inputData = -1;
		}
		count++;
	}
	System.out.println("시도 횟수는 "+count+"번 입니다");
	
	
	
	
	
	
	
	
	
}
}
