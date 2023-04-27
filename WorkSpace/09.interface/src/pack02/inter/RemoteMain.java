package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		//RemoteControl == �������̽�(����� ����� ��)
		//Audio �� ����� ��ӹ޾� ���� �޼ҵ带 �����س��� ��
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(978987);//�������̽� �κ��� �̿��ؼ� audio�� �ּ� ������ �ִ� ������ �������ָ� ����
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		//������ : �������̽��� ��ӹ��� ��ü Audio & Television�� ���������� turnOn, turnOff, setVolume
		//�� ������ ����.
		//���� RemoteControl(Interface) == Audio == Television
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new Television();
		rcArr[1] = new Audio();
		for(int i=0;i<rcArr.length;i++) {
			rcArr[i].turnOn();
		}
	}
}
