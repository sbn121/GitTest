package pack01.thread;

import java.awt.Toolkit;

public class Ex01_Thread {
	//main <-�ڹ��� �������� ������ ���ν������̱� ������ (1 ���� �۾�)
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();//���� �ܿ�ų� ����x, �̹� �� å ������ �ֱ� ������ �����.
			System.out.println("��η�");
			//���ν����尡 ����ؼ� �۾��� �ϴ� �� �ƴ϶�, �� �� ������ �����ð�(����)�� ������ 
			//�����ϰ� ó��.
			try {
				Thread.sleep(1 * 5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}