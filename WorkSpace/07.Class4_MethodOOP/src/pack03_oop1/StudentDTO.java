package pack03_oop1;

public class StudentDTO {
	//�޼ҵ峪 ���� �տ� ���������ڶ�� ���� ����ϸ�, �ܺο����� ������ ������ �� �ִ�.
	//public, protected, default, private
	
	//���� ����� �� : public(������), private(������)
	//public : ���� ������Ʈ ������ ���� ����
	//default : ���� ��Ű�� ������ ���� ����
	//private : ���� Ŭ���� ������ ���� ����
	private int num;
	private String name;
	//�ܺο��� ����(����)�� �����ؼ� ������ ��� �������� �ŷڰ� ������
	
	
	//getter & setter
	//�����̸� �տ� get�� ���̰� �ڿ� �����̸� ù ��° ���ڸ� �빮�ڷ� �ٲ� ���·�,
	//�ܺο����� ������ �����ִ� ������ �޼ҵ带 ���ؼ� ���� �����ϰ� ����� ����
	//korSco=>getScore()�޼ҵ� =>korSco�� ����ִ� ���� ��������
//			  setScore(int korSco) => korSco�� ���� ��������
	private int korSco;
	private int matSco, engSco, sum;
	private double avg;
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorSco() {
		return korSco;
	}
	public void setKorSco(int korSco) {
		this.korSco = korSco;
	}
	public int getMatSco() {
		return matSco;
	}
	public void setMatSco(int matSco) {
		this.matSco = matSco;
	}
	public int getEngSco() {
		return engSco;
	}
	public void setEngSco(int engSco) {
		this.engSco = engSco;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}





	public StudentDTO(int num, String name, int korSco, int matSco, int engSco) {
		this.num = num;
		this.korSco = korSco;
		this.matSco = matSco;
		this.engSco = engSco;
		this.name = name;
		this.sum = korSco+matSco+engSco;
		this.avg = (double)(korSco+matSco+engSco)/3;
	}
	
	
	
	
}