package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
public static void main(String[] args) {
	int comNum = new Random().nextInt(100)+1;
	int count = 0;
	while(true) {
		count++;
		System.out.println("1부터 100사이의 정수를 입력하세요▶");
		Scanner sc = new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
	if(comNum>userNum) {
			System.out.println("더 큰 수를 입력하세요!");
		}else if(comNum<userNum) {
			System.out.println("더 작은 수를 입력하세요!");
		}else {
			System.out.println("맞췄습니다!");break;
		}
	
	}
	System.out.println("시도 횟수는:"+count+"번");
	
		
		
		
}
}
