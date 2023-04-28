package pack;

public class Phone3 extends Phone2{
	public static void main(String[] args) {
		Phone3DAO dao= new Phone3DAO();
		Phone3DTO p3dto = new Phone3DTO("검정", "애플", "꺼짐", "정보없음");
		
		dao.display(p3dto);
		
		System.out.println("전원을 키시려면 1번을 입력해주세요. 1을 제외한 모든 수 입력 시 꺼진 상태 유지");
			
			int inputMenu = dao.inputNum();
			while(true) {
			if(inputMenu==1) {
				dao.turnOn(p3dto);
				while(p3dto.getState().equals("켜짐")) {
				System.out.println("1. 전화 받기 2. DMB방송 키기 3. 인터넷 사용하기 4. 전원 끄기");
				inputMenu = dao.inputNum();
				if(inputMenu==1) {
					if(p3dto.getState().equals("켜짐")) {
						dao.callOn(p3dto);
						while(p3dto.getState().equals("전화중")) {
						System.out.println("1. 음성 전송하기 2. 음성 수신하기 3. 인터넷 사용하기 4. 전화 끊기");
						inputMenu =dao.inputNum();
							if(inputMenu==1) {
								System.out.print("나 : ");
								dao.send(p3dto);
							}else if(inputMenu==2) {
								System.out.print("상대방 : ");
								dao.receive(p3dto);
							}else if(inputMenu==3){
								dao.internetOn(p3dto);
								while(p3dto.getState().equals("인터넷 켜짐")) {
								System.out.println("1. 웹툰 앱 실행하기 2. 인터넷 종료하기");
								inputMenu = dao.inputNum();
								if(inputMenu==1) {
									dao.webtoonOn(p3dto);
									System.out.println("1. 웹툰 앱 종료하기 2. 인터넷 종료하기");
									inputMenu=dao.inputNum();
									if(inputMenu==1) {
										dao.webtoonOff(p3dto);
									}else if(inputMenu==2) {
										dao.internetOff(p3dto);
										p3dto.setState("전화중");
									}else {
										System.out.println("입력 오류 1 또는 2를 입력해주세요");
									}
								}else if(inputMenu==2) {
									dao.internetOff(p3dto);
									p3dto.setState("전화중");
								}else {
									System.out.println("입력 오류 1 또는 2를 입력해주세요");
								}
								}
							}else if(inputMenu==4) {
								dao.callOff(p3dto);
							}else {
								System.out.println("입력 오류 1~3사이의 수를 입력해주세요");
							}
						}
					}else {
						System.out.println("전원이 꺼져있어 전화 받기가 불가합니다.");
					}
				}else if(inputMenu==2) {
					if(p3dto.getState().equals("켜짐")) {
						dao.dmbOn(p3dto);
						while(p3dto.getState().equals("DMB 시청중")) {
						System.out.println("1. DMB 채널 바꾸기 2. DMB 끄기 3. 인터넷 사용하기");
						inputMenu = dao.inputNum();
						if(inputMenu==1) {
							System.out.println("바꿀 채널의 번호를 입력해주세요(1~300)");
							System.out.print(p3dto.getChannel()+" -> ");
							int inputChannel = dao.inputNum();
							dao.dmbChange(p3dto, ""+inputChannel);
						}else if(inputMenu==2) {
							dao.dmbOff(p3dto);
						}else if(inputMenu==3){
							dao.internetOn(p3dto);
							while(p3dto.getState().equals("인터넷 켜짐")) {
							System.out.println("1. 웹툰 앱 실행하기 2. 인터넷 종료하기");
							inputMenu = dao.inputNum();
							if(inputMenu==1) {
								dao.webtoonOn(p3dto);
								System.out.println("1. 웹툰 앱 종료하기 2. 인터넷 종료하기");
								inputMenu=dao.inputNum();
								if(inputMenu==1) {
									dao.webtoonOff(p3dto);
								}else if(inputMenu==2) {
									dao.internetOff(p3dto);
									p3dto.setState("DMB 시청중");
								}else {
									System.out.println("입력 오류 1 또는 2를 입력해주세요");
								}
							}else if(inputMenu==2) {
								dao.internetOff(p3dto);
								p3dto.setState("DMB 시청중");
							}else {
								System.out.println("입력 오류 1 또는 2를 입력해주세요");
							}
							}
						}else {
							System.out.println("입력 오류 1 또는 2를 입력해주세요");
						}
						}
					}else {
						System.out.println("전원이 꺼져있어 DMB를 이용할 수 없습니다.");
					}
				}else if(inputMenu==3) {
					if(p3dto.getState().equals("켜짐")) {
						dao.internetOn(p3dto);
						while(p3dto.getState().equals("인터넷 켜짐")) {
						System.out.println("1. 웹툰 앱 실행하기 2. 인터넷 종료하기");
						inputMenu = dao.inputNum();
						if(inputMenu==1) {
							dao.webtoonOn(p3dto);
							System.out.println("1. 웹툰 앱 종료하기 2. 인터넷 종료하기");
							inputMenu=dao.inputNum();
							if(inputMenu==1) {
								dao.webtoonOff(p3dto);
							}else if(inputMenu==2) {
								dao.internetOff(p3dto);
							}else {
								System.out.println("입력 오류 1 또는 2를 입력해주세요");
							}
						}else if(inputMenu==2) {
							dao.internetOff(p3dto);
						}else {
							System.out.println("입력 오류 1 또는 2를 입력해주세요");
						}
						}
					}else {
						System.out.println("전원이 꺼져있어 인터넷을 이용할 수 없습니다.");
				}
				}else if(inputMenu==4) {
					dao.turnOff(p3dto);
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
