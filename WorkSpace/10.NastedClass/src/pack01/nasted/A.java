package pack01.nasted;


public class A {
	int aField = 10; //�ν��Ͻ� ���
	// �ν��Ͻ�ȭ �������� ���Ǵ� ������ �޼ҵ�� ������ �������������� A(){}�� �����ǰ� �ִ�.(JVM ����)
	public A(int a) {
		
	}
	
	// �س��� �˰� �ִ� ��� �͵��� �ʵ�(���)�� �� �� �ִ�.��
	// B�� ������ �ִ� ���� bField��, methodB�� Main.java(main �޼ҵ�)���� ����غ���
	public class B{	
		public B() {System.out.println("B��ü ������");}
		int bField;
		
		void methodB() {
			System.out.println("�޼ҵ�");
		}
	}
	
	
	static class C{
		C() {System.out.println("C��ü�� ������");}
		int fieldC;
		void methodC() {
			System.out.println("C�޼ҵ�");
		}
	}
	
	//A�� ���
	public void methodD() {
		//A�� ����ϱ�? �ƴұ�?
		class D{
			D() {System.out.println("D�� ������");}
			int fieldD;
			void methodD() {
				System.out.println("�޼ҵ�D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}
	
	// ��? ��������, ���ú���
	// �޼ҵ� �������� ����� ������.
	int methodA() {
		int data=10;
		return data;
	}
	
	public static class AA{
		public static class AAB{
			void methodAAB() {
				System.out.println("AAB!");
			}
		}
		public class BB{
			void methodAAB() {
				System.out.println("BB!");
			}
			public class CC{
				void methodAAB() {
					System.out.println("CC!");
				}
				public class DD{
					int a= 10;
					public DD() {
						System.out.println(a);
					}
					
				}
			}
		}
	}
	
	
}