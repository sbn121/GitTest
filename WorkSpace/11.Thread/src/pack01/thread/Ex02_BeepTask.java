package pack01.thread;

import java.awt.Toolkit;

//Runnable�̶�� �۾� �������̽� : implements<-���ο� �ִ� �޼ҵ带 ������ �����ϰڴ�.
public class Ex02_BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("��η�");
			try {
				Thread.sleep(1 * 5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
