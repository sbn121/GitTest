package pack01.extend;

//extends라는 상속 명령어를 통해 내가 구현해야할 기능을 가진 부모를 선택한다.
//부모와 자식관계가 형성된다.
//class extends (부모클래스)
//클래스의 상속(extends)
public class ChildClass extends ParentClass{
	String child_field = "자식 클래스의 필드입니다.";
	public void childMethod() {
		System.out.println("자식 클래스의 메소드입니다.");
	}
}
