package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		// int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ������.
		long l1;
		long l2 = 1234567890199999999L;// ����+longŸ���̶�� ������
		System.out.println(l2);

		// �Ǽ��� ������ Ÿ�� : float , double
		// �Ǽ����� �Ҽ����� �ִ� ���� ǥ���ϱ� ���� ����
		// float�� long�� ���������� ������ F�� �ٿ���߸���
		float f1;
		f1 = 1.121212121121221212121212212121F;
		float f2 = 989898989898998989898898988.8F;
		double d1;
		d1 = 5.5;
		double d2 = 9.5;
		System.out.println(f1);
		// �ڿ� �����ڰ� �ٴ� long, float ����
		// ��ǥ�� : int, double

	}

}