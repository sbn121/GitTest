package pack05_abstrac;

//������ : ����, ������ (�⺻��)Ư���� ��ӹ޾� �����ؾ� �� �ڽ�Ŭ����
public class Cat extends Animal {

	@Override
	public void sound() {//�߻� �޼ҵ忡�� abstract�� �����س��� ������ ���� �޼ҵ�� �ݵ�� �ڽİ�ü�� 
						 //�������ؼ� �����ؾ��Ѵ�.
		System.out.println("�����̰� �Ҹ�����. �߿�!");
	}

}