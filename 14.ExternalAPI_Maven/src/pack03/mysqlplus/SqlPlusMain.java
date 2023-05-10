package pack03.mysqlplus;

import java.util.Scanner;

public class SqlPlusMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" SbnSqlPlus 입니다. ");
		System.out.println(" 사용자명을 입력 : ");
		String user = sc.nextLine();
		System.out.println(" 비밀번호를 입력 : ");
		String password = sc.nextLine();
		SqlDAO dao = new SqlDAO();
		dao.checkConnection(user, password);
		if(dao.checkConnection(user, password)) {
			System.out.println(" sql문 입력 > ");
			String sql = sc.nextLine();
			dao.sendSql(sql);
		}else {
			System.out.println(" 종료가 되면 된다. ");
		}
	}
}
