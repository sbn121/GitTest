package pack;

public class Phone2DTO extends Phone1DTO {
	private String channel;
	
	
	
	public Phone2DTO(String color, String model, String state, String channel) {
		super(color, model, state);
		this.channel = channel;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	
	
}
