package pack01_base;

public class Ex06_MethodMain {
public static void main(String[] args) {
	Ex06_Method em = new Ex06_Method();
	em.v1();			//void
	em.v2("testData");	//void
	em.isB1();			//boolean
	em.isB2(5);			//boolean
	//�޼ҵ忡 ����Ÿ���� �־����� �ش��ϴ� Ÿ���� ������� ���� ��.
	//�޼ҵ忡 ����Ÿ���� ������ �ƹ� Ÿ�Ե� �ƴ�.(���� �� �������� �ڵ� ����)
	boolean isB1 = em.isB1();
	System.out.println(isB1);
//	System.out.println(em.v1());	//void
	System.out.println(em.isB1());	//boolean
	
	//���ǽ� �ٽ� : true or false�� ��
	boolean isBoolean = 1<2;
	if(em.isB1()) {			//�޼ҵ� ����� true�� �� false�� ���� ���� if�� else ���� ���� ���ΰ� �ٲ�
		
	}
	
	System.out.println(em.dMethod());
	System.out.println(em.aMethod()[0]);
	System.out.println(em.sMethod());
	em.v2(null);
	
	
	
}
}