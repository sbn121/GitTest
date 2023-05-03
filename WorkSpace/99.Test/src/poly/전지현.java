package poly;

public class 전지현 implements 사람{

	@Override
	public void 호흡() {
		System.out.println("호흡중");
	}

	@Override
	public boolean 생사여부() {
		System.out.println("살아있음");
		return true;
	}
	
	public void 연기() {
		System.out.println("전지현은 배우고 연기함");
	}
}
