package pack01_base;

import java.util.Scanner;

public class Ex02_Calculator {
	//static 키워드가 있는지 없는 지의 판단.(멤버 구분 매우 중요함!)
	//메소드의 구조
	//생성자 메소드(constructor) : 객체를 생성할 때 필요한 메소드
	
	//메소드 구조 : 
	//리턴타입 메소드이름(파라메터부) {
	//	메소드 내용(코드)
	//}
	//파라메터부 : 어떤 것이든 메소드가 실행될 때 필요한(변수, 클래스 등) 정보가 있다면 받아오게끔 처리하는 부분
	void powerOn(int power) {	//숫자
		if(power < 1) {
			System.out.println("배터리 부족으로 실행 불가");
			powerOff();		
		}else {
		System.out.println("전원을 켭니다.");
		}
	}
	//powerOff에서 main에 접근이 되는 이유 : static멤버여서 '메모리'에 먼저 있기 때문
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public static void main(String[] args) {
//		powerOff();			
	}
	//main에서 powerOff에 접근이 안 되는 이유 : 인스턴스화 과정을 안 거치면 메모리에 없음 '메모리'에 없기 때문
	
	
	//void인지 void가 아닌지에 따라 리턴타입이 결정된다.
	//내가 알고있는 모든 타입->리턴타입으로 사용이 가능
	//void(<-공허, 비어있는) : 리턴이 없는 (작업 후 결과가 필요가 없는)
	
	//return타입이 void가 아니게 주어지면 해당하는 타입을 반환하는 return 키워드가 반드시 필요하다.
	int test() {
		return 0;
	}
	
	int plus(int plus1, int plus2) {
		return plus1+plus2;
//		System.out.println(); return이 되게 되면 메소드 자체가 메모리에서 사라짐
	}
	
	int plus3(int[] num) {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+= num[i];
		}
		return sum;
	}
	
	Scanner myScanner() {
		return new Scanner(System.in);
	}
	
	
	
	
}
