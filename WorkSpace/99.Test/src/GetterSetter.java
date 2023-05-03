
public class GetterSetter {
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 1) {
			System.out.println("잘못됨");
		}else {
		this.age = age;
		}
	}
	
	
	// 1. 개발자끼리 봤을 때 정확한 메소드의 기능을 판단하기 
	// 어려움(빠른 판단 불가)
	// -> getter & setter라는 메소드 이름규칙을 정함
	// getMethod : 필드의 값을 받아올 때 씀
	// setMethod : 필드의 값을 넣을 때 씀
	
	// 2. 다른 개발자는 메소드의 존재여부를 모르고
	// 변수에 바로 접근해서 -값을 넣을 수가 있음
	// -> private




	public void method(int num) {
		if(num<1) {
			System.out.println("잘못된 입력");
		}else {
			System.out.println("잘된입력");
			age = num;
			System.out.println(age + "gs.age의 값");
		}
	}
	
}
