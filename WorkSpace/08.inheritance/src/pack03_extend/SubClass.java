package pack03_extend;

public class SubClass extends SuperClass{
	// SubŬ�������� �θ�Ŭ������ ����� �״�� ����ϴ� �� �ƴ϶� �޸��ϰ� ����.
	// -> ���� ���̵� (Override), ������
	// �θ�Ŭ������ �޼ҵ� ���´� �����ϵ�, ������ �ٲ� �����ϴ� ��.
	// super <- �θ�Ŭ������ ~
	@Override // annotation(������̼�) : ��ǻ�Ͱ� �ؼ��ϴ� �ּ�
	public int sum(int num1, int num2) {
		return num1+num2+3;	//�θ�Ŭ������ ����� �ٲٴ� ��
	}
	
	
	public int mul(int num1, int num2) {
		return num1*num2;
	} 
	public int div(int num1, int num2) {
		return num1/num2;
	} 
	public int div_re(int num1, int num2) {
		return num1%num2;
	} 
}