package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner (�Է�)=> �ڹ� (���)=> �ܼ�â
		Scanner sc = new Scanner(System.in);//Ŭ������ �ʱ�ȭ��
		// �ܺο��� ������ �����͸� ����غ��� ���ؼ� �ܿ��� ��� o
		System.out.println("����� ����?");
		String inputData = sc.nextLine();
		System.out.println("������� �Դ���?");
		System.out.println(inputData);
		int i1 = Integer.parseInt(inputData)+10;
		System.out.println(i1);
	}

}
