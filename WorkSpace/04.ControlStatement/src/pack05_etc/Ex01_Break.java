package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
public static void main(String[] args) {
	//break문은 제어문을 종료하고 빠져나가는 기능
	//무한루프하는 반복문 밑에 코드가 있으면 에러.(영원히 실행x코드)
//	while(true) {
//		while(true) {
//			break;     //하나의 제어문에 해당함
//		}
//		break;
//	}
	//무한루프를 만드고 내가 종료를 원할 때만 종료되게 만든다.
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt(sc.nextLine());
	while(true) {
		System.out.println("루프중");
		if(num==-1) {
			System.out.println("종료");
			break;
		}else if(num==1) {
			System.out.println("1번");
		}
	}//while
//	System.out.println("출력");
	
	
	
	
}
}
