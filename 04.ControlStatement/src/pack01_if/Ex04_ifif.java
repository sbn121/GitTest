package pack01_if;

public class Ex04_ifif {
	public static void main(String[] args) {
		//��ŷ�� �⺻ ����: {<-�޸𸮿� �ø�}<-�޸𸮿��� ����
		//�ڹ����α׷��� �޸𸮸� ȿ�������� ����ϱ� ���ؼ� 
		//�޸𸮿� �ø��� ������ ������ ������.
		//��ŷ(����)�� ����ؼ� ��ø�� �����ϴ�.
		
		//����� 3�� �̻� ��ø�� �Ǵ� ��쿡�� ���� �ڵ带 �°� ¥�� �� �ǽ���
		//�� �ʿ䰡 ����
		//���İ�Ƽ �ڵ� : �ڵ带 �̻��ϰ� ���Ƽ� ¥����(����)
		int score=10;
		if(score % 2==0) {
			System.out.println("¦��");
			if(score==10) {
				System.out.println("10");
				if(score<11) {
					System.out.println("11���� ����");
				}
			}
		}else {
			System.out.println("Ȧ��");
			if(score<11) {
				System.out.println("11���� ����");
			}else {
				System.out.println("11���� ŭ");
			}
		}
	}

}
