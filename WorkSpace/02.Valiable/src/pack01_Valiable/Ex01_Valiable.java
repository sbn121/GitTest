package pack01_Valiable;

public class Ex01_Valiable {
	public static void main(String[] args) {
		//int a , String b 같은 형태를 변수라고 함.
		//int<= 정수를 담아서 저장하기 위한 변수 타입
		//나는 a와b라는 변수 이름을 사용하겠다==>선언
		int a;
		int b;
		int c;
		//프로그래밍 언어에서의 =는 대입(담다)
		a = 10 ; // 값을 할당 (담다)
		b = 20 ;//<= 세미콜론 : Java에서의 행구분
		c = 30 ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// int <= ( 정수 소숫점이 없는 숫자를 표현하기 위한 타입)
		// 변수를 선언과 동시에 값 할당 : 변수의 초기화
		// int a;
		// a=10;
		int d = 40; // 변수의 초기화
		a = 50 ; //변수 (값이 변한다) a는 10>50
		System.out.println(a);
		System.out.println(d);
	}

}
