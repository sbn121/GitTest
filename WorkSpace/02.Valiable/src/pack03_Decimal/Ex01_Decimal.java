package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		// int 이사의 값을 담을 수 있는 정수형 데이터타입이 존재함.
		long l1;
		long l2 = 1234567890199999999L;// 숫자+long타입이라는 구분자
		System.out.println(l2);

		// 실수형 데이터 타입 : float , double
		// 실수형은 소숫점이 있는 것을 표현하기 위해 존재
		// float는 long과 마찬가지로 구분자 F를 붙여줘야만함
		float f1;
		f1 = 1.121212121121221212121212212121F;
		float f2 = 989898989898998989898898988.8F;
		double d1;
		d1 = 5.5;
		double d2 = 9.5;
		System.out.println(f1);
		// 뒤에 구분자가 붙는 long, float 불편
		// 대표적 : int, double

	}

}
