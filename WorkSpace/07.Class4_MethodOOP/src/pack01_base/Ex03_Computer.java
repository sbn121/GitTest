package pack01_base;

public class Ex03_Computer {
	//Ex03_Computer�� �޼ҵ带 �����غ���
	//sum1�̶�� �޼ҵ带 ����
	//�ش��ϴ� �޼ҵ�� �������� ������� �迭�� �Է¹޾� �迭�� ������ ���ϴ� �޼ҵ��̴�
	
	int sum1(int[] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	//���� �� ���� ������ �޼ҵ� �Ķ����
	int sum2(int ... values) {
		int sum =0;
		for(int i=1;i<=values.length;i++) {
			sum+=i;
		}
		return sum;
	}
	
}