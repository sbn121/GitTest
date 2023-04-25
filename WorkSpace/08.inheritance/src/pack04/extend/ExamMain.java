package pack04.extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dmbP = new DmbPhone(1, "red", "apple");
		dmbP.powerOn();
		dmbP.bell();
		dmbP.sendVoice("여보세요");
		dmbP.receiveVoice("혹시 보험 가입돼있으신가요?");
		dmbP.hangUP();
		//cellPhone에서 구현해놓은 기능
		dmbP.turnOnDmb();
		dmbP.changeChannel(5);
		dmbP.turnOffDmb();
		dmbP.powerOff();
		
	}
}
