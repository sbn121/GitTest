package pack04_while;

public class Ex01_While {
	public static void main(String[] args) {
		//for(①반복에 사용할 변수 초기화 식(i);②조건식(TRUE일 때 동작);④증감식){
		//③실제 반복할 코드(구간)
	//}
	
	//①변수 초기화 식
	//while(②조건식){
		//반복하는 구간
		//③증감식 or break를 이용한 반복문 종료
	//}
		
	int i=0;
	while(i<10) {
		System.out.println(i);
		i++;
	}
	//for문 : 반복 횟수를 정확하게 알 때 수에 의해서 반복시키는 경우
	//while문 : 반복 횟수를 정확하게 모를 때 조건에 의해서 반복시키는 경우
	int j=1;
	while(j<=50) {
		System.out.println(j);
		j+=2;
	}
	
	
	
	
	
	
	}

}
