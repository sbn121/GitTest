package pack05_abstrac;
//�߻�Ŭ������� ���� ��ü�� ������� ����ϴ� �� �ƴϴ�.
	//��ü�� ����� �� �ƴ϶� �θ�ν� ��ӹ��� ��ü���� ����� �̸� �����س��� ��(����)
	//�߻� abstract?
public abstract class Animal {
	public String kind;	//������ �ĺ��ϱ� ���� �ʵ� : ���, �����, ������
	
	public void breathe() {
		System.out.println("������ ���� ����.");
	}
	
	public abstract void sound();//abstract�޼ҵ�� �޼ҵ��� ����Ÿ���̳� �޼ҵ��� �̸� �Ű����� ����
								 //������ ����� ����, ���� ������ �ڽ�Ŭ������ �������ؼ� �Ѵ�.
}
