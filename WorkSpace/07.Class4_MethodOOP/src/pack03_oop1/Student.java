package pack03_oop1;

//Student Class : �л��� ���������� ������ �� �ְ� ���� ���赵
public class Student {
	//���(�ʵ�) : �л��� ��ȣ, �̸�, �����, ���м���, �����, ����, ���
	
	int num;
	String name;
	int korSco ,matSco ,engSco ,sum;
	double avg;
	
	public Student(int num, String name, int korSco, int matSco, int engSco) {
		this.num = num;
		this.name = name;
		this.korSco = korSco;
		this.matSco = matSco;
		this.engSco = engSco;
		this.sum = korSco+matSco+engSco;
		this.avg = (double)(korSco+matSco+engSco)/3;
	}

	void display() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(korSco);
		System.out.println(matSco);
		System.out.println(engSco);
		System.out.println(sum);
		System.out.println(avg);
	}
	
}
