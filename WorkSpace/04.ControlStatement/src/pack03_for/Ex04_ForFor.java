package pack03_for;

import java.util.Scanner;

public class Ex04_ForFor {
	public static void main(String[] args) {
		//����� �����ϰ� ��ø�� �����ϴ�(����x).
//		for(int i = 1;i<=10;i++) {
//			System.out.println("i "+i);
//		for(int j = 1; j<=10; j++) {
//			System.out.println("j "+j);
//			}
//		}
// 2�̸��� ���ڸ� �Է��ϸ� �������� ���x => �߸��ȼ��� ��� �ܼ�â�� ��¸���.
// 2�̻��� ���ڰ� �Է� �Ǹ� �ش��ϴ� �ܱ����� �������� ����ϱ�. 
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if(num<2) {
			System.out.println("����");
		}else {
		for(int i = 2;i<=num;i++) {
			System.out.println();
			for(int j = 1; j<10; j++) {
				System.out.print(i+"x"+j+"="+i*j+" ");
				}
			System.out.println();
			}
		}
//		System.out.println(��);
//		System.out.println(�ڡ�);
//		System.out.println(�ڡڡ�);
//		System.out.println(�ڡڡڡ�);
//		System.out.println(�ڡڡڡڡ�);
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("��");
				}System.out.println();
			}
			for(int i=5;i<=5&&i>0;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("��");
				}System.out.println();
			}
		
			
		}
}