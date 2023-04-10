package pack01_string;

import java.util.Scanner;

public class Ex02_Null {
	public static void main(String[] args) {
		//기본형 변수 타입 : int, double, float, long, char, boolean 등(스택에 값 저장)
		//참조형 변수 타입 : 변수x, 기본형 변수 타입이 아닌 모든 것들(객체, Object, Class)
		//스택 영역에 참조 번지수를 저장하고 값은 힙에 따로 저장.
		//null↑ 참조 번지수가 없는 상태(오류가 제일 많이 발생함)
		String str1 = null;
		String str2 = "A";
		String str3;
		//String str3; <-null이라는 것은 참조를 시작하지는 x, 스택에 변수는 올라가있음
		//아직 어떤 값을 할당할지 모를 때 null로 초기화할 수 있음. 
		System.out.println(str1.length());
		System.out.println(str2.length());
		//※모든 참조형 타입은 null로 참조 시작 전 초기화가 가능하나,
		//모든 기능은 사용이 불가능하다.※
		Scanner sc = null;
		sc.nextLine();
//		System.out.println(str3);
		if(str1==str2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		
	}
}
