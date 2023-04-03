
public class Ex03_Bool {
	public static void main(String[] args) {
		// true > 1, false > 0
		// AND 연산자는 논리곱 TRUE(1) * FALSE(0) = FALSE(0)
		// 로그인 (아이디가(TRUE) * 비밀번호(FALSE) = TRUE)
		// OR 연산자는 논리합 TRUE(1) + FALSE(0) = TRUE
		// 한 가지의 조건만 만족을 시키면 TRUE일 때
		// 좋아하는 과일을 1 가지 이상 선택해주세요(과일1(선택), 과일2, 과일3)
		// AND 연산자 &, OR 연산자 |
		
		// NOT => !
		// 어떤 TRUE, FALSE(bool)앞에 붙이면 해당 결과를 반전시킴.
		boolean b1=true, b2= false;
		System.out.println(!b1);
		System.out.println(!b2);
}

}
