package pack02.jdbc;

import java.sql.SQLException;

public class Ex02_EmployeeMain {
	//�� ���α׷��� �����ͺ��̽��� �����ؼ� ����� ���, �̸�, �̸����� ��ȸ�ϴ� ���α׷��̴�.
	//����� ���(number == int), �̸� String, �̸��� String�� �ϳ��� ������ ���� �����̴� ��������.(EmpDTO)
	//SqlDev�� ����ؼ� �ڹ��ڵ�� �������� �ۼ��Ͽ� �����ϰ� ����� �޾ƿ�. (EmpDAO)
	//Connection(����), Statement(����, ����), ResultSet(���)
	public static void main(String[] args) throws SQLException {
		EmpDAO dao = new EmpDAO();
//		dao.testDb();
		dao.selectEmp();
	}
}
