package pack01.thread;

//extends : 클래스타입의 상속(한 개만 사용가능) : 클래스의 모든 멤버(private제외)를 상속받을 때 사용
//implements : 인터페이스의 상속(여러 개 가능) : 방법만(메소드를 상속받기 위해 주로 사용)
public class Ex04_BeepThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("스레드 상속");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
