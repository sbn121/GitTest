package pack01.thread;

public class Ex05_ThreadC extends Thread{
	public Ex05_ThreadC() {
		//Thread의 멤버 메소드 중에 setName이라는 setter메소드가 있음(작업에 이름을 주는 메소드)
		setName("ThreadC");
	}
	
	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println(getName()+"가 출력한 내용");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
