package test01_oop1;

public class JapangiDTO {
	//음료의 속성 : 음료의 이름, 가격, 수량
	//변수에 바로 접근하는 것에 제한을 둠(접근 제한자)
	//public으로 어디서든 접근 가능한 메소드를 통해서 변수에 접근하게 만들어야함 ==> getter&setter
	private String name;
	private int price, cnt;
	
	
	
	public JapangiDTO(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
