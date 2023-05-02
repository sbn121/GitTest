package pack01.thread;

public class Ex06_MelonThread extends Thread{
	
	@Override
	public void run() {
		for(;;) {
			System.out.println("음악을 재생중입니다.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
