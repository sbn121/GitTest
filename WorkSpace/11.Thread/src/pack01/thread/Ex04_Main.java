package pack01.thread;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_BeepThread thread = new Ex04_BeepThread();
		thread.start();
		//Thread�� ��ӹ��� ���� ���� �۾��� ���� ��, �ݵ�� �۾��� �ڵ�� run()�̶�� �޼ҵ忡 ����.
		//���� ���� �θ�Ÿ���� ThreadŸ������ ����θ� � ���� �۾��� ���ÿ� �����ϰ� �����ϱ� ����.
		//������
		Thread thread2 = new Ex04_BeepThread();
		thread2.start();
	}
}
