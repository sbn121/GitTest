package test01_oop1;

import java.util.Scanner;

public class JapangiDAO {
	
	JapangiDTO[] drinkArr;
	
	public JapangiDAO() {
		drinkArr = initDrink();
	}
	
	//���� ����� ���� DrinkDTO[] �迭�� �ʱ�ȭ�ϴ� �޼ҵ带 �ۼ��غ���.
	public JapangiDTO[] initDrink() {
		JapangiDTO[] drinkArr = new JapangiDTO[3];
		drinkArr[0] = new JapangiDTO("�ݶ�", 800, 7);
		drinkArr[1] = new JapangiDTO("���̴�", 1000, 5);
		drinkArr[2] = new JapangiDTO("ȯŸ", 900, 1);
		
		return drinkArr;
	}
	
	public void display() {
		System.out.println("�����\t����\t����");
		for(int i=0; i<drinkArr.length; i++) {
			System.out.print((i+1)+"."+drinkArr[i].getName()+"\t");
			System.out.print(drinkArr[i].getPrice()+"\t");
			System.out.print(drinkArr[i].getCnt());
			System.out.println();
		}
	}
	
	//����ڰ� ���ڸ� �Է��ϰ� �ϴ� �޼ҵ�
	//1. ����ڴ� ���� �ܿ� ���� �Է��� �� ���� => ����

	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		try {
		int rtnInt = Integer.parseInt(sc.nextLine());
		return rtnInt;
		}catch (Exception e) {
			System.out.println("���� ���� �Է����ּ���.");
		}
		}
		 
	}
	//inputInt��� �޼ҵ带 Ȱ���ϸ� int�� �����͸� �Է��� ���� �� ����.
	//�̸� Ȱ���ؼ� 2�� �ݾ����� �����Ǵ� ���� �Է¸� �ǰ� ���� ����
	//2. �ݾ����� �����Ǵ� ������ �Է��ؾ���. 10, 50, 100, 500, 1000
	int[] coinArr = {1000, 500, 100, 50, 10};
	public int inputMoney() { 
		while(true) {
		int money = inputInt();	//����ڴ� ������ �����Է��� ��.
		int tempMoney = money;
		int charge = money;
		for(int i=0;i<coinArr.length;i++) {
			tempMoney = charge/coinArr[i];
			charge = charge%coinArr[i];
//			System.out.println(coinArr[i]+"����"+tempMoney+" "+charge);
			if(charge==0) {
				break;
			}
		}
		if(charge!=0) {
		System.out.println(money+"��ȯ��. �ݾ��Է��� �ٽ����ּ���");
		}else {
		return money;
		}
		}
	}
	
	public int choiceMenu() {
		while(true) {
			int choice = inputInt();
		if(choice>0&&choice<=drinkArr.length) {
			if(drinkArr[choice-1].getCnt()<1) {
				System.out.println("������ ����� �����ϴ�. �ٸ� ���Ḧ �������ּ���");
				continue;
			}
			System.out.println(drinkArr[choice-1].getName()+"�ֹ���");
			return choice;
		}else {
			System.out.println("�߸��Էµ� 1~"+drinkArr.length+"������ ���� ����");
		}
		}
	}
	
	//money(�Էµ� �ݾ��� �˾ƾ� ��)
	//�󸶸� �����ؾ� �ϴ��� �޴��� ���� ������ �־�� ��.
	//DTO �� ���� �޾ƿͼ� ó��
	//index�� �޾ƿͼ� ó��
	//index, Arr�� �޾ƿͼ� ó��
	public int orderMenu(int choice, int money) {
		//�ݾ��� ������ ��쿡�� ������ ��������� �ұ�
		
		if(money>=drinkArr[choice-1].getPrice()) {
			drinkArr[choice-1].setCnt(drinkArr[choice-1].getCnt()-1);
			System.out.println(drinkArr[choice-1].getName()+"�ֹ��Ϸ�");
			return money - drinkArr[choice-1].getPrice();
		}else {
			System.out.println(money+"��ȯ�� �ݾ׺��� �ٽ� �̿��ϼ���");
			return -1;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}