package pack03.mysqlplus;

import java.util.Scanner;

public class SqlPlusMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" SbnSqlPlus �Դϴ�. ");
		System.out.println(" ����ڸ��� �Է� : ");
		String user = sc.nextLine();
		System.out.println(" ��й�ȣ�� �Է� : ");
		String password = sc.nextLine();
		SqlDAO dao = new SqlDAO();
		dao.checkConnection(user, password);
		if(dao.checkConnection(user, password)) {
			System.out.println(" sql�� �Է� > ");
			String sql = sc.nextLine();
			dao.sendSql(sql);
		}else {
			System.out.println(" ���ᰡ �Ǹ� �ȴ�. ");
		}
	}
}