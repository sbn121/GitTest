package pack;

public class Phone2 extends Phone1{
	public static void main(String[] args) {
		Phone2DAO dao= new Phone2DAO();
		Phone2DTO p2dto = new Phone2DTO("����", "����", "����", "��������");
		
		dao.display(p2dto);
		
		
		System.out.println("������ Ű�÷��� 1���� �Է����ּ���. 1�� ������ ��� �� �Է� �� ���� ���� ����");
			
			int inputMenu = dao.inputNum();
			while(true) {
			if(inputMenu==1) {
				dao.turnOn(p2dto);
				while(p2dto.getState().equals("����")||p2dto.getState().equals("��ȭ��")) {
				System.out.println("1. ��ȭ �ޱ� 2. DMB��� Ű�� 3. ���� ����");
				inputMenu = dao.inputNum();
				if(inputMenu==1) {
					if(p2dto.getState().equals("����")) {
						dao.callOn(p2dto);
						while(p2dto.getState().equals("��ȭ��")) {
						System.out.println("1. ��ȭ ���� 2. ���� �����ϱ� 3. ���� �����ϱ�");
						inputMenu =dao.inputNum();
							if(inputMenu==1) {
								dao.callOff(p2dto);
							}else if(inputMenu==2) {
								System.out.print("�� : ");
								dao.send(p2dto);
							}else if(inputMenu==3) {
								System.out.print("���� : ");
								dao.receive(p2dto);
							}else {
								System.out.println("�Է� ���� 1~3������ ���� �Է����ּ���");
							}
						}
					}else {
						System.out.println("������ �����־� ��ȭ �ޱⰡ �Ұ��մϴ�.");
					}
				}else if(inputMenu==2) {
					if(p2dto.getState().equals("����")) {
						dao.dmbOn(p2dto);
						while(p2dto.getState().equals("DMB ��û��")) {
						System.out.println("1. DMB ä�� �ٲٱ� 2. DMB ����");
						inputMenu = dao.inputNum();
						if(inputMenu==1) {
							System.out.println("�ٲ� ä���� ��ȣ�� �Է����ּ���");
							System.out.print(p2dto.getChannel()+" -> ");
							int inputChannel = dao.inputNum();
							dao.dmbChange(p2dto, ""+inputChannel);
						}else if(inputMenu==2) {
							dao.dmbOff(p2dto);
						}else {
							System.out.println("�Է� ���� 1 �Ǵ� 2�� �Է����ּ���");
						}
						}
					}else {
						System.out.println("DMB�� �̿��� �� �����ϴ�.");
					}
				}else if(inputMenu==3) {
					dao.turnOff(p2dto);
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