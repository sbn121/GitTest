package dao.dto.method;

public class MethodTest {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.method("564");
		int i = mt.method2(456);
		System.out.println(i);
	}
	
	public void method(String str) {
		System.out.println("입력받은 문자 : "+str);
	}
	
	public void method(int i) {
		System.out.println("입력받은 숫자 : "+ i);
	}
	
	public void method(boolean isTrue) {
	}
	
	public void method(String str, int i) {
		
	}
	public void method(String str, boolean isTrue) {
		
	}
	public void method(int i, boolean isTrue) {
		
	}
	public void method(boolean isTrue, String str) {
		
	}
	public void method(boolean isTrue, int i) {
		
	}
	public void method(int i, String str, boolean isTrue) {
		
	}
	
	public int method2(int i) {
		System.out.print("입력받은 숫자 x 100 = ");
		return i*100;
	}
}
