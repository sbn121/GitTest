package practice;

import java.util.Scanner;

public class JapangiDAO {
	
	JapangiDTO[] drinkArr;
	
	public JapangiDAO() {
		drinkArr = initDrink();
	}
	
	public JapangiDTO[] initDrink() {
		JapangiDTO[] drinkArr = new JapangiDTO[3];
		drinkArr[0] = new JapangiDTO("콜라", 800, 7);
		drinkArr[1] = new JapangiDTO("사이다", 1000, 5);
		drinkArr[2] = new JapangiDTO("환타", 900, 1);
		return drinkArr;
	}
	
	public void display() {
		System.out.println("음료명\t가격\t개수");
		for(int i =0;i<drinkArr.length;i++) {
			System.out.print((i+1)+". "+drinkArr[i].getName()+"\t");
			System.out.print(drinkArr[i].getPrice()+"\t");
			System.out.print(drinkArr[i].getCnt());
			System.out.println();
		}
	}
	
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			}catch (Exception e) {
				System.out.println("숫자 값만 입력해주세요.");
			}
		}
	}
	
	int[] coinArr = {1000, 500, 100, 50, 10};
	public int inputMoney() {
		while(true) {
			int money = inputInt();
			int tempMoney = money;//개수
			int charge = money;//잔돈
			for(int i=0;i<coinArr.length;i++) {
				tempMoney = charge/coinArr[i];
				charge = charge%coinArr[i];
				if(charge==0) {
					break;
				}
			}if(charge!=0) {
				System.out.println(money+"반환됨. 금액을 다시 입력해주세요.");
			}else {
				return money;
			}
		} 
	}
	public int choiceMenu() {
		while(true) {
			int choice = inputInt();
			if(choice>0&&choice<drinkArr.length) {
				if(drinkArr[choice-1].getCnt()<1) {
					System.out.println("음료의 재고가 없습니다. 다른 음료를 선택해주세요.");
					continue;
				}
				System.out.println(drinkArr[choice-1].getName()+"주문됨");
				return choice;
			}else {
				System.out.println("잘못입력됨 1~"+drinkArr.length+"까지 입력");
			}
		}
	}
	
	public int orderMenu(int choice, int money) {
		if(money>=drinkArr[choice-1].getPrice()) {
			drinkArr[choice-1].setCnt(drinkArr[choice-1].getCnt()-1);
			System.out.println(drinkArr[choice-1].getName()+"주문완료");
			return money-drinkArr[choice-1].getPrice();
		}else {
			System.out.println(money+"반환됨, 금액부족 다시 이용하세요.");
			return -1;
		}
	}
	
	
	
	
	
	
	
	
	
}
