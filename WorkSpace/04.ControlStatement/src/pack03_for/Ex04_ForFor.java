package pack03_for;

import java.util.Scanner;

public class Ex04_ForFor {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩이 가능하다(순서x).
//		for(int i = 1;i<=10;i++) {
//			System.out.println("i "+i);
//		for(int j = 1; j<=10; j++) {
//			System.out.println("j "+j);
//			}
//		}
// 2미만의 숫자를 입력하면 구구단을 출력x => 잘못된숫자 라고 콘솔창에 출력만함.
// 2이상의 숫자가 입력 되면 해당하는 단까지의 구구단을 출력하기. 
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if(num<2) {
			System.out.println("오류");
		}else {
		for(int i = 2;i<=num;i++) {
			System.out.println();
			for(int j = 1; j<10; j++) {
				System.out.print(i+"x"+j+"="+i*j+" ");
				}
			System.out.println();
			}
		}
//		System.out.println(★);
//		System.out.println(★★);
//		System.out.println(★★★);
//		System.out.println(★★★★);
//		System.out.println(★★★★★);
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("★");
				}System.out.println();
			}
			for(int i=5;i<=5&&i>0;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("★");
				}System.out.println();
			}
		
			
		}
}
