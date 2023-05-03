package extend.imp;

public class SuperParent implements TestInterface, Camera{
	// interface는 구조의 상속(implements vs extends) 구조 vs 멤버
	//                                           interface vs Class
	//                                     변수는 상수(final)
	// 1세대로 만드는 클래스
	int superField = 10;
	
	void superMethod() {
		System.out.println("SuperParent 부모 클래스");
	}

	@Override
	public void testMethod() {
		System.out.println("테스트 메소드 구현");
	}

	@Override
	public int testmethod2() {
		System.out.println("테스트 메소드2 구현");
		return 2;
	}

	@Override
	public void cameraShot() {
		
	}
}
