package pack04.extend;


// Ŭ������ ����� ���ϻ�Ӹ� ����
public class SmartPhone extends DmbPhone{
	int internet;	// <-SmartPhone���� �� �Է¹޾� �����ϰ� ������ �޼ҵ带 ����� ����.
	//DmbPhone dmb = new DmbPhone(parameter)
	
	//Override : ������ �� �θ�Ŭ������ ����� �״�� �ΰ� ����� ���� �߰��ϴ� ���
	@Override
	public void powerOn() {
		System.out.println("������ �ΰ� 3D�� �����̸鼭 �ε�ȭ���� ����");
		super.powerOn();
	}
	@Override
	public void powerOff() {//��θ�Ŭ������ ����� �����ϰ� ����� ���� �߰��ϴ� ���
//		super.powerOff();//������ ���ϴ� ����� �ʿ䰡 ����
		System.out.println("0.5�� ���� ������ ����");
	}
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);	//�θ�Ŭ������ ������ ������ �޼ҵ带 ������ �ִٸ�
										//�ش��ϴ� �θ�Ŭ������ �ν��Ͻ�ȭ �ž߸�, �ڽİ�ü�� ������ ����
		this.internet = internet;
	}
	public void internetOn() {
		System.out.println("���ͳ��� �����մϴ�.");
	}
	public void internetOff() {
		System.out.println("���ͳ��� ������ �����ϴ�.");
	}
}
