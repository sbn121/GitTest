package pack04_char;

public class Ex01_Char {
	public static void main(String[] args) {
		//문자 데이터 타입 : char(2byte)
		//하나의 글자만 저장 : 유니코드
		//변수에 값을 할당(대입)할 때는 작은 따옴표를 사용한다.
		//작은 따옴표 == 싱글 코테이션 == '
		char cha1 = 'a' ;
		char cha2 ;
		cha2 = 'b' ;
		System.out.println(cha1);
		char cha3 ='가' ;
		char cha4 = '&' ;
		//char charError = '' ; 아무 것도 없는 것은 x
		//char charError = 'ab'; 문자가 아닌 문자열은 x
		char cha5 = 56 ; //유니코드 진수형태로 문자와
		// 특수문자 숫자를 표현할 수 있는 코드
		
		// 문자 하나를 담는 개념이나 사용법은 중요하지만
		// 데이터 타입 자체가 사용 빈도가 낮기 때문에 복습 x
		
	}

}
