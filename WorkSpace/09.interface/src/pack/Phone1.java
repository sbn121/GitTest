package pack;

public class Phone1 {
	public static void main(String[] args) {
		Phone1DAO dao= new Phone1DAO();
		Phone1DTO p1dto= new Phone1DTO("����", "����", "����");
		
		dao.display(p1dto);
		
		
		System.out.println("������ Ű�÷��� 1���� �Է����ּ���. 1�� ������ ��� �� �Է� �� ���� ���� ����");
			
			int inputMenu = dao.inputNum();
			while(true) {
			if(inputMenu==1) {
				dao.turnOn(p1dto);
				while(p1dto.getState().equals("����")||p1dto.getState().equals("��ȭ��")) {
				System.out.println("1. ��ȭ �ޱ� 2. ��ȭ ���� 3. �����޼��� ���� �� �����ϱ� 4. ���� ����");
				inputMenu = dao.inputNum();
				if(inputMenu==1) {
					if(p1dto.getState().equals("����")) {
						dao.callOn(p1dto);
					}else {
						System.out.println("������ �����־� ��ȭ �ޱⰡ �Ұ��մϴ�.");
					}
				}else if(inputMenu==2) {
					if(p1dto.getState().equals("��ȭ��")) {
						dao.callOff(p1dto);
					}else {
						System.out.println("��ȭ ���� �ƴմϴ�. ��ȭ�� ���� �� �����ϴ�.");
					}
				}else if(inputMenu==3) {
					if(p1dto.getState().equals("��ȭ��")) {
						System.out.println("������ ���� �Է����ּ���");
						dao.send(p1dto);
					}else {
						System.out.println("��ȭ ���� �ƴմϴ�. ���� ���� �� ������ �Ұ����մϴ�.");
					}
				}else if(inputMenu==4){
					dao.turnOff(p1dto);
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