package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner (입력)=> 자바 (출력)=> 콘솔창
		Scanner sc = new Scanner(System.in);//클래스의 초기화식
		// 외부에서 들어오는 데이터를 사용해보기 위해서 외워서 사용 o
		System.out.println("대기할 건지?");
		String inputData = sc.nextLine();
		System.out.println("여기까지 왔는지?");
		System.out.println(inputData);
		int i1 = Integer.parseInt(inputData)+10;
		System.out.println(i1);
	}

}
