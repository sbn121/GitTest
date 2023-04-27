package pack04.db;

public class HtmlMain {
	public static void main(String[] args) {
//		DataAccessObject dao = new MysqlDAO();
		dbWork(new MysqlDAO());
		dbWork(new OracleDAO());
	}
	
	//Oracle �Ǵ� Mysql�� �Է¹޾� select~delete�ϴ� �޼ҵ�
	public static void dbWork(DataAccessObject dao) {
			
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
	}
}
