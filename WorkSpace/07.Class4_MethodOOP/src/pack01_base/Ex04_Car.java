package pack01_base;

public class Ex04_Car {
	//�ش��ϴ� CarŬ������ �Ӽ� gas�� ������.
	//gas�� �������·� �Ӽ��� ������ �ȴ�.(Ex04_Car�� gas�� ������ �Է¹޾ƾ����� ������ ������ Ŭ�����̴�.)
	
	int gas;

	public Ex04_Car(int gas) {
		this.gas = gas;
	}
	
	//��is, has�� ������ �� <-boolean Ÿ���� �����ϴ� �޼ҵ��� Ȯ�� 98%
	//isLeftGas��� �޼ҵ带 �����غ���
	//�ش��ϴ� �޼ҵ�� true �Ǵ� false�� ����� �����ϴ� �޼ҵ��̴�
	//true, false�� �Ǵ��� gas�� 0�� ��� false�� gas�� �����ϴٶ�� �޼����� �ֿܼ� ����̵ǰ�,
	//�װ� �ƴ϶�� true�� gas�� �ֽ��ϴٶ�� �޼����� �ֿܼ� ����� �ȴ�.
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
//		return true;
	}
	
	
	
	
}
