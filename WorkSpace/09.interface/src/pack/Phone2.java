package pack;

public class Phone2 extends Phone1 {
	public static void main(String[] args) {
		Phone2DAO dao= new Phone2DAO();
		Phone2DTO p2dto = new Phone2DTO(p2dto.getColor(), p2dto.getModel(), p2dto.getState(), "정보없음");
		
		
		System.out.println("전원을 키시려면 1번을 입력해주세요. 1을 제외한 모든 수 입력 시 꺼진 상태 유지");
			
			int inputMenu = dao.inputNum();
			while(true) {
			if(inputMenu==1) {
				dao.turnOn(p2dto);
				while(p2dto.getState().equals("켜짐")||p2dto.getState().equals("전화중")) {
				System.out.println("1. 전화 받기 2. 전화 끊기 3. 음성메세지 전송 및 수신하기 5. 전원 끄기");
				inputMenu = dao.inputNum();
				if(inputMenu==1) {
					if(p2dto.getState().equals("켜짐")) {
						dao.callOn(p2dto);
					}else {
						System.out.println("전원이 꺼져있어 전화 받기가 불가합니다.");
					}
				}else if(inputMenu==2) {
					if(p2dto.getState().equals("전화중")) {
						dao.callOff(p2dto);
					}else {
						System.out.println("전화 중이 아닙니다. 전화를 끊을 수 없습니다.");
					}
				}else if(inputMenu==3) {
					if(p2dto.getState().equals("전화중")) {
						System.out.println("전송할 말을 입력해주세요");
						dao.send(dao);
					}else {
						System.out.println("전화 중이 아닙니다. 음성 전송 및 수신이 불가능합니다.");
					}
				}else if(inputMenu==5){
					dao.turnOff(p2dto);
				}else {
					System.out.println("입력 오류 1~4사이의 수를 입력해주세요");
				}
				}
			}else {
				System.out.println("전원이 꺼진 상태로 유지됩니다.");
				break;
			}
		}
		
		
		
		
		
		
		
	}
}
