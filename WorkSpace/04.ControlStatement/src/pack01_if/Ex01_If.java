package pack01_if;

public class Ex01_If {
	public static void main(String[] args) {//< 프로그램의 시작점  
		//if문:제어문 중에 조건문이다.
		//어떤 조건을 주고 해당 조검이 TRUE일 때의 지역(블럭킹{})을 만들고
		//그 지역의 코드를 실행한다.
		//이항연산자부분은 값만 결과로 사용가능=>if문은 별도의 코딩을 결과로써 
		//사용이 가능하다.
		//if(조건식※TRUE와 FALSE의 결과를 얻을 수 있는 것※) {
		     //조건식이 TRUE일 때 실행하는 부분.
		//}
		int score = 99;//웹에서 입력받아온 ID와 PW를 비교할 때 사용함.
		if(score > 90) {
			//조건식이 TRUE일 때만 실행이 가능하다.
			System.out.println("점수가 90보다 크다.");
			System.out.println("등급은 A등급 입니다.");
		}
		System.out.println("왔니");
		
		if(score%2==1) {
			System.out.println("score는 홀수");
		}
		if(score%2==0) {
			System.out.println("score는 짝수");
		}
		
	}//프로그램의 끝점
}
