package pack04.extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dmbP = new DmbPhone(1, "red", "apple");
		dmbP.powerOn();
		dmbP.bell();
		dmbP.sendVoice("��������");
		dmbP.receiveVoice("Ȥ�� ���� ���Ե������Ű���?");
		dmbP.hangUP();
		//cellPhone���� �����س��� ���
		dmbP.turnOnDmb();
		dmbP.changeChannel(5);
		dmbP.turnOffDmb();
		dmbP.powerOff();
		
	}
}
