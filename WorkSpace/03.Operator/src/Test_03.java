import java.util.Scanner;

public class Test_03 {
	public static void main(String[] args) {
		//Method(메소드)==미리 만들어 놓은 기능을 호출해서 사용한다.
		//sc.nextLine()하고 나서 결과는 항상 String==sc.nextLine==String
		Scanner sc = new Scanner(System.in);
//		String inputData = sc.nextLine();
//		int num = Integer.parseInt(inputData);
//		int result = num % 2 == 1 ? 1 : 2;
//		String result=Integer.parseInt(sc.nextLine())%2==1?"홀수":"짝수";
//		System.out.println(result);
		System.out.println("숫자를 입력하세요. 그 외에는 오류");
		System.out.println(Integer.parseInt(sc.nextLine())%2==1?"홀수":"짝수");
		System.out.println("------구분-------");
//		String inputData2 = sc.nextLine();
//		String inputData3 = sc.nextLine();
//		int num2 = Integer.parseInt(inputData2);
//		int num3 = Integer.parseInt(inputData3);
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		System.out.println("num2+num3=" + (num2+num3));
		System.out.println("num2-num3=" + (num2-num3));
		System.out.println("num2*num3=" + (num2*num3));
		System.out.println("num2/num3=" + (num2/num3));
		System.out.println("------구분-------");
		String num4 = num2 == num3 ? "같음" : num2 > num3 ? "num2": "num3";
		System.out.println(num4 + "더 큼");
		
	}

}
