package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
//		Test01_Method tm = new Test01_Method();
//		System.out.println("아이디와 비밀번호를 차례로 입력하세요");
//		System.out.println(tm.login(tm.method().nextLine(), tm.method().nextLine()));
		
		Test01_Method tm = new Test01_Method();
		System.out.println("아이디를 입력하세요");
		String id = tm.method().nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = tm.method().nextLine();
		System.out.println(id + " : "+pw);
		
		
		if(tm.login(id, pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 아이디와 비밀번호를 다시 확인하세요");
		}
		
	}
}
