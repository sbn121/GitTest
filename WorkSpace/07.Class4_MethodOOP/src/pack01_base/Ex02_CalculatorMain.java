package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		//��� : Ŭ������ �ν��Ͻ�ȭ �ϰ� '.' ������ ������ ��� �͵�
		Ex02_Calculator ec = new Ex02_Calculator();
		ec.powerOn(0);
		ec.powerOff();
		int result = ec.test()+10;	//intŸ���� ������ return�� -->int�� ������ ���� ���
		System.out.println(result);
		System.out.println(1+ec.test());
		result = ec.plus(0, 8);
		System.out.println(result);
		//String inputData = sc.nextLine();//<-nextLine()=String�� return�ϴ� �޼ҵ�
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 5;
		arr[4] = 5;
		
		System.out.println("�� : "+ec.plus3(arr) + ", ��� : "+(double)ec.plus3(arr)/5);
		
		
	}
}