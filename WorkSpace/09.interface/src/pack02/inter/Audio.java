package pack02.inter;


//�߻�(interface method) �޼ҵ��� ���� ������ ���(implements)���� ��ü���� �Ѵ�.
public class Audio implements RemoteControl{
	private int volume;
	@Override
	
	public void turnOn() {
		System.out.println("Audio�� ������ �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ������ ���ϴ�.");
	}
	
	public void audio() {
		System.out.println("Audio���� ���� ���");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;//10
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;//0
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio�� ���� : "+this.volume);
	}
	//�������̽��� ��ӹ޾� ������ Audio�� ��ü �޼ҵ带 RemoteMain���� ���� ȣ���غ���.
	
}