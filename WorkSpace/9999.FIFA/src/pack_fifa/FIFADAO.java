package pack_fifa;

import java.util.ArrayList;

public class FIFADAO {
	
	ArrayList<FIFADTO> myList = new ArrayList<>();
	
	
	
	public void searchMyPlayer() {
		for(int i=0; i<myList.size(); i++) {
			System.out.print("번호 : "+myList.get(i).getPlayer_num());
			System.out.print("이름 : "+myList.get(i).getPlayer_name());
			System.out.print("나이 : "+myList.get(i).getPlayer_age());
			System.out.print("키 : "+myList.get(i).getHeight());
			System.out.print("주발 : "+myList.get(i).getMain_foot());
			System.out.print("번호 : "+myList.get(i).getPosition());
			System.out.println();
		}
	}
	
	public void formation() {
		System.out.println("포메이션을 선택해주세요");
		System.out.println("1번 4-2-3-1\t2번 4-2-2-1-1\t3번 4-2-2-2\t4번 5-2-3");
		System.out.println("     ★    \t      ★    \t   ★   ★  \t★   ★   ★");
		System.out.println("  ★  ★  ★ \t      ★    \t ★       ★\t  ★   ★");
		System.out.println(" ★  ★ ★  ★\t   ★     ★ \t   ★   ★  \t★ ★ ★ ★ ★");
		System.out.println("     ☆    \t  ★  ★ ★  ★\t ★  ★ ★  ★\t    ☆");
		System.out.println("          \t      ☆    \t     ☆    ");
//		System.out.println("★   ★   ★");
//		System.out.println("  ★   ★");
//		System.out.println("★ ★ ★ ★ ★");
//		System.out.println("    ☆");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
