package pack03_constructor;

public class Ex03_CarMain {
public static void main(String[] args) {
	Ex03_Car ec = new Ex03_Car("현대","그랜저","빨강");
		System.out.println("제조사 : "+ec.company);
		System.out.println("모델 : "+ec.model);
		System.out.println("색상 : "+ec.color);
		System.out.println("최고속도 : 시속"+ec.maxSpeed+"km");
		System.out.println("현재속도 : 시속"+ec.speed+"km");
	
}
}
