package pack01.thread;

public class Ex05_ThreadA extends Thread{
	public Ex05_ThreadA() {
		//Thread�� ��� �޼ҵ� �߿� setName�̶�� setter�޼ҵ尡 ����(�۾��� �̸��� �ִ� �޼ҵ�)
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println(getName()+"�� ����� ����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
