package apck08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10 ; //������ ���� a�� �ʱ�ȭ �ϰ� 10�� ��Ƶ�
		double dNum = iNum ;// �� ū Ÿ�Կ� ���� Ÿ���� ������ 
		                    // �ڵ� ��ȯ�� �Ͼ (�ڵ� ����ȯ)
		System.out.println(iNum);
		System.out.println(dNum);
		//�ڵ�����ȯ�� �߻��� ���� Ÿ��(int) => ū Ÿ�� (double)
		//������ ����ȯ, Upcasting
		double dNum2 = 30.5;
		//int iNum2 = dNum2; ū Ÿ�� > ���� Ÿ��
		//������ ����ȯ, DownCasting ==> Casting�� �Ϲ����� �ǹ�
		int iNum2 = (int) dNum2;
		System.out.println(dNum2);
		System.out.println(iNum2);
		//DownCasting�� ������ �߻���. ǥ���� �� ���� �����͸� ����
		//�������� �ŷڼ�, ���ռ��� ������ ���ɼ��� ũ�� ������ ����
		
		//���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ������.
		//byte < int 
		int i1 = 10;
		byte b1 = (byte) i1 ;//>Down
		byte b2 = 20;
		int i2 = b2; //>Up
		double d1= 1.5;
		byte b3 = (byte) d1;
		System.out.println(b3); 
		int i5 = 20;
		double d5 = i5;
		System.out.println(d5);
		
		
		
		
	}

}