package pack03_constructor;

public class MemberDTOMain {
	public static void main(String[] args) {
		MemberDTO mdto = new MemberDTO("송빛나","fdsafdfdsa","64566656");
		mdto.나이 = 665654;
		System.out.println("이름 : "+mdto.이름);
		System.out.println("아이디 : "+mdto.아이디);
		System.out.println("패스워드 : "+mdto.패스워드);
		System.out.println("나이 : "+mdto.나이);
	}
}
