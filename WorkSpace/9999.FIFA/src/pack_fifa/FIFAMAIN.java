package pack_fifa;

import java.util.Scanner;

public class FIFAMAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FIFAUSERDAO dao = new FIFAUSERDAO();
		while(true) {
			System.out.println("메뉴를 골라주세요.");
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			int menu = dao.inputInt();
			if(menu==1) {
				while(true) {
				System.out.println("1. 관리자 모드 2. 사용자 모드");
				menu = dao.inputInt();
				if(menu==1) {
					
				}else if(menu==2) {
					dao.login();
					while(true) {
						System.out.println("1. 내 선수 검색");
						System.out.println("2. 스쿼드");
						System.out.println("3. 상점");
						System.out.println("4. 상태");
						System.out.println("5. 로그아웃");
						menu = dao.inputInt();
						if(menu==1) {
							dao.searchMyPlayer();
						}else if(menu==2) {
							
						}else if(menu==3) {
							System.out.println("1. 선수 구매하기");
							System.out.println("2. 선수 판매하기");
							menu = dao.inputInt();
							if(menu==1) {
								dao.displayList();
								System.out.println("구매할 선수의 번호를 입력해주세요.");
								menu = dao.inputInt();
								dao.buyPlayer(menu);
								
							}else if(menu==2) {
								dao.sellPlayer();
							}else {
								System.out.println("입력오류 1 또는 2를 입력해주세요");
							}
						}else if(menu==4) {
							
						}else if(menu==5) {
							System.out.println("로그아웃 되었습니다");
							break;
						}else {
							System.out.println("입력오류 1~5 사이의 수를 입력하세요");
						}
					}
				}else {
					System.out.println("입력오류 1 또는 2를 입력해주세요.");
				}
				}
			}else if(menu==2) {
				
			}else if(menu==3) {
				System.out.println("FIFA를 종료합니다.");
				break;
			}
		}
	}
}
