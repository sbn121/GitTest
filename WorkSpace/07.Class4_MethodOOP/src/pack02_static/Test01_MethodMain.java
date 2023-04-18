package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
		Test01_Method tm = new Test01_Method();
		System.out.println("아이디와 비밀번호를 차례로 입력하세요");
//		Scanner sc = new Scanner(System.in);
		tm.login(tm.method().nextLine(), tm.method().nextLine());
		
		
	}
}
