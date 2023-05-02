package pack01.thread;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_BeepThread thread = new Ex04_BeepThread();
		thread.start();
		//Thread를 상속받은 여러 개의 작업이 있을 때, 반드시 작업의 코드는 run()이라는 메소드에 있음.
		//따라서 같은 부모타입인 Thread타입으로 묶어두면 어러 개의 작업을 동시에 실행하고 제어하기 편함.
		//다형성
		Thread thread2 = new Ex04_BeepThread();
		thread2.start();
	}
}
