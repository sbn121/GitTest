package pack04.extend;

public class DmbPhone extends CellPhone{
	// 1세대의 기능이 전부 사용가능하며, +로 Dmb기능이 추가된 최신폰
	int channel; //Dmb기능 사용 시 채널을 의미하는 변수(필드)
	// 생성자 메소드를 만드는데 색상, 모델, 채널이 입력되어야지만 생성이 가능하게 해보기.

	public DmbPhone(int channel, String color, String model) {
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신 시작합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		turnOnDmb();
	}
	void turnOffDmb() {
		System.out.println("방송 수신을 종료합니다.");
	}
	
}
