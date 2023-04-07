
public class Test_04 {
	public static void main(String[] args) {
		// int(정수), double(실수)
		// char(한글자=문자), String(두글자이상=문자열)
		// 변수를 선언하는 규칙 : 변수타입 네이밍(이름);
		// 메모리(컴퓨터 저장공간)를 효율적으로 쓰기 위해서 
		//데이터의 표현범위 별로 또는 데이터의 유형에 따라 변수타입은 나눠져있음
		int iNum;
		double dNum;
		char cChr;
		String sStr;
		// 변수에 값 저장( 할당, 값 == 리터럴) : 변수명 = 값;
		iNum = 1;      //(범위 ~10억)
		dNum = 1.01;   
		cChr = 'a';    //''<-로 감싸주기
		sStr = "송빛나"; // ""<-로 감싸주기
		int iNum2 = 10; //변수 선언과 동시에 할당 > 초기화
		// 나열 : 같은 타입의 변수를 여러 개 만들 때 사용함.
		int subject1, subject2, subject3 ;
		subject1 = 1;
		subject2 = 2;
		subject3 = 3;
		System.out.println(subject1);
		System.out.println(subject2);
	}

}
