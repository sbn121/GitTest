package pack03_constructor;

public class Ex03_CarMain {
public static void main(String[] args) {
	Ex03_Car ec = new Ex03_Car("����","�׷���","����");
		System.out.println("������ : "+ec.company);
		System.out.println("�� : "+ec.model);
		System.out.println("���� : "+ec.color);
		System.out.println("�ְ��ӵ� : �ü�"+ec.maxSpeed+"km");
		System.out.println("����ӵ� : �ü�"+ec.speed+"km");
	
}
}