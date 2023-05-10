package pack02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class EmpDAO {//���� �����ͺ��̽��� �����Ͽ� �䱸���� ó�� �� ����
	private Connection conn; //���ᰴü
	private PreparedStatement ps; //���� ���� ��ü
	private ResultSet rs; //��� ��ü
	
	//�����ͺ��̽� ������ �ϳ��� ������� ����� ��Ȱ�� (�����ϸ� �� ���� => ps�� ����Ѵ�.)
	public Connection getConn() {
		//���ӽ��ʿ��Ѱ� : �����ּ�(url), ����(user), ��ȣ(password)
		String url = "jdbc:oracle:thin:@127.0.01:1521:xe";
		String user = "hr";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

	public void testDb() {
		conn = getConn(); //���ᰴü �ʱ�ȭ
		String sql = " select 1 test from dual";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("���� ��� : "+rs.getInt("test"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//data�� �׽�Ʈ�� �������� row(��)������ 1�̾��� => 107
	public ArrayList<EmpDTO> selectEmp() {
		conn = getConn();
		String sql = " select EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME name, EMAIL FROM employees ";
		ArrayList<EmpDTO> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO(rs.getInt("EMPLOYEE_ID"), rs.getString("name"), rs.getString("EMAIL"));
				list.add(dto);
//				list.add(new EmpDTO(rs.getInt("Employee_id"), rs.getString("name"), rs.getString("EMAIL")));
				System.out.println(dto.getEmployee_id()+""+dto.getName()+""+dto.getEmail());
			}
			System.out.println(list.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



}