package pack;

public class Phone2DAO extends Phone1DAO{
	
	final int MAXCHANNEL = 300;
	final int MINCHANNEL = 0;
	
	@Override
	public void display(Phone1DTO dto) {
		System.out.print("색깔:"+dto.getColor()+"\t");
		System.out.print("모델명:"+dto.getModel()+"\t");
		System.out.print("상태 : "+dto.getState()+"\t");
		System.out.println("채널 : "+((Phone2DTO) dto).getChannel());
	}
	
	public void dmbOn(Phone2DTO dto) {
		System.out.println("DMB방송을 켭니다. 현재채널 : "+dto.getChannel());
		dto.setState("DMB 시청중");
	}
	
	public void dmbChange(Phone2DTO dto, String channel) {
		if(Integer.parseInt(channel)>MAXCHANNEL) {
			dto.setChannel(""+MAXCHANNEL);
		}else if(Integer.parseInt(channel)<MINCHANNEL) {
			dto.setChannel(""+MINCHANNEL);
		}else {
		dto.setChannel(channel);
		}
		System.out.println("DMB방송의 채널을 변경합니다. 현재채널 : "+dto.getChannel());
	}
	
	public void dmbOff(Phone2DTO dto) {
		System.out.println("DMB방송을 종료합니다.");
		dto.setState("켜짐");
	}
	 
}
