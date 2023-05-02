package pack01.thread;

public class Ex06_ThreadTest {
	public static void main(String[] args) {
		Thread[] threadArr = new Thread[2];
		threadArr[0] = new Ex06_YoutubeThread();
		threadArr[1] = new Ex06_MelonThread();
		
		for(int i=0;i<threadArr.length;i++) {
			threadArr[i].start();
		}
	}
}
