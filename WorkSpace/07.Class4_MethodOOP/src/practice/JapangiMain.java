package practice;

public class JapangiMain {
	public static void main(String[] args) {
		JapangiDAO dao = new JapangiDAO();
		while(true) {
			System.out.println("0. 관리자 모드, 1. 음료주문, -1. 종료");
			int inputMenu = dao.inputInt();
			if(inputMenu==0) {
				System.out.println("관리자 모드를 실행합니다.");
				System.out.println("보안 규칙에 따라 관리자 로그인을 해주세요.");
				AdminDAO aDao = new AdminDAO();
				if(aDao.adminLogin()) {
					System.out.println("1. 음료 추가 2. 음료 수정 3. 음료 삭제 -1. 메인 이동");
					inputMenu = dao.inputInt();
					if(inputMenu==1) {
						aDao.addMenu(dao);
					}else if(inputMenu==2) {
						
					}else if(inputMenu==3) {
						
					}else if(inputMenu==-1) {
						
					}else {
						System.out.println("잘못 입력하셨어요. 메인이동");
					}
				}
			}else if(inputMenu==1) {
				dao.display();
				System.out.println("돈을 넣어주세요.");
				int money = dao.inputMoney();
				System.out.println("금액 입력됨 : "+money);
				while(money!=1) {
					System.out.println("잔돈 : "+money+" 음료 번호를 입력해주세요");
					int choice = dao.choiceMenu();
					System.out.println(choice+"번 선택완료");
					money = dao.orderMenu(choice, money);
				}
			}else if(inputMenu==-1) {
				System.out.println("종료되었습니다.");
				break;
				
			}
		}
	}
}
