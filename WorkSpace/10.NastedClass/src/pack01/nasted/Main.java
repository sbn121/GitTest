package pack01.nasted;

import pack01.nasted.A.*;
import pack01.nasted.A.AA.AAB;
import pack01.nasted.A.AA.BB;
import pack01.nasted.A.AA.BB.CC;
import pack01.nasted.A.AA.BB.CC.DD;
// static : �޸𸮿� ���� �ö����� <-�ش�Ÿ��(A)�� .������ ���� �� ��밡��
// instance : �޸𸮿� new �� �� �ö� <- �ν��Ͻ�ȭ�� ��ü�� .������ ���� �� ��밡��

public class Main {
	// Ŭ������ �߰�ȣ ���̿� �ִ� ��� �� --> �ظ���� : �ν��Ͻ� ��� / ����ƽ ���(static ����)
	// ���� ���� : Ŭ���� ���ο��� ��𼭵� ��밡����.
	
	// �ܺ� Ŭ�������� �ٸ� Ŭ���� ����� �����ϴ� ��� ��
	// �ν��Ͻ� ���(static x) : �ν��Ͻ�ȭ ������ ���ľ߸� ����(���)�� ����
	// ����ƽ ���(static o) : �ش��ϴ� Ŭ������ .�� ����(���)�� ����
	public static void main(String[] args) {
		// �ν��Ͻ�ȭ ���� : ������ �޼ҵ带 �̿��ϰų� ���Ҵ� ���� �Ͽ� null�� �ƴ� ������ �Ǵ� ���·� ����
		A a = new A(0);	// AŬ������ �߰�ȣ ������ ��� ��(���������� ���� ����)�� ����� �� ����
		System.out.println(a.aField);
		//B��� Ŭ������ Ŭ������ ������, A�� �ν��Ͻ� �����.
		
		B b = a.new B();
		System.out.println(b.bField);
		b.methodB();
		
		C c = new C();
		System.out.println(c.fieldC);
		c.methodC();
		
		a.methodD();
		
		AA aa = new AA();
		AAB aab = new AAB();
		aab.methodAAB();
		BB bb = aa.new BB();
		bb.methodAAB();
		CC cc = bb.new CC();
		cc.methodAAB();
		DD dd = cc.new DD();
	}
}
