package pack01.thread;

public class Ex06_YoutubeThread extends Thread{
	
	@Override
	public void run() {
		for(;;) {
			System.out.println("동영상을 재생중입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
