package pack_fifa;

import java.util.ArrayList;

public class FIFADAO {
	
	ArrayList<FIFADTO> myList = new ArrayList<>();
	
	
	
	public void searchMyPlayer() {
		for(int i=0; i<myList.size(); i++) {
			System.out.print("��ȣ : "+myList.get(i).getPlayer_num());
			System.out.print("�̸� : "+myList.get(i).getPlayer_name());
			System.out.print("���� : "+myList.get(i).getPlayer_age());
			System.out.print("Ű : "+myList.get(i).getHeight());
			System.out.print("�ֹ� : "+myList.get(i).getMain_foot());
			System.out.print("��ȣ : "+myList.get(i).getPosition());
			System.out.println();
		}
	}
	
	public void formation() {
		System.out.println("�����̼��� �������ּ���");
		System.out.println("1�� 4-2-3-1\t2�� 4-2-2-1-1\t3�� 4-2-2-2\t4�� 5-2-3");
		System.out.println("     ��    \t      ��    \t   ��   ��  \t��   ��   ��");
		System.out.println("  ��  ��  �� \t      ��    \t ��       ��\t  ��   ��");
		System.out.println(" ��  �� ��  ��\t   ��     �� \t   ��   ��  \t�� �� �� �� ��");
		System.out.println("     ��    \t  ��  �� ��  ��\t ��  �� ��  ��\t    ��");
		System.out.println("          \t      ��    \t     ��    ");
//		System.out.println("��   ��   ��");
//		System.out.println("  ��   ��");
//		System.out.println("�� �� �� �� ��");
//		System.out.println("    ��");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}