package pack01_base;

public class Ex05_Const {
	int id;
	String pw;
	
	//Ex05_Const라는 클래스는 반드시 int형 데이터 1 개와 String형 데이터 1개가 입력되어야 생성 가능
	//※생성자 메소드 오버로딩 : 같은 이름의 메소드를 파라메터의 개수나 타입을 달리하여 중복시켜 정의하는 것※
	
	
	public Ex05_Const(int id) {
		this.id = id;
	}
	
	public Ex05_Const(int id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	//어떤 메소드가 호출되었는지 모호한 경우에는 컴퓨터는 오류라고 인식한다.(true or false)
//	public Ex05_Const(int id, String pw) {
//		this.id = id;
//		this.pw = pw;
//	}
	
	
}
