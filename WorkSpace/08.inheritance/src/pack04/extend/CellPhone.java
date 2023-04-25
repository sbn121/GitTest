package pack04.extend;

public class CellPhone {
	// 1세대 폰 : 전원을 켜고 끄는 기능과, 통화기능이 있는 휴대폰
	String model;
	String color;
	final String CHIP = "칩";	//final(최종)이라는 것은 처음에 값 할당 이후에는 절대 수정이 불가능하다
							//상수라고도 표현하는데 변수의 이름을 지을 때는 반드시 전체 대문자로 해준다.
							//(개발자끼리 알아보기 위해서)
	
	private void changeFolder() {
		System.out.println("1세대 폰의 모델 특성상 화면이 돌아가는 기능입니다.");
	}//private->상속x
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String input) {
		System.out.println("나 : "+input);
	}
	public void receiveVoice(String input) {
		System.out.println("상대방 : "+input);
	}
	public void hangUP() {
		System.out.println("전화를 끊습니다.");
	}
}
