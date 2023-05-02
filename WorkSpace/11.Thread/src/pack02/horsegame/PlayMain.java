package pack02.horsegame;

import java.util.Random;
import java.util.Scanner;

public class PlayMain {
	public static int rank = 0;
	public static int num;
	public static void main(String[] args) {
		
		System.out.println("잠시후 경기가 시작됩니다.");
		System.out.println("1등으로 예상되는 말의 번호를 입력해주세요.(1~5)");
		Scanner sc = new Scanner(System.in);
		while(true) {
		try {
				num = Integer.parseInt(sc.nextLine());
				if(num>=1&&num<=5) {
					Player[] p = new Player[5];
					for(int i=1;i<=5;i++) {
						p[i-1] = new Player(i, new Random().nextInt(10)+1);
						p[i-1].start();
					}
					
					break;
				}else {
					System.out.println("1~5사이의 수만 입력하세요");
				}
		}catch (Exception e) {
			System.out.println("1~5사이의 수만 입력하세요");
		}
		}
		
		
	}
}
