package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		//멤버 : 클래스를 인스턴스화 하고 '.' 찍으면 나오는 모든 것들
		Ex02_Calculator ec = new Ex02_Calculator();
		ec.powerOn(0);
		ec.powerOff();
		int result = ec.test()+10;	//int타입을 무조건 return함 -->int형 변수랑 같이 취급
		System.out.println(result);
		System.out.println(1+ec.test());
		result = ec.plus(0, 8);
		System.out.println(result);
		//String inputData = sc.nextLine();//<-nextLine()=String을 return하는 메소드
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 5;
		arr[4] = 5;
		
		System.out.println("합 : "+ec.plus3(arr) + ", 평균 : "+(double)ec.plus3(arr)/5);
		
		
	}
}
