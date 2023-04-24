package pack06_japangi;

import java.util.Scanner;

public class JapangiDAO {
	
	public void display(JapangiDTO[] menu) {
		for(int i =0;i<menu.length;i++) {
			System.out.print(menu[i].getNum()+". ");
			System.out.print(menu[i].getName()+" ");
			System.out.print(menu[i].getPrice()+"원 ");
			System.out.println("재고 : "+menu[i].getCount()+" ");
		}
	}
		
	public Scanner sc() {
		return new Scanner(System.in);
	}
	int i=0;
	int ad=0;
	public int inputCoin(JapangiDTO dto) {	//소지 금액 입력
		while(true) {
			System.out.println("돈을 넣어주세요");
			try {
				dto.setUserMoney(Integer.parseInt(sc().nextLine()));
				if(dto.getUserMoney()<=0||dto.getUserMoney()%10!=0) {
					System.out.println("입력 오류, 지폐 및 동전을 넣어주세요.");
				}else {
					System.out.println(dto.getUserMoney()+"원을 넣었습니다.");
					break;
				}
			}catch (Exception e) {
				System.out.println("입력 오류, 지폐 및 동전을 넣어주세요.");
			}
		}
		return dto.getUserMoney();
	}
	String id, pw;
	int select;
	public int drinkSelect(JapangiDTO dto, JapangiDTO menu[]) {	//음료수 선택
		while(true) {
			try {
				System.out.println("음료수를 선택해주세요");
				display(menu);
				select=Integer.parseInt(sc().nextLine());
				if(select<=menu.length&&select>=1) {
					break;
				}else {
					System.out.println("입력 오류 1~"+menu.length+"사이의 수를 입력하세요.");
				}
			}catch (Exception e) {
				System.out.println("입력 오류 1~"+menu.length+"사이의 수를 입력하세요.");
			}
		}
		return select;
	}
	int selectMoney;
	public int lack(JapangiDTO dto, JapangiDTO menu[]) {	//잔액 추가 입력
		while(dto.getUserMoney()<menu[select-1].getPrice()) {
			try {
				System.out.println("잔액이 부족합니다(현재 잔액 : "+dto.getUserMoney()+"원)");
				System.out.println(menu[select-1].getName()+"의 가격 : "+menu[select-1].getPrice()+"원");
				System.out.println("돈을 더 넣으시겠습니까?");
				System.out.println("1. O 2. X");
				selectMoney=Integer.parseInt(sc().nextLine());
				if(selectMoney==1) {
					try {
						System.out.println("금액을 넣어주세요");
						dto.setInputMoney(Integer.parseInt(sc().nextLine()));
						System.out.println("현재 잔액 : "+dto.getUserMoney()+"원");
						
					}catch (Exception e) {
						System.out.println("입력 오류, 지폐 및 동전을 넣어주세요.");
					}
				}else if(selectMoney==2) {
					System.out.println("잔돈을 반환합니다");
					changes(dto, menu);
					i=1;
					break;
					
				}else {
					System.out.println("1 또는 2를 입력해주세요");
				}
				
			}catch (Exception e) {
				System.out.println("1 또는 2를 입력해주세요");
			}
		}return dto.getUserMoney();
	}
	public void changes(JapangiDTO dto, JapangiDTO menu[]) {	//잔돈 반환
		System.out.println("잔돈 : " + dto.getUserMoney()+"원");
		int i10=10000;
		int i5=50000;
		while(i10>=10) {
			if(dto.getUserMoney()/i5==0) {
			}else {
			System.out.print(i5+"원 : "+dto.getUserMoney()/i5+"개 ");
			}
			dto.setUserMoney(dto.getUserMoney()-((dto.getUserMoney()/i5)*i5));
			i5/=10;
			if(dto.getUserMoney()/i10==0) {
			}else {
			System.out.print(i10+"원 : "+dto.getUserMoney()/i10+"개 ");
			}
			dto.setUserMoney(dto.getUserMoney()-((dto.getUserMoney()/i10)*i10));
			i10/=10;
		}System.out.println();
	}
	boolean isExit;
	public int exit(JapangiDTO dto, JapangiDTO menu[]) {	//음료수 출력
		System.out.println(menu[select - 1].getName() + "가 선택되었습니다.");
			if (menu[select - 1].getCount() > 0) { // 음료수 수량
				isExit = true;
			} else {
				isExit = false;
			}
			if (isExit) {
				menu[select - 1].setCount(menu[select - 1].getCount() - 1); // 음료수 수량 -1
				System.out.println(menu[select - 1].getName() + "가 나왔습니다.");
				dto.setUserMoney(dto.getUserMoney() - menu[select - 1].getPrice());
				changes(dto, menu);
			}
		else {
			while (menu[select-1].getCount() <1) {
				System.out.println("재고가 없습니다.");
				System.out.println(menu[select - 1].getName() + "가 아닌 다른 음료수를 선택해주세요.");
				final2(dto, menu);
				break;
			}
	}
	return menu[select-1].getCount();		
	}
	
	
	public void start1(JapangiDTO dto, JapangiDTO menu[]) {		//모드 선택 및 관리자 로그인
		while(true) {
			i=0;
			try {
		System.out.println("번호를 입력하세요");
		System.out.print("1. 관리자 모드 ");
		System.out.print("2. 자판기 종료 ");
		System.out.println("3. 자판기 실행");
		int number = Integer.parseInt(sc().nextLine());
		if(number==1) {
			System.out.println("관리자모드가 실행되었습니다.");
			while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("ID : ");
			id = sc().nextLine();
			System.out.print("password : ");
			pw = sc().nextLine();
				if(id.equals("master")&&pw.equals("admin")) {
					System.out.println("로그인 성공");
					start2(dto, menu);
					break;
				}else {
					System.out.println("로그인 실패 아이디와 비밀번호를 다시 확인하세요.");
				}
			}
		}else if(number==2) {
			System.out.println("자판기를 종료합니다.");
			break;
		}else if(number==3){
			System.out.println("자판기를 실행합니다.");
			final1(dto, menu);
		}
		else {
			System.out.println("입력 오류 1~3사이의 수를 입력하세요.");
		}
			}catch (Exception e) {
				System.out.println("입력 오류 1~3사이의 수를 입력하세요.");
			}
		}
	}
	int adSelect;
	public void start2(JapangiDTO dto, JapangiDTO menu[]) {	//관리자 모드
		while(true) {
			System.out.println("1. 음료 추가" + "\t" +"2. 음료 수정" + "\t" +"3. 음료 삭제" + "\t");
			try {
			adSelect=Integer.parseInt(sc().nextLine());
			if(adSelect==1) {
				System.out.println("====음료 추가====");
				ad1(dto, menu);
				break;
			}else if(adSelect==2) {
				System.out.println("====음료 수정====");
				ad2(dto, menu);
				break;
			}else if(adSelect==3) {
				System.out.println("====음료 삭제====");
				ad3(dto, menu);
				break;
			}else {
				System.out.println("입력오류, 1~3사이의 수를 입력하세요");
			}
		}catch (Exception e) {
			System.out.println("입력오류, 1~3사이의 수를 입력하세요");
		}
		}
			}
	public void ad1(JapangiDTO dto, JapangiDTO menu[]) {	//음료 추가
		display(menu);
		int price;
		int count;
		System.out.println("추가할 음료수의 이름, 가격, 재고를 차례로 입력해주세요.");
		JapangiDTO[] menu1 = new JapangiDTO[menu.length+1];
		for(int i=0;i<menu.length;i++) {
			menu1[i] = new JapangiDTO(menu[i].getNum(), menu[i].getName(), menu[i].getPrice(), menu[i].getCount());
		}
		System.out.print("이름 : ");
		String name = sc().nextLine();
		while(true) {
			try {
		System.out.print("가격 : ");
		price = Integer.parseInt(sc().nextLine());
		if(price>=0&&price%10==0) {
		break;
		}else {
			System.out.println("입력 오류 동전이나 지폐로 계산할 수 있는 가격을 적어주세요.");
		}
			}catch (Exception e) {
				System.out.println("입력 오류 동전이나 지폐로 계산할 수 있는 가격을 적어주세요.");
			}
		}
		while(true) {
			try {
		System.out.print("재고 : ");
		count = Integer.parseInt(sc().nextLine());
		if(count>=0) {
		break;
		}else {
			System.out.println("입력 오류 0이상의 자연수를 입력하세요.");
		}
			}catch (Exception e) {
				System.out.println("입력 오류 0이상의 자연수를 입력하세요.");
			}
		}
		System.out.println("변경된 자판기 메뉴 : ");
		menu1[menu1.length-1] = new JapangiDTO(menu[menu.length-1].getNum()+1, name, price, count);
		menu = new JapangiDTO[menu.length+1];
		for(int i=0;i<menu.length;i++) {
			menu[i] = new JapangiDTO(menu1[i].getNum(), menu1[i].getName(), menu1[i].getPrice(), menu1[i].getCount());
		}
		display(menu);
	}
	
	public void ad2(JapangiDTO dto, JapangiDTO menu[]) { // 음료 수정
		display(menu);
			System.out.println("수정할 음료수의 번호를 입력해주세요.");
			while(true){
				try {
			int number = Integer.parseInt(sc().nextLine())-1;
			if (number >= 0&&number<menu.length) {
				System.out.print("이름 : "+menu[number].getName()+ "->" );
				menu[number].setName(sc().nextLine());
				while(true) {
					try {
				System.out.print("가격 : "+menu[number].getPrice()+ "->");
				int price = Integer.parseInt(sc().nextLine());
				if(price>=0&&price%10==0) {
				menu[number].setPrice(price);
				break;
					}else {
						System.out.println("입력 오류 동전이나 지폐로 계산할 수 있는 가격을 적어주세요.");
					}
					}catch (Exception e) {
						System.out.println("입력 오류 동전이나 지폐로 계산할 수 있는 가격을 적어주세요.");
					}
				}
				while(true) {
					try {
				System.out.print("재고 : "+menu[number].getCount()+ "->");
				int count = Integer.parseInt(sc().nextLine());
				if(count>=0) {
				menu[number].setCount(count);
				break;
					}else {
						System.out.println("입력 오류 0이상의 자연수를 입력하세요.");
					}
					}catch (Exception e) {
						System.out.println("입력 오류 0이상의 자연수를 입력하세요.");
					}
				}
				display(menu);
				break;
				}
			else {
				System.out.println("입력 오류, 1~"+menu.length+"사이의 수를 입력하세요.");
			}
	}catch (Exception e) {
				System.out.println("입력 오류, 1~"+menu.length+"사이의 수를 입력하세요.");
			}
			}
	}
	public void ad3(JapangiDTO dto, JapangiDTO menu[]) {//음료수 삭제
		display(menu);
		System.out.println("삭제할 음료수의 번호를 입력해주세요");
		while(true) {
			try {
		int number=Integer.parseInt(sc().nextLine())-1;
		if(number>=0&&number<menu.length) {
			JapangiDTO[] menu1 = new JapangiDTO[menu.length-1];
			for(int i=number+1;i<menu.length;i++) {
				menu1[i-1] = new JapangiDTO(menu[i].getNum()-1, menu[i].getName(),menu[i].getPrice(),menu[i].getCount());
			}
			if(number+1==menu.length) {
				for(int i =0;i<menu.length-1;i++) {
					menu1[i]= menu[i];
				}menu = new JapangiDTO[menu1.length];
				for(int i =0;i<menu.length;i++) {
					menu[i]=menu1[i];
				}
			}else {
			menu = new JapangiDTO[menu1.length];
			for(int i=0;i<menu.length;i++) {
				menu[i] = new JapangiDTO(menu1[i].getNum(), menu1[i].getName(),menu1[i].getPrice(),menu1[i].getCount());
			}
			}
			display(menu);
			break;
		}else {
			System.out.println("입력 오류 1~"+menu.length+"사이의 수를 입력하세요.");
		}
			}catch (Exception e) {
				System.out.println("입력 오류 1~"+menu.length+"사이의 수를 입력하세요.");
			}
		}
		
	}
	public void final1(JapangiDTO dto, JapangiDTO menu[]) {
		display(menu);
		inputCoin(dto);
		drinkSelect(dto, menu);
		lack(dto, menu);
		if(i==0) {
			exit(dto, menu);
		}
	}
	public void final2(JapangiDTO dto, JapangiDTO menu[]) {
		drinkSelect(dto, menu);
		lack(dto, menu);
		if(i==0) {
			exit(dto, menu);
		}
	}
}