package pack01.inter;

// extends <- Ŭ������ ��� : ���ο� �ִ� ��� ����� �����޾� ��밡���ϰ� �Ѵ�. (���� ���)
// implements <- �������̽��� ��� : �������̽� ���ο� �ִ� ��� �޼ҵ���� �������ؼ� ������ �� �ְ� ����.
// �������̽� : � ���(�޼ҵ�)�� ������ ���� �����Ѵ�.(abstract)
public class TestMain implements TestInterface{
	
	public static void main(String[] args) {
		IP="1234";//����̱� ������ �������̽����� ������ �� �Ҵ��� �����ϰ��� �� ������ �Ұ�����.
		System.out.println(IP);
	}
	
	@Override
	public void test1() {
		
	}

	@Override
	public boolean join(String id, String pw) {
		//������(��ɱ����� ������)
		return false;
	}

	@Override
	public void test2() {
		//�޼ҵ� ���� ��ü�� �� �� ���� ����
	}
}