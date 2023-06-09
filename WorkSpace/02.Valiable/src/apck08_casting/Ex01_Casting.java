package apck08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10 ; //정수형 변수 a를 초기화 하고 10을 담아둠
		double dNum = iNum ;// 더 큰 타입에 작은 타입을 담으면 
		                    // 자동 변환이 일어남 (자동 형변환)
		System.out.println(iNum);
		System.out.println(dNum);
		//자동형변환이 발생함 작은 타입(int) => 큰 타입 (double)
		//묵시적 형변환, Upcasting
		double dNum2 = 30.5;
		//int iNum2 = dNum2; 큰 타입 > 작은 타입
		//명시적 형변환, DownCasting ==> Casting의 일반적인 의미
		int iNum2 = (int) dNum2;
		System.out.println(dNum2);
		System.out.println(iNum2);
		//DownCasting은 문제가 발생함. 표현할 수 없는 데이터를 버림
		//데이터의 신뢰성, 정합성이 떨어질 가능성이 크기 때문에 주의
		
		//같은 숫자를 표현하는 데이터 타입끼리는 가능함.
		//byte < int 
		int i1 = 10;
		byte b1 = (byte) i1 ;//>Down
		byte b2 = 20;
		int i2 = b2; //>Up
		double d1= 1.5;
		byte b3 = (byte) d1;
		System.out.println(b3); 
		int i5 = 20;
		double d5 = i5;
		System.out.println(d5);
		
		
		
		
	}

}
