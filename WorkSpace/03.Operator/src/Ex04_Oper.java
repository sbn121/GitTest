
public class Ex04_Oper {
	public static void main(String[] args) {
		//사칙연산 + 나머지
		int value1 =5, value2 =2;
//		int sum= value1+value2;
//		System.out.println(sum);
		System.out.println("value1 + value2 = " + (value1+value2));
		System.out.println("value1 - value2 = " + (value1-value2));
		//ㄴString - int가 불가능하기 때문에 소괄호로 우선순위
		//연산 순서 때문에 오류가 발생x
		//습관적으로 연산식과 String이 더해질 때는 따로 감싸주기
		System.out.println("value1 * value2 = " + (value1*value2));
		System.out.println("value1 / value2 = " + (value1/value2));
		
		System.out.println("나머지는 %로 구한다"+(value1 % value2));
	}
}
