package pack01_base;

public class Ex07_OverLoading {
	//�ظ޼ҵ� �����ε� : ���� �̸��� �޼ҵ带 �Ķ������ ������ Ÿ���� �޸��Ͽ� �����ؼ� ����� �� �ְ��� �͡�
	
	void method() {
		
	}
	void method(int param1) {
		
	}
	void method(int param1, int param2) {
		
	}
	void method(String param1) {
		
	}
	
	
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
		//��ǥ������ �޼ҵ� �����ε��� �Ǿ��ִ� ���� println��
		//� Ÿ���� �־ �ϴ� ����� �ǰԲ� ��������.
		System.out.println();
		eo.method();
	}
}
