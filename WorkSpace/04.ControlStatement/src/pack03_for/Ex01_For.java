package pack03_for;

public class Ex01_For {
	public static void main(String[] args) {
	//�ݺ��� : for�� (loop��, looping, ��ȯ)
	//��� ���� : ������� ���� �ݺ����� �۾��� ����(��Ȯ, ����)
	//for(�ݺ��� ����� ���� �ʱ�ȭ;���ǽ�;������){
		//�ݺ�����(�ڵ� ������ ��)
	//}
	//for(1�� int i = 0; 2�� i<10; 4�� i++)
		//3�� i�� 0���� �����ؼ� 9���� �� 10�� �����ϴ� �ݺ���
	//
	for(int i =0; i<10; ) {//���ѷ���:�߸��� �ݺ����� ����
		System.out.println("for�� ���� i�� �� : "+ i);
		break;
	}	
	int result = 0;
	for(int i = 0; i<5; i+=2) {
		System.out.println("for�� ������ �� :"+i);
		result=i;
	}
	System.out.println("���� �� : "+result);
	
	}
}
