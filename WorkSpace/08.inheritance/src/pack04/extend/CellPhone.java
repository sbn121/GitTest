package pack04.extend;

public class CellPhone {
	// 1���� �� : ������ �Ѱ� ���� ��ɰ�, ��ȭ����� �ִ� �޴���
	String model;
	String color;
	final String CHIP = "Ĩ";	//final(����)�̶�� ���� ó���� �� �Ҵ� ���Ŀ��� ���� ������ �Ұ����ϴ�
							//������ ǥ���ϴµ� ������ �̸��� ���� ���� �ݵ�� ��ü �빮�ڷ� ���ش�.
							//(�����ڳ��� �˾ƺ��� ���ؼ�)
	
	private void changeFolder() {
		System.out.println("1���� ���� �� Ư���� ȭ���� ���ư��� ����Դϴ�.");
	}//private->���x
	
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	public void sendVoice(String input) {
		System.out.println("�� : "+input);
	}
	public void receiveVoice(String input) {
		System.out.println("���� : "+input);
	}
	public void hangUP() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
