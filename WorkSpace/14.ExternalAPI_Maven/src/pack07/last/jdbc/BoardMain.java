package pack07.last.jdbc;

import java.util.Scanner;

public class BoardMain {
	//main -> html, jsp, android appȭ�� ���� ���� ����� ���� ���̴� ����ȭ��
	public void displayMenu() {
		System.out.println("�Խ��� ���α׷�.");
		System.out.println("====�޴�====");
		System.out.println("�Խñ� ��ȸ : S"); //select => Create
		System.out.println("�Խñ� �߰� : I"); //insert => Read
		System.out.println("�Խñ� ���� : U"); //update
		System.out.println("�Խñ� ���� : D"); //delete
		System.out.println("���� : E");
		System.out.println("============");
	}
	// static ����� ���� �޸𸮿� �ε��Ǿ���ϱ� ������ ���� static ����� ����ų�,
	// �ƴϸ� Ŭ������ �ν��Ͻ�ȭ�Ͽ� static ����� �޸� ������ �÷��� ����Ѵ�.
	
	
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
//		dao.selectList();
		// ��밡�� �˻��� ������ ���� ����� �����ֱ�
		Scanner sc = new Scanner(System.in);
		dao.selectList(sc.nextLine());
//		dao.insertBoard();
		
		
		
		
		
		
//		BoardMain main = new BoardMain();
//		main.displayMenu();
		
//		Scanner sc = new Scanner(System.in);
//		String testMenu = sc.nextLine();
//		System.out.println(testMenu);
		// ==============���߿� ��� �Ϸ� �� ������ �����ϰ� �ݺ����� ���ؼ� �ݺ���Ŵ.
		// BoardDTO, BoardDAO(Class �߰��� ��)
		
		
	}
}