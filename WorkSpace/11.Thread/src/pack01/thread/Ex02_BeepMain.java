package pack01.thread;

public class Ex02_BeepMain {
	public static void main(String[] args) {
//		Ex02_BeepTask eb02 = new Ex02_BeepTask(); �ν��Ͻ�ȭ : ��ü�� �޸𸮿� �÷��� (eb)����� �غ� ��
		Runnable eb = new Ex02_BeepTask(); //���� ������ ������ �ֱ� ������(run)
		//��ü�� ������ �� ���̴� �޼ҵ� : ������ �޼ҵ�
		//������ �޼ҵ�� Ŭ������ �̸��� �Ȱ���.
		//�޼ҵ��̱� ������ �����ε��� �����ϴ�.(���� �̸����� ���������� Ÿ���̳� �Ķ���� ������ �ٲ㼭 ��ø��Ű�� ��.)
		Thread thread = new Thread(eb);
		thread.start();
		System.out.println("����� ���� �� �ڵ尡 �ֽ��ϴ�.");
		for(int i=0;i<5;i++) {
			System.out.println("���� ��η�");
			try {
				Thread.sleep(2000);//���� �������� ����(main�޼ҵ忡 ����� ��)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}