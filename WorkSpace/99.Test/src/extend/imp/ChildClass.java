package extend.imp;

public class ChildClass extends SuperParent{
	//extends : ��� ����� ���(private ����) + Ŭ������ ���
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		System.out.println(cc.superField);
		cc.childMethod();
		cc.testMethod();
		cc.testmethod2();
		
//		cc.interField = 10;	interface�� �ʵ�� �� ���� �Ұ�
		System.out.println(cc.interField);
	}
	
	public void childMethod() {
		System.out.println(superField);
		superMethod();
	}
}