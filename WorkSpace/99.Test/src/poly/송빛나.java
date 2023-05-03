package poly;

public class 송빛나 implements 사람{

	@Override
	public void 호흡() {
		System.out.println("호흡중");
		코딩();
	}

	@Override
	public boolean 생사여부() {
		System.out.println("살아있음");
		return true;
	}
	
	public void 코딩() {
		System.out.println("개발자이기 때문에 기본구조에 + 코딩능력을 가지고 있음");
	}
	
}
