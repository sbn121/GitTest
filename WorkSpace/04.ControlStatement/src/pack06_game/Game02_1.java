package pack06_game;

import java.util.Scanner;

public class Game02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		while(true) {
			System.out.println("점수를 입력하세요");
			a=Integer.parseInt(sc.nextLine());
			if(a<0||a>100) {
				System.out.println("0과 100사이의 수를 입력하세요");continue;
			}
		break;
		}
		while(true) {
			System.out.println("점수를 입력하세요");
			b=Integer.parseInt(sc.nextLine());
			if(b<0||b>100) {
				System.out.println("0과 100사이의 수를 입력하세요");continue;
			}
		break;
		}
		while(true) {
			System.out.println("점수를 입력하세요");
			c=Integer.parseInt(sc.nextLine());
			if(c<0||c>100) {
				System.out.println("0과 100사이의 수를 입력하세요");continue;
			}
		break;
		}
		
		
		
		
		
		
		
	}
}
