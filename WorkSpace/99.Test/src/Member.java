
public class Member {
	
	
	public Member(int field) { // �޼ҵ��� �߰�ȣ(����ŷ)�� ������ ���ο� �ִ� ��� ������ �޸𸮿��� �����.
		this.field = field;
	}


	// ����ŷ : ������ ���۰� ��, ���ο� ����ִ� ��� �͵��� ���
	// static ����.
	int field = 1; 	       // �ν��Ͻ� ���
	static int sField = 2; // ����ƽ ���
	
	// �ν��Ͻ�ȭ : Ŭ������ ������ �ִ� ��� �߿� �ν��Ͻ� ������� �޸𸮿� �÷��� ��� �����ϰ� �ϴ� ����
	//             (�ν��Ͻ�ȭ ������ ������������ ��ü ����� ��밡����, �ܺο��� private)
	// ������(Constructor) �޼ҵ� : Ŭ������ �޸𸮿� �ö� �� ����� ������ == Ŭ������ �̸��� ��ҹ��ڰ� ��Ȯ�� ����
	public static void main(String[] args) {
		Member mm = new Member(10); // �ν��Ͻ�ȭ ���� : new 'Member();' ������ �޼ҵ�
//		System.out.println(sField);
		
	}
	
}