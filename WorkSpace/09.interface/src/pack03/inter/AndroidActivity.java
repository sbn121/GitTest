package pack03.inter;

public class AndroidActivity {
	//Activity�� ȭ���� �����ϰ� �ϴ� Ŭ����
	public static void main(String[] args) {
		
		//�͸��� �޼ҵ�
		AndroidOnclick ao = new AndroidOnclick() {
			@Override
			public void onClick() {
				System.out.println("������");
			}
		};
		
		ao.onClick();
		
	}
	
	void test(AndroidOnclick ao) {
		ao.onClick();
	}
}