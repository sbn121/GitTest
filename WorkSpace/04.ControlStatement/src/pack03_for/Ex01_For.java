package pack03_for;

public class Ex01_For {
	public static void main(String[] args) {
	//반복문 : for문 (loop문, looping, 순환)
	//사용 이유 : 사람보다 기계는 반복적인 작업을 잘함(정확, 일정)
	//for(반복에 사용할 변수 초기화;조건식;증감식){
		//반복구간(코드 넣으면 됨)
	//}
	//for(1번 int i = 0; 2번 i<10; 4번 i++)
		//3번 i가 0부터 시작해서 9까지 총 10번 동작하는 반복문
	//
	for(int i =0; i<10; ) {//무한루프:잘못된 반복문의 예시
		System.out.println("for문 변수 i의 값 : "+ i);
		break;
	}	
	int result = 0;
	for(int i = 0; i<5; i+=2) {
		System.out.println("for문 변수의 값 :"+i);
		result=i;
	}
	System.out.println("최종 값 : "+result);
	
	}
}
