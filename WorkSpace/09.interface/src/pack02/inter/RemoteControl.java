package pack02.inter;

public interface RemoteControl {
	//Audio, Tv ����� ����� ������ �����ϰ� ���� ����
	//������ �Ѱ� ���� ��.
	//������ �����ϴ� ��.
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	//�߻� �޼ҵ�
	void turnOn();	//������ �Ѵ� ��
	
	void turnOff();	//������ ���� ��
	
	void setVolume(int volume);
}
