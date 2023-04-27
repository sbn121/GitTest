package pack01.inter;

// 추상 클래스 : abstract class .. 추상 메소드 등
// 추상 == abstract : 메소드의 return타입, 메소드명, 파라메터만 지정이 돼있으며
// 실제 구현은 상속을 받은 객체가 override를 통해서 해야함. (방법만 제시)

// interface : ↑용도로 사용하기 위해서 만든 .java파일
// 대규모 프로젝트에서 어떤 방법을 일원화하기 위해서 많이 사용됨(전자 정부 프레임워크)
// public class(x) Class -> public interface(o)
public interface TestInterface {
	String IP = "192.168.0.38";	//인터페이스 내부에서 만든 변수는 상수(final)임
	//abstract가 앞에 붙어있다고 생각하면 됨.
	void test1();
	// PM, PL, 
	boolean join(String id, String pw);
	
	void test2();
}
