package pack_fifa;

public class FIFADTO {
	private int player_num;
	private String player_name;
	private int player_age;
	private String height, main_foot, position;
	private int price;
	
	
	
	
	
	
	public FIFADTO(int player_num, String player_name, int player_age, String height, String main_foot,
			String position, int price) {
		this.player_num = player_num;
		this.player_name = player_name;
		this.player_age = player_age;
		this.height = height;
		this.main_foot = main_foot;
		this.position = position;
		this.price = price;
	}
	public int getPlayer_num() {
		return player_num;
	}
	public void setPlayer_num(int player_num) {
		this.player_num = player_num;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getPlayer_age() {
		return player_age;
	}
	public void setPlayer_age(int player_age) {
		this.player_age = player_age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMain_foot() {
		return main_foot;
	}
	public void setMain_foot(String main_foot) {
		this.main_foot = main_foot;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
}
