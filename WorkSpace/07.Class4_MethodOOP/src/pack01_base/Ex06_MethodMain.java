package pack01_base;

public class Ex06_MethodMain {
public static void main(String[] args) {
	Ex06_Method em = new Ex06_Method();
	em.v1();			//void
	em.v2("testData");	//void
	em.isB1();			//boolean
	em.isB2(5);			//boolean
	//메소드에 리턴타입이 주어지면 해당하는 타입의 변수라고 봐도 됨.
	//메소드에 리턴타입이 없으면 아무 타입도 아님.(실행 후 없어지는 코드 블럭)
	boolean isB1 = em.isB1();
	System.out.println(isB1);
//	System.out.println(em.v1());	//void
	System.out.println(em.isB1());	//boolean
	
	//조건식 핵심 : true or false일 것
	boolean isBoolean = 1<2;
	if(em.isB1()) {			//메소드 결과가 true일 때 false일 때에 따라서 if와 else 블럭 실행 여부가 바뀜
		
	}
	
	System.out.println(em.dMethod());
	System.out.println(em.aMethod()[0]);
	System.out.println(em.sMethod());
	em.v2(null);
	
	
	
}
}
