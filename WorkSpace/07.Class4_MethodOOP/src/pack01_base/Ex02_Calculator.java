package pack01_base;

import java.util.Scanner;

public class Ex02_Calculator {
	//static Ű���尡 �ִ��� ���� ���� �Ǵ�.(��� ���� �ſ� �߿���!)
	//�޼ҵ��� ����
	//������ �޼ҵ�(constructor) : ��ü�� ������ �� �ʿ��� �޼ҵ�
	
	//�޼ҵ� ���� : 
	//����Ÿ�� �޼ҵ��̸�(�Ķ���ͺ�) {
	//	�޼ҵ� ����(�ڵ�)
	//}
	//�Ķ���ͺ� : � ���̵� �޼ҵ尡 ����� �� �ʿ���(����, Ŭ���� ��) ������ �ִٸ� �޾ƿ��Բ� ó���ϴ� �κ�
	void powerOn(int power) {	//����
		if(power < 1) {
			System.out.println("���͸� �������� ���� �Ұ�");
			powerOff();		
		}else {
		System.out.println("������ �մϴ�.");
		}
	}
	//powerOff���� main�� ������ �Ǵ� ���� : static������� '�޸�'�� ���� �ֱ� ����
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	public static void main(String[] args) {
//		powerOff();			
	}
	//main���� powerOff�� ������ �� �Ǵ� ���� : �ν��Ͻ�ȭ ������ �� ��ġ�� �޸𸮿� ���� '�޸�'�� ���� ����
	
	
	//void���� void�� �ƴ����� ���� ����Ÿ���� �����ȴ�.
	//���� �˰��ִ� ��� Ÿ��->����Ÿ������ ����� ����
	//void(<-����, ����ִ�) : ������ ���� (�۾� �� ����� �ʿ䰡 ����)
	
	//returnŸ���� void�� �ƴϰ� �־����� �ش��ϴ� Ÿ���� ��ȯ�ϴ� return Ű���尡 �ݵ�� �ʿ��ϴ�.
	int test() {
		return 0;
	}
	
	int plus(int plus1, int plus2) {
		return plus1+plus2;
//		System.out.println(); return�� �ǰ� �Ǹ� �޼ҵ� ��ü�� �޸𸮿��� �����
	}
	
	int plus3(int[] num) {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+= num[i];
		}
		return sum;
	}
	
	Scanner myScanner() {
		return new Scanner(System.in);
	}
	
	
	
	
}
