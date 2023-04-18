package pack01_base;

public class Ex07_OverLoading {
	//※메소드 오버로딩 : 같은 이름의 메소드를 파라메터의 개수나 타입을 달리하여 선택해서 사용할 수 있게한 것※
	
	void method() {
		
	}
	void method(int param1) {
		
	}
	void method(int param1, int param2) {
		
	}
	void method(String param1) {
		
	}
	
	
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
		//대표적으로 메소드 오버로딩이 되어있는 것은 println임
		//어떤 타입을 넣어도 일단 출력이 되게끔 만들어뒀음.
		System.out.println();
		eo.method();
	}
}
