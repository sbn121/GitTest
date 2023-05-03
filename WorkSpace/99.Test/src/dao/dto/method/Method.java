package dao.dto.method;

public class Method {
	public static void main(String[] args) {
		Method mt = new Method();
		mt.동생한테용돈(10000);
		
		int money = mt.라면심부름(100000);
		System.out.println("심부름 끝나고 나서 내가 받은 금액 "+ money);
		// 반드시 int를 리턴하는 메소드
		// ↕둘은 같다 ==> 숫자만 표현가능
		// int
	}
	public void 동생한테용돈(int money) {
		money = 20000; // 어떤 기능에 의해서 값이 바뀜
		System.out.println(money+"원 동생한테 용돈 줌. <알아서 쓰기 때문에 결과는 필요없음");
		System.out.println(money + "원은 메소드 내부에서만 존재하고 그 외에서는 메모리에 존재 x");
	}
	public int 라면심부름(int money) {
		System.out.println("동생한테 라면 심부름 시킴 "+money+"원을 줌");
		System.out.println("수고비와 라면값이 깎임 50000");
		money -= 50000;
		return money;
	}
	
	// void : x : 현실에서 어떤 지시를 했을 때 그 결과가 필요없는 경우 : 
	// 동생한테 용돈을 준 경우, 기부, 볼일을 보고 물을 내린 경우
	
	// return : 현실에서 어떤 지시를 했을 때 그 결과가 필요한 경우 : 
	// 동생한테 라면심부름 시켰을 때 라면을 가져옴
	
}
