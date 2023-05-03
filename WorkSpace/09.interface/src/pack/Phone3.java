package pack;

public class Phone3 extends Phone2{
	public static void main(String[] args) {
		Phone3DAO dao= new Phone3DAO();
		Phone3DTO p3dto = new Phone3DTO("����", "����", "����", "��������");
		
		dao.display(p3dto);
		
		System.out.println("������ Ű�÷��� 1���� �Է����ּ���. 1�� ������ ��� �� �Է� �� ���� ���� ����");
			
			int inputMenu = dao.inputNum();
			while(true) {
			if(inputMenu==1) {
				dao.turnOn(p3dto);
				while(p3dto.getState().equals("����")) {
				System.out.println("1. ��ȭ �ޱ� 2. DMB��� Ű�� 3. ���ͳ� ����ϱ� 4. ���� ����");
				inputMenu = dao.inputNum();
				if(inputMenu==1) {
					if(p3dto.getState().equals("����")) {
						dao.callOn(p3dto);
						while(p3dto.getState().equals("��ȭ��")) {
						System.out.println("1. ���� �����ϱ� 2. ���� �����ϱ� 3. ���ͳ� ����ϱ� 4. ��ȭ ����");
						inputMenu =dao.inputNum();
							if(inputMenu==1) {
								System.out.print("�� : ");
								dao.send(p3dto);
							}else if(inputMenu==2) {
								System.out.print("���� : ");
								dao.receive(p3dto);
							}else if(inputMenu==3){
								dao.internetOn(p3dto);
								while(p3dto.getState().equals("���ͳ� ����")) {
								System.out.println("1. ���� �� �����ϱ� 2. ���ͳ� �����ϱ�");
								inputMenu = dao.inputNum();
								if(inputMenu==1) {
									dao.webtoonOn(p3dto);
									System.out.println("1. ���� �� �����ϱ� 2. ���ͳ� �����ϱ�");
									inputMenu=dao.inputNum();
									if(inputMenu==1) {
										dao.webtoonOff(p3dto);
									}else if(inputMenu==2) {
										dao.internetOff(p3dto);
										p3dto.setState("��ȭ��");
									}else {
										System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
									}
								}else if(inputMenu==2) {
									dao.internetOff(p3dto);
									p3dto.setState("��ȭ��");
								}else {
									System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
								}
								}
							}else if(inputMenu==4) {
								dao.callOff(p3dto);
							}else {
								System.out.println("�Է� ���� 1~3������ ���� �Է����ּ���");
							}
						}
					}else {
						System.out.println("������ �����־� ��ȭ �ޱⰡ �Ұ��մϴ�.");
					}
				}else if(inputMenu==2) {
					if(p3dto.getState().equals("����")) {
						dao.dmbOn(p3dto);
						while(p3dto.getState().equals("DMB ��û��")) {
						System.out.println("1. DMB ä�� �ٲٱ� 2. DMB ���� 3. ���ͳ� ����ϱ�");
						inputMenu = dao.inputNum();
						if(inputMenu==1) {
							System.out.println("�ٲ� ä���� ��ȣ�� �Է����ּ���(1~300)");
							System.out.print(p3dto.getChannel()+" -> ");
							int inputChannel = dao.inputNum();
							dao.dmbChange(p3dto, ""+inputChannel);
						}else if(inputMenu==2) {
							dao.dmbOff(p3dto);
						}else if(inputMenu==3){
							dao.internetOn(p3dto);
							while(p3dto.getState().equals("���ͳ� ����")) {
							System.out.println("1. ���� �� �����ϱ� 2. ���ͳ� �����ϱ�");
							inputMenu = dao.inputNum();
							if(inputMenu==1) {
								dao.webtoonOn(p3dto);
								System.out.println("1. ���� �� �����ϱ� 2. ���ͳ� �����ϱ�");
								inputMenu=dao.inputNum();
								if(inputMenu==1) {
									dao.webtoonOff(p3dto);
								}else if(inputMenu==2) {
									dao.internetOff(p3dto);
									p3dto.setState("DMB ��û��");
								}else {
									System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
								}
							}else if(inputMenu==2) {
								dao.internetOff(p3dto);
								p3dto.setState("DMB ��û��");
							}else {
								System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
							}
							}
						}else {
							System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
						}
						}
					}else {
						System.out.println("������ �����־� DMB�� �̿��� �� �����ϴ�.");
					}
				}else if(inputMenu==3) {
					if(p3dto.getState().equals("����")) {
						dao.internetOn(p3dto);
						while(p3dto.getState().equals("���ͳ� ����")) {
						System.out.println("1. ���� �� �����ϱ� 2. ���ͳ� �����ϱ�");
						inputMenu = dao.inputNum();
						if(inputMenu==1) {
							dao.webtoonOn(p3dto);
							System.out.println("1. ���� �� �����ϱ� 2. ���ͳ� �����ϱ�");
							inputMenu=dao.inputNum();
							if(inputMenu==1) {
								dao.webtoonOff(p3dto);
							}else if(inputMenu==2) {
								dao.internetOff(p3dto);
							}else {
								System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
							}
						}else if(inputMenu==2) {
							dao.internetOff(p3dto);
						}else {
							System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
						}
						}
					}else {
						System.out.println("������ �����־� ���ͳ��� �̿��� �� �����ϴ�.");
				}
				}else if(inputMenu==4) {
					dao.turnOff(p3dto);
				}else {
					System.out.println("�Է� ���� 1~4������ ���� �Է����ּ���");
				}
				}
			}else {
				System.out.println("������ ���� ���·� �����˴ϴ�.");
				break;
			}
		}
}
}