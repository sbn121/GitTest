package pack01.inter;

// �߻� Ŭ���� : abstract class .. �߻� �޼ҵ� ��
// �߻� == abstract : �޼ҵ��� returnŸ��, �޼ҵ��, �Ķ���͸� ������ ��������
// ���� ������ ����� ���� ��ü�� override�� ���ؼ� �ؾ���. (����� ����)

// interface : ��뵵�� ����ϱ� ���ؼ� ���� .java����
// ��Ը� ������Ʈ���� � ����� �Ͽ�ȭ�ϱ� ���ؼ� ���� ����(���� ���� �����ӿ�ũ)
// public class(x) Class -> public interface(o)
public interface TestInterface {
	String IP = "192.168.0.38";	//�������̽� ���ο��� ���� ������ ���(final)��
	//abstract�� �տ� �پ��ִٰ� �����ϸ� ��.
	void test1();
	// PM, PL, 
	boolean join(String id, String pw);
	
	void test2();
}
