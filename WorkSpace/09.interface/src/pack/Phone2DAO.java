package pack;

public class Phone2DAO extends Phone1DAO{
	
	final int MAXCHANNEL = 300;
	final int MINCHANNEL = 0;
	
	@Override
	public void display(Phone1DTO dto) {
		System.out.print("����:"+dto.getColor()+"\t");
		System.out.print("�𵨸�:"+dto.getModel()+"\t");
		System.out.print("���� : "+dto.getState()+"\t");
		System.out.println("ä�� : "+((Phone2DTO) dto).getChannel());
	}
	
	public void dmbOn(Phone2DTO dto) {
		System.out.println("DMB����� �մϴ�. ����ä�� : "+dto.getChannel());
		dto.setState("DMB ��û��");
	}
	
	public void dmbChange(Phone2DTO dto, String channel) {
		if(Integer.parseInt(channel)>MAXCHANNEL) {
			dto.setChannel(""+MAXCHANNEL);
		}else if(Integer.parseInt(channel)<MINCHANNEL) {
			dto.setChannel(""+MINCHANNEL);
		}else {
		dto.setChannel(channel);
		}
		System.out.println("DMB����� ä���� �����մϴ�. ����ä�� : "+dto.getChannel());
	}
	
	public void dmbOff(Phone2DTO dto) {
		System.out.println("DMB����� �����մϴ�.");
		dto.setState("����");
	}
	 
}