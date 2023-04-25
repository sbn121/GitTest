package pack04.extend;


// 클래스의 상속은 단일상속만 가능
public class SmartPhone extends DmbPhone{
	int internet;	// <-SmartPhone생성 시 입력받아 생성하게 생성자 메소드를 만들고 싶음.
	//DmbPhone dmb = new DmbPhone(parameter)
	
	//Override : 재정의 ① 부모클래스의 기능을 그대로 두고 기능을 새로 추가하는 방식
	@Override
	public void powerOn() {
		System.out.println("애플의 로고가 3D로 움직이면서 로딩화면이 나옴");
		super.powerOn();
	}
	@Override
	public void powerOff() {//②부모클래스의 기능을 삭제하고 기능을 새로 추가하는 방식
//		super.powerOff();//전원을 끕니다 기능이 필요가 없음
		System.out.println("0.5초 내에 전원이 꺼짐");
	}
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);	//부모클래스가 별도의 생성자 메소드를 가지고 있다면
										//해당하는 부모클래스가 인스턴스화 돼야만, 자식객체도 생성이 가능
		this.internet = internet;
	}
	public void internetOn() {
		System.out.println("인터넷을 연결합니다.");
	}
	public void internetOff() {
		System.out.println("인터넷을 연결을 끊습니다.");
	}
}
