package pack01.thread;

public class Ex06_YoutubeThread extends Thread{
	
	@Override
	public void run() {
		for(;;) {
			System.out.println("�������� ������Դϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
