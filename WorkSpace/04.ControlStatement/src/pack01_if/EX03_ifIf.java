package pack01_if;

public class EX03_ifIf {
	public static void main(String[] args) {
		//블럭킹 => {}(지역)
		//int num1=10;(변수를 초기화시키면 메모리 
		//어느 부분에 값이 저장되고 우리는 변수명으로 찾아서 쓴다.)
		//변수는 언제까지 메모리에 저장되어 있을까? > }로 끝날 때까지
		int num1 = 10;
		System.out.println(num1);
		if(num1==10) {
			//int num1=10;//오류
			int num2=10;//언제까지 사용이 가능할까? >if문 안에서만
			System.out.println(num2);
		}
		{
			int num2=10;//오류x
		}
		
	}

}
