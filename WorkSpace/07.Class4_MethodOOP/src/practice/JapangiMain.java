package practice;

public class JapangiMain {
	public static void main(String[] args) {
		JapangiDAO dao = new JapangiDAO();
		while(true) {
			System.out.println("0. ������ ���, 1. �����ֹ�, -1. ����");
			int inputMenu = dao.inputInt();
			if(inputMenu==0) {
				System.out.println("������ ��带 �����մϴ�.");
				System.out.println("���� ��Ģ�� ���� ������ �α����� ���ּ���.");
				AdminDAO aDao = new AdminDAO();
				if(aDao.adminLogin()) {
					System.out.println("1. ���� �߰� 2. ���� ���� 3. ���� ���� -1. ���� �̵�");
					inputMenu = dao.inputInt();
					if(inputMenu==1) {
						aDao.addMenu(dao);
					}else if(inputMenu==2) {
						
					}else if(inputMenu==3) {
						
					}else if(inputMenu==-1) {
						
					}else {
						System.out.println("�߸� �Է��ϼ̾��. �����̵�");
					}
				}
			}else if(inputMenu==1) {
				dao.display();
				System.out.println("���� �־��ּ���.");
				int money = dao.inputMoney();
				System.out.println("�ݾ� �Էµ� : "+money);
				while(money!=1) {
					System.out.println("�ܵ� : "+money+" ���� ��ȣ�� �Է����ּ���");
					int choice = dao.choiceMenu();
					System.out.println(choice+"�� ���ÿϷ�");
					money = dao.orderMenu(choice, money);
				}
			}else if(inputMenu==-1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
				
			}
		}
	}
}
