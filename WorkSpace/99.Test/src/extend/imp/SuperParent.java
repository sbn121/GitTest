package extend.imp;

public class SuperParent implements TestInterface, Camera{
	// interface�� ������ ���(implements vs extends) ���� vs ���
	//                                           interface vs Class
	//                                     ������ ���(final)
	// 1����� ����� Ŭ����
	int superField = 10;
	
	void superMethod() {
		System.out.println("SuperParent �θ� Ŭ����");
	}

	@Override
	public void testMethod() {
		System.out.println("�׽�Ʈ �޼ҵ� ����");
	}

	@Override
	public int testmethod2() {
		System.out.println("�׽�Ʈ �޼ҵ�2 ����");
		return 2;
	}

	@Override
	public void cameraShot() {
		
	}
}
