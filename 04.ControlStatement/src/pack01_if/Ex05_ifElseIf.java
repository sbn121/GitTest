package pack01_if;

public class Ex05_ifElseIf {
	public static void main(String[] args) {
		//if else문으로는 어떤 조건을 줄 때 true인 지와  
		//false인지 두 가지 경우만 만들 수가 있음
		//ex)짝수? Y(TRUE) else N(FALSE)
		//if(조건식 A) {
			//조건식A가 TRUE일때 실행할 코드를 넣어줌 
		//} else if(조건식 B) {
		//조건식 A가 TRUE가 아니고 조건식 B일 때 실행할 코드를 넣어줌
		//}else if (조건식C){
		//조건식A와B가 TRUE가 아니고 조건식C일때 실행할 코드를 넣어줌.
		//}else {
		//조건식 A가 TRUE가 아닐 때 실행할 코드를 넣어줌. 
		//(규칙:IF문 블럭킹 끝에 붙여서 사용)}
		int score = 93;
		if(score>=90) {
			System.out.println("A");
		}
		if(score<90&&score>=80) {
			System.out.println("B");
		}
		if(score<80&&score>=70) {
			System.out.println("C");
		}
		if(score<70) {
			System.out.println("D");
		}
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
			
}


	}


