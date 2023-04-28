package pack01.nasted;


public class A {
	int aField = 10; //인스턴스 멤버
	// 인스턴스화 과정에서 사용되는 생성자 메소드는 별도로 구현하지않으면 A(){}로 제공되고 있다.(JVM 무시)
	public A(int a) {
		
	}
	
	// ※내가 알고 있는 모든 것들은 필드(멤버)가 될 수 있다.※
	// B가 가지고 있는 변수 bField와, methodB를 Main.java(main 메소드)에서 사용해보기
	public class B{	
		public B() {System.out.println("B객체 생성됨");}
		int bField;
		
		void methodB() {
			System.out.println("메소드");
		}
	}
	
	
	static class C{
		C() {System.out.println("C객체가 생성됨");}
		int fieldC;
		void methodC() {
			System.out.println("C메소드");
		}
	}
	
	//A의 멤버
	public void methodD() {
		//A의 멤버일까? 아닐까?
		class D{
			D() {System.out.println("D가 생성됨");}
			int fieldD;
			void methodD() {
				System.out.println("메소드D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}
	
	// ↓? 지역변수, 로컬변수
	// 메소드 내에서만 사용이 가능함.
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
