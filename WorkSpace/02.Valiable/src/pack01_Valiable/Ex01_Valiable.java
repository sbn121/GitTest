package pack01_Valiable;

public class Ex01_Valiable {
	public static void main(String[] args) {
		//int a , String b ���� ���¸� ������� ��.
		//int<= ������ ��Ƽ� �����ϱ� ���� ���� Ÿ��
		//���� a��b��� ���� �̸��� ����ϰڴ�==>����
		int a;
		int b;
		int c;
		//���α׷��� ������ =�� ����(���)
		a = 10 ; // ���� �Ҵ� (���)
		b = 20 ;//<= �����ݷ� : Java������ �౸��
		c = 30 ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// int <= ( ���� �Ҽ����� ���� ���ڸ� ǥ���ϱ� ���� Ÿ��)
		// ������ ����� ���ÿ� �� �Ҵ� : ������ �ʱ�ȭ
		// int a;
		// a=10;
		int d = 40; // ������ �ʱ�ȭ
		a = 50 ; //���� (���� ���Ѵ�) a�� 10>50
		System.out.println(a);
		System.out.println(d);
	}

}