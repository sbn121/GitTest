package pack01_base;

public class Ex05_Const {
	int id;
	String pw;
	
	//Ex05_Const��� Ŭ������ �ݵ�� int�� ������ 1 ���� String�� ������ 1���� �ԷµǾ�� ���� ����
	//�ػ����� �޼ҵ� �����ε� : ���� �̸��� �޼ҵ带 �Ķ������ ������ Ÿ���� �޸��Ͽ� �ߺ����� �����ϴ� �͡�
	
	
	public Ex05_Const(int id) {
		this.id = id;
	}
	
	public Ex05_Const(int id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	//� �޼ҵ尡 ȣ��Ǿ����� ��ȣ�� ��쿡�� ��ǻ�ʹ� ������� �ν��Ѵ�.(true or false)
//	public Ex05_Const(int id, String pw) {
//		this.id = id;
//		this.pw = pw;
//	}
	
	
}
