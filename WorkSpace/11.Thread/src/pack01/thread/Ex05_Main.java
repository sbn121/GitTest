package pack01.thread;

public class Ex05_Main {
	public static void main(String[] args) {
//		Ex05_ThreadA threadA = new Ex05_ThreadA();
//		System.out.println("�۾� �̸� : "+threadA.getName());
//		threadA.start();
		
//		Ex05_ThreadB threadB = new Ex05_ThreadB();
//		System.out.println("�۾� �̸� : "+threadB.getName());
//		threadB.start();
		
		Thread[] threadArr = new Thread[3];
		threadArr[0] = new Ex05_ThreadA();
		threadArr[1] = new Ex05_ThreadB();
		threadArr[2] = new Ex05_ThreadC();
		
		//�켱���� : priority
		threadArr[0].setPriority(Thread.MAX_PRIORITY);
		threadArr[1].setPriority(Thread.NORM_PRIORITY);
		threadArr[2].setPriority(Thread.MIN_PRIORITY);
		
		//�۾��� ���� ���� ���� �� �ϳ��� ������ ����θ� for���̳� while�� ���� �ݺ����� �̿��ϸ� ��� ����
		for(int i=0;i<threadArr.length;i++) {
			System.out.println("�۾� �̸� : "+threadArr[i].getName());
			threadArr[i].start();
		}
		
		System.out.println("���Ⱑ ������ �Ǵ���");
		
	}
}