package pack_fifa;

import java.util.Scanner;

public class FIFAMAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FIFAUSERDAO dao = new FIFAUSERDAO();
		FIFAADMINDAO dao1 = new FIFAADMINDAO();
		FIFASIGNUPDAO dao2 = new FIFASIGNUPDAO();
		while(true) {
			System.out.println("메뉴를 골라주세요.");
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			int menu = dao.inputInt();
			if(menu==1) {
				while(true) {
				System.out.println("1. 관리자 모드 2. 사용자 모드 3. 메인화면으로 가기");
				menu = dao.inputInt();
				if(menu==1) {
					if(dao1.adminLogin()) {
						while(true) {
						System.out.println("1. 선수 등록");
						System.out.println("2. 수정");
						System.out.println("3. 삭제");
						System.out.println("4. 선수 검색");
						System.out.println("5. 로그아웃");
						menu = dao.inputInt();
						if(menu==1) {
							dao1.addPlayer();
						}else if(menu==2) {
							dao1.updatePlayer();
						}else if(menu==3) {
							dao1.deletePlayer();
						}else if(menu==4) {
							dao1.search();
						}else if(menu==5) {
							System.out.println("로그아웃 되었습니다.");
							break;
						}else {
							System.out.println("입력 오류 1~5 사이의 수를 입력하세요.");
						}
						
					}
					}
				}else if(menu==2) {
					if(dao.login()) {
						while(true) {
						System.out.println("1. 내 선수 검색");
						System.out.println("2. 스쿼드");
						System.out.println("3. 상점");
						System.out.println("4. 탈퇴");
						System.out.println("5. 로그아웃");
						menu = dao.inputInt();
						if(menu==1) {
							dao.searchMyPlayer();
						}else if(menu==2) {
							System.out.println("1. 포메이션");
							System.out.println("2. 후보");
							while(true) {
							menu = dao.inputInt();
							if(menu==1) {
								dao.formation();
								break;
							}else if(menu==2) {
								dao.candidate();
								break;
							}else {
								System.out.println("입력 오류 1 또는 2를 입력해주세요.");
							}
							}
						}else if(menu==3) {
							System.out.println("1. 선수 구매하기");
							System.out.println("2. 선수 판매하기");
							System.out.println("3. Bp 충전하기");
							System.out.println("4. 현재 보유 Bp 확인하기");
							menu = dao.inputInt();
							if(menu==1) {
								dao.purchase();
							}else if(menu==2) {
								dao.sell();
							}else if(menu==3) {
								dao.chargeBP();
							}else if(menu==4) {
								dao.checkBP();
							}else {
								System.out.println("입력오류 1 또는 2를 입력해주세요");
							}
						}else if(menu==4) {
							dao.signout();
							break;
						}else if(menu==5) {
							System.out.println("로그아웃 되었습니다");
							break;
						}else {
							System.out.println("입력오류 1~5 사이의 수를 입력하세요");
						}
						}
					}
				}else if(menu==3) {
					System.out.println("메인화면으로 돌아갑니다.");
					break;
				}else {
					System.out.println("입력오류 1 또는 2를 입력해주세요.");
				}
				}
			}else if(menu==2) {
				dao2.signup();
			}else if(menu==3) {
				System.out.println("FIFA를 종료합니다.");
				break;
			}
		}
	}
}
