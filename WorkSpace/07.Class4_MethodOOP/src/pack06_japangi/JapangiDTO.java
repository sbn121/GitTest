package pack06_japangi;

public class JapangiDTO {
	private int num, price, count;
	private String name;
	private int userMoney, inputMoney;
	

	public JapangiDTO() {
		
	}

	public JapangiDTO(int num, String name, int price, int count) {
		this.num = num;
		this.price = price;
		this.count = count;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}

	public int getInputMoney() {
		return inputMoney;
	}

	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
		userMoney +=inputMoney;
	}
}