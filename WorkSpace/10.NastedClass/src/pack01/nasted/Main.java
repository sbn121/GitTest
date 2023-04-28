package pack01.nasted;

import pack01.nasted.A.*;
import pack01.nasted.A.AA.AAB;
import pack01.nasted.A.AA.BB;
import pack01.nasted.A.AA.BB.CC;
import pack01.nasted.A.AA.BB.CC.DD;
// static : 메모리에 먼저 올라가있음 <-해당타입(A)에 .찍으면 접근 및 사용가능
// instance : 메모리에 new 할 때 올라감 <- 인스턴스화한 객체에 .찍으면 접근 및 사용가능

public class Main {
	// 클래스의 중괄호 사이에 있는 모든 것 --> ※멤버※ : 인스턴스 멤버 / 스태틱 멤버(static 여부)
	// 전역 변수 : 클래스 내부에서 어디서든 사용가능함.
	
	// 외부 클래스에서 다른 클래스 멤버에 접근하는 방법 ↑
	// 인스턴스 멤버(static x) : 인스턴스화 과정을 거쳐야만 접근(사용)이 가능
	// 스태틱 멤버(static o) : 해당하는 클래스에 .찍어도 접근(사용)이 가능
	public static void main(String[] args) {
		// 인스턴스화 과정 : 생성자 메소드를 이용하거나 값할당 등을 하여 null이 아닌 참조가 되는 상태로 만듬
		A a = new A(0);	// A클래스의 중괄호 사이의 모든 것(접근제한자 차이 제외)을 사용할 수 있음
		System.out.println(a.aField);
		//B라는 클래스는 클래스가 맞지만, A의 인스턴스 멤버임.
		
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
