package pack01_if;

public class EX03_ifIf {
	public static void main(String[] args) {
		//��ŷ => {}(����)
		//int num1=10;(������ �ʱ�ȭ��Ű�� �޸� 
		//��� �κп� ���� ����ǰ� �츮�� ���������� ã�Ƽ� ����.)
		//������ �������� �޸𸮿� ����Ǿ� ������? > }�� ���� ������
		int num1 = 10;
		System.out.println(num1);
		if(num1==10) {
			//int num1=10;//����
			int num2=10;//�������� ����� �����ұ�? >if�� �ȿ�����
			System.out.println(num2);
		}
		{
			int num2=10;//����x
		}
		
	}

}
