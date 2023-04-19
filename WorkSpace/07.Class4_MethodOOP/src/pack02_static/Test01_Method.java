package pack02_static;

import java.util.Scanner;

public class Test01_Method {
	
//	boolean isLogin(String id, String pw) {
//		
//		if(id.equals("master")&pw.equals("master1234")) {
//			System.out.println("로그인 성공");
//			return true;
//		}else {
//			System.out.println("로그인 실패");
//			return false;
//		}
//	}
//	
//	Scanner method() {
//		return new Scanner(System.in);
//	}
	
	//리턴타입이 잘 구분이 안 될 때. void(반환없음)
	private static final String Scanner = null;

	boolean login(String id, String pw) {
		//Test01_MethodMain이라는 외부 클래스에서 입력받은 id와 pw가 내가 원하는 값과 일치하는지 여부를 판단
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("정보 일치");
			return true;
		}else {
			System.out.println("정보 불일치");
			return false;
		}
	}	
		Scanner method() {
			return new Scanner(System.in);
		}
		
		
		
		
	
	
}
