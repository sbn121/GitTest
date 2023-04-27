package pack02.inter;

public interface RemoteControl {
	//Audio, Tv 공통된 기능을 무조건 구현하게 만들 예정
	//전원을 켜고 끄는 것.
	//볼륨을 조절하는 것.
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	//추상 메소드
	void turnOn();	//전원을 켜는 것
	
	void turnOff();	//전원을 끄는 것
	
	void setVolume(int volume);
}
