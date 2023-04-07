package pack01_if;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if문:단순 if(조건식을 주고 해당하는 조건식이 TRUE인 경우의 블럭킹
		//(지역{})을 만들어서 코드실행)
		//if-else문:단순 if문은 조건식이 TRUE일 때만 실행이 되는 버거러움이 있음.
		//if의 조건식이 TRUE가 아닌 FALSE라면 else라는 키워드를 if문 뒤에 붙여서
		//FALSE 실행부를 만드는 것.
		int score = 85;
		
		if(score%2==0) {
			System.out.println("짝수");
		}else {           //if문 뒤에 사용(홀로 사용 불가)
			System.out.println("홀수");
		}
		int num1 = 9, num2= 9;
		if(num1<num2) {
			System.out.println("num2 큼");
		}else {
			System.out.println("num1 큼");
		}
//		if(num1==num2) {
//			System.out.println("같음");
//		}
//		if(score%2==1) {
//			System.out.println("홀수");
//		}
	}//main
}//class
