package pack01.thread;

import java.awt.Toolkit;

//Runnable이라는 작업 인터페이스 : implements<-내부에 있는 메소드를 무조건 구현하겠다.
public class Ex02_BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("띠로롱");
			try {
				Thread.sleep(1 * 5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
