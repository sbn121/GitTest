package test02_oop2;

public class LottoMain {
	public static void main(String[] args) {
		LottoDAO dao = new LottoDAO();
		
		
		while(true) {
			System.out.println("������ �ζ��� ������ �Է����ּ���.");
			dao.inputNum();
			if(dao.inputNum()>0) {
				System.out.println(dao.inputNum()+"���� �����߽��ϴ�.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}