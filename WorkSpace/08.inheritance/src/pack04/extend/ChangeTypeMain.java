package pack04.extend;

public class ChangeTypeMain {
	public static void main(String[] args) {
		// CellPhone -> DmbPhone -> SmartPhone	
		// CellPhone�� �θ�Ŭ�����̱� ������ �ڽ�Ŭ������ �Ϻΰ� �״�� ������
		// �ڽ� Ŭ������ �θ�Ŭ������ ��� �Ǹ� �� ����� �״�� ����� �����ϴ�.
		// CellPhone cp = new DmbPhone(1, "����", "��");
		// CellPhone cp2 = new SmartPhone(1, "����", "��", 5);
		CellPhone[] cpArr = new CellPhone[2];
		cpArr[0] = new DmbPhone(1, "����", "��");
		cpArr[1] = new SmartPhone(1, "����", "��", 5);
		
		DmbPhone dp = new SmartPhone(1, "����", "��", 0);
		
		for(int i=0;i<cpArr.length;i++) {
			cpArr[i].powerOn();
		}
		//����Ÿ�Ժ�ȯ �߿� �ڵ��� ������ �־���. ���� ���̰� ������?
		// int->double�ڵ�
		// int<-double����
		int intNum = 1;
		double dNum = 3.14;
		dNum = intNum;	//�ڵ�
		intNum = (int)dNum;	//����
		
		SmartPhone sp = (SmartPhone) new DmbPhone(1, "����", "��");	//�ڽ� = �θ�;������ ĳ������ ������Ѵ�.
		sp.powerOn();
		
	}
}
