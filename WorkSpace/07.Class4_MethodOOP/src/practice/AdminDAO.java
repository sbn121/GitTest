package practice;

import java.util.Scanner;

public class AdminDAO {
	public boolean adminLogin() {
		int count =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(count==3) {
				System.out.println("�õ�Ƚ�� 3ȸ�� �ʰ��Ͽ� ���θ޴��� �̵��մϴ�.");
				return false;
			}
			count++;
			String id = sc.nextLine();
			String pw = sc.nextLine();
			if(id.equals("master")&&pw.equals("admin")) {
				return true;
			}else {
				System.out.println("���̵� �Ǵ� �н����带 �Է��ϼ���.");
			}
		}
	}
	
	public void addMenu(JapangiDAO dao) {
		dao.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �̸� �Է� : ");
		String name = sc.nextLine();
		System.out.println("������ ���� �Է� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("������ ���� �Է� : ");
		int cnt = Integer.parseInt(sc.nextLine());
		JapangiDTO dto = new JapangiDTO(name, price, cnt);
		JapangiDTO[] tempArrs = new JapangiDTO[dao.drinkArr.length+1];
		for(int i=0;i<dao.drinkArr.length;i++) {
			tempArrs[i]=dao.drinkArr[i];
		}
		tempArrs[tempArrs.length-1]=dto;
		dao.drinkArr = tempArrs;
	}
}
